package org.gwtproject.i18n.cldr.generator;

import com.ibm.icu.util.ULocale;
import org.apache.commons.io.FileUtils;
import org.gwtproject.i18n.cldr.generator.generators.CurrencyListGenerator;
import org.gwtproject.i18n.cldr.generator.model.Ldml;
import org.gwtproject.i18n.cldr.generator.model.Ldml_XMLMapperImpl;
import org.treblereel.gwt.xml.mapper.api.DefaultXMLDeserializationContext;
import org.treblereel.gwt.xml.mapper.api.XMLDeserializationContext;

import javax.xml.stream.XMLStreamException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Currency;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/10/21
 */
public class CdlrGenerator {

    private final static Ldml_XMLMapperImpl mapper = Ldml_XMLMapperImpl.INSTANCE;

    private CurrencyListGenerator generator;

    public static Map<Currency, Locale> getCurrencyLocaleMap() {
        Map<Currency, Locale> map = new HashMap<>();
        for (Locale locale : Locale.getAvailableLocales()) {
            try {
                Currency currency = Currency.getInstance(locale);
                map.put(currency, locale);
            }
            catch (Exception e){
                // skip strange locale
            }
        }
        return map;
    }

    public static void main(String[] args) throws IOException {
        new CdlrGenerator();
    }
    public CdlrGenerator() throws IOException {

        URL main = CdlrGenerator.class.getClassLoader().getResource("org/gwtproject/i18n/cldr/common/main/");

        File file = FileUtils.toFile(main);
        //System.out.println("F  " + file);

        Map<String, Node> temp = new TreeMap<>();

        List<String> locales = Arrays.stream(file.listFiles()).map(e -> e.getName().replace(".xml", "")).sorted(String::compareToIgnoreCase).collect(Collectors.toList());


        locales.forEach(e -> {
            if (!e.equals("root")) {
                String[] t = e.split("_");
                if (t.length == 1) {
                    temp.put(e, new Node(e, null));
                } else {
                    Node parent = temp.get(t.length == 2 ? t[0] : t[0] + "_" + t[1]);
                    Node node = new Node(e, parent);
                    parent.children.add(node);
                    temp.put(e, node);
                }
            }

        });

        generator = new CurrencyListGenerator(temp);

        temp.forEach((k, v) -> {
            if (v.parent == null) {
                System.out.println(k);

            } else {
                if (v.parent.parent == null) {
                    System.out.println(" " + k);
                } else {
                    System.out.println("  " + k);
                }
            }

        });

        //String xml = org.apache.commons.io.IOUtils.toString(inputStream, Charset.defaultCharset());

        System.out.println("total locales        " + locales.size());
        System.out.println("total locales merged " + temp.size());

        double started = System.currentTimeMillis();

        temp.forEach((k, v) -> {
                //process(v);
        });

        double end = System.currentTimeMillis();
        System.out.println("overall processing time : " + (end - started) / 1000 + " seconds");



        process(temp.get("ru"));

    }

    private void process(Node node) {
        System.out.println("started " + node.name);
        double started = System.currentTimeMillis();

        InputStream inputStream = CdlrGenerator.class.getClassLoader().getResourceAsStream("org/gwtproject/i18n/cldr/common/main/" + node.name + ".xml");

        XMLDeserializationContext context = DefaultXMLDeserializationContext.builder().failOnUnknownProperties(false).build();

        try {
            String xml = org.apache.commons.io.IOUtils.toString(inputStream, Charset.defaultCharset());
            Ldml result = mapper.read(xml);
            generator.generate(result, node);

            double end = System.currentTimeMillis();

            System.out.println(node.name + " processed in " + (end - started) / 1000 + " seconds");

        } catch (IOException e) {
            e.printStackTrace();
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }

    }

    public static class Node {

        final public String name;
        final public Node parent;
        final public Set<Node> children = new HashSet<>();

        Node(String name, Node parent) {
            this.name = name;
            this.parent = parent;
        }

    }

}
