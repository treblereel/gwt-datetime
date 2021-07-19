package org.gwtproject.i18n.cldr.generator.generators;

import org.gwtproject.i18n.cldr.generator.CdlrGenerator;
import org.gwtproject.i18n.cldr.generator.model.Ldml;
import org.joda.money.CurrencyUnit;

import java.util.Currency;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/12/21
 */
public class CurrencyListGenerator {

    private final static String newLine = System.lineSeparator();
    private final static Map<Currency, Locale> locales = new HashMap<>();
    private static final String HEADER = "/*\n" +
            " * Copyright © 2021 The GWT Authors\n" +
            " *\n" +
            " * Licensed under the Apache License, Version 2.0 (the \"License\");\n" +
            " * you may not use this file except in compliance with the License.\n" +
            " * You may obtain a copy of the License at\n" +
            " *\n" +
            " *     http://www.apache.org/licenses/LICENSE-2.0\n" +
            " *\n" +
            " * Unless required by applicable law or agreed to in writing, software\n" +
            " * distributed under the License is distributed on an \"AS IS\" BASIS,\n" +
            " * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\n" +
            " * See the License for the specific language governing permissions and\n" +
            " * limitations under the License.\n" +
            " */";

    static {
        for (Locale locale : Locale.getAvailableLocales()) {
            try {
                Currency currency = Currency.getInstance(locale);
                locales.put(currency, locale);
            } catch (Exception e) {
                // skip strange locale
            }
        }
    }

    private Map<String, CurrencyUnit> cache = new HashMap<>();
    private Map<String, CdlrGenerator.Node> nodes;

    public CurrencyListGenerator(Map<String, CdlrGenerator.Node> temp) {
        this.nodes = temp;

        List<CurrencyUnit> currencyUnits = CurrencyUnit.registeredCurrencies();



        Set<Currency> currencies = Currency.getAvailableCurrencies();
        currencyUnits.forEach(c -> {
            System.out.println("ADD " + c);
            cache.put(c.getCode(), c);

        });
    }

    private Currency getCurrency(CdlrGenerator.Node node) {
        System.out.println("getCurrency " + node.name);
        Locale locale = new Locale("EN", node.name);
        Currency currency;
        try {
             currency = Currency.getInstance(locale);
        } catch (IllegalArgumentException e) {
            if(node.parent != null) {
                currency = getCurrency(node.parent);
            } else {
                return null;
            }

        }
        return currency;
    }

    public void generate(Ldml result, CdlrGenerator.Node node) {
        Currency currency = getCurrency(node);
        String symbol = getSymbol(node);

        System.out.println("Do generate " + node.name);
        StringBuffer sb = new StringBuffer();
        sb.append(HEADER);
        sb.append(newLine);
        sb.append(newLine);
        sb.append("import java.util.HashMap;").append(newLine);
        sb.append("import org.gwtproject.i18n.shared.cldr.CurrencyData;").append(newLine);
        sb.append("import org.gwtproject.i18n.shared.cldr.CurrencyDataImpl;").append(newLine);
        sb.append("import org.gwtproject.i18n.shared.cldr.CurrencyList;").append(newLine);
        sb.append(newLine);
        sb.append(newLine);
        sb.append("public class CurrencyList").append(node.name);
        sb.append(" extends CurrencyList {").append(newLine);
        sb.append("  public CurrencyData getDefault() {").append(newLine);
        sb.append("    return new CurrencyDataImpl(");
        sb.append("\"").append(currency.getCurrencyCode()).append("\"").append(",");
        sb.append("\"").append(symbol).append("\"").append(",");
        sb.append(currency.getDefaultFractionDigits()).append(",");
        sb.append("\"").append(symbol).append("\"").append(",");
        sb.append("\"").append(symbol).append("\"").append(");");
        sb.append(newLine);
        sb.append("  }").append(newLine);
        sb.append("}").append(newLine);
        sb.append(newLine);
        sb.append(newLine);


        sb.append("  protected HashMap<String, CurrencyData> loadCurrencyMap() {").append(newLine);
        sb.append("    HashMap<String,CurrencyData> result = super.loadCurrencyMap();").append(newLine);

        result.getNumbers().getCurrencies().forEach(c -> {

            System.out.println("c " + c.getType());
            CurrencyUnit currency1 = cache.get(c.getType());

            sb.append("    result.put(\"").append(c.getType()).append("\"").append(",");
            sb.append("\"").append(c.getType()).append("\"").append(",");
            sb.append("\"").append(currency1.getDecimalPlaces()).append("\"").append(",");
            sb.append("\"").append(c.getType()).append("\"").append(",");
            sb.append("\"").append(c.getType()).append("\"").append(");");
            sb.append(newLine);
        });

        sb.append("    result.put(\"");
        //sb.append()
        sb.append("    result.put(\"ADP\", new CurrencyDataImpl(\"ADP\",\"ADP\",128,\"ADP\",\"ADP\"));").append(newLine);


        System.out.println(sb);


    }

    private String getSymbol(CdlrGenerator.Node node) {
        return getCurrency(node).getSymbol(getCurrencyLocaleMap().get(getCurrency(node)));
    }

    public static Map<Currency, Locale> getCurrencyLocaleMap() {
        Map<Currency, Locale> map = new HashMap<>();
        for (Locale locale : Locale.getAvailableLocales()) {
            try {
                Currency currency = Currency.getInstance(locale);
                map.put(currency, locale);
            } catch (Exception e) {
                // skip strange locale
            }
        }
        return map;
    }

    private String getSymbol(String locale) {
        CdlrGenerator.Node node = nodes.get(locale);
        return getCurrency(node).getSymbol(getCurrencyLocaleMap().get(locale));
    }

}
