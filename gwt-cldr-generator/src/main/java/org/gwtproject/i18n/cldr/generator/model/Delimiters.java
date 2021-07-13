package org.gwtproject.i18n.cldr.generator.model;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/10/21
 */
public class Delimiters {

    private String quotationStart;
    private String quotationEnd;
    private String alternateQuotationStart;
    private String alternateQuotationEnd;

    public String getQuotationStart() {
        return quotationStart;
    }

    public void setQuotationStart(String quotationStart) {
        this.quotationStart = quotationStart;
    }

    public String getQuotationEnd() {
        return quotationEnd;
    }

    public void setQuotationEnd(String quotationEnd) {
        this.quotationEnd = quotationEnd;
    }

    public String getAlternateQuotationStart() {
        return alternateQuotationStart;
    }

    public void setAlternateQuotationStart(String alternateQuotationStart) {
        this.alternateQuotationStart = alternateQuotationStart;
    }

    public String getAlternateQuotationEnd() {
        return alternateQuotationEnd;
    }

    public void setAlternateQuotationEnd(String alternateQuotationEnd) {
        this.alternateQuotationEnd = alternateQuotationEnd;
    }

    @Override
    public String toString() {
        return "Delimiters{" +
                "quotationStart='" + quotationStart + '\'' +
                ", quotationEnd='" + quotationEnd + '\'' +
                ", alternateQuotationStart='" + alternateQuotationStart + '\'' +
                ", alternateQuotationEnd='" + alternateQuotationEnd + '\'' +
                '}';
    }
}
