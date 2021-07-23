package org.treblereel;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.Date;
import java.util.stream.Collectors;

import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLTableCellElement;
import elemental2.dom.HTMLTableElement;
import elemental2.dom.HTMLTableRowElement;
import jsinterop.base.Js;
import org.gwtproject.i18n.client.DateTimeFormat;
import org.gwtproject.i18n.client.NumberFormat;
import org.gwtproject.i18n.shared.cldr.I18N;
import org.gwtproject.i18n.shared.cldr.LocaleInfo;
import org.gwtproject.i18n.shared.cldr.impl.LocaleInfoFactory;
import org.jresearch.threetenbp.gwt.time.client.Support;

@I18N({"en", "es", "de", "fr", "it", "ru", "ar_BH"})
public class App {

    private HTMLTableElement tableElement;
    private HTMLTableCellElement r1td2;
    private HTMLTableCellElement r2td2;
    private HTMLTableCellElement r3td2;
    private HTMLTableCellElement r4td2;
    private HTMLTableCellElement r5td2;
    private HTMLTableCellElement r6td2;
    private HTMLTableCellElement r7td2;
    private HTMLTableCellElement r8td2;
    private HTMLTableCellElement r9td2;
    private HTMLTableCellElement r10td2;
    private Date today = new Date();
    private double value = 12345.6789;

    public void onModuleLoad() {

        Support.init();

        LocalDate currentDate = LocalDate.now();

        DomGlobal.console.log("size " + LocaleInfoFactory.holder.size);
        DomGlobal.console.log("currentDate " + currentDate);


        tableElement = (HTMLTableElement) DomGlobal.document.createElement("table");
        tableElement.style.width = Js.uncheckedCast("40%");
        DomGlobal.document.body.appendChild(tableElement);

        r1td2 = addRow("locale name");
        r2td2 = addRow("Currency");
        r3td2 = addRow("isRTL");
        r4td2 = addRow("week");
        r5td2 = addRow("ShortDateFormat");
        r6td2 = addRow("FullDateFormat");
        r7td2 = addRow("ScientificFormat");
        r8td2 = addRow("DecimalFormat");
        r9td2 = addRow("java.time : LocalDate");
        r10td2 = addRow("java.time : ZoneId.of(\"UTC+3\")");

        updateLocaleTable();
    }

    private HTMLTableCellElement addRow(String name) {
        HTMLTableRowElement r = (HTMLTableRowElement) DomGlobal.document.createElement("tr");
        HTMLTableCellElement td1 = (HTMLTableCellElement) DomGlobal.document.createElement("td");
        HTMLTableCellElement td2 = (HTMLTableCellElement) DomGlobal.document.createElement("td");
        r.appendChild(td1);
        r.appendChild(td2);
        tableElement.append(r);

        td1.textContent = name;
        return td2;
    }

    private void updateLocaleTable() {

        LocaleInfo localeInfo = LocaleInfo.getCurrentLocale();
        r1td2.textContent = localeInfo.getLocaleName();
        r2td2.textContent = localeInfo.getNumberConstants().defCurrencyCode();
        r3td2.textContent = String.valueOf(localeInfo.isRTL());
        r4td2.textContent = Arrays.stream(localeInfo.getDateTimeFormatInfo().weekdaysFullStandalone()).collect(Collectors.joining(", "));

        r5td2.textContent = DateTimeFormat.getShortDateFormat().format(today);
        r6td2.textContent = DateTimeFormat.getFullDateTimeFormat().format(today);

        r7td2.textContent = NumberFormat.getScientificFormat().format(value);
        r8td2.textContent = NumberFormat.getDecimalFormat().format(value);
        r9td2.textContent = LocalDate.now().toString();
        r10td2.textContent = ZoneId.of("UTC+3").toString();
    }
}
