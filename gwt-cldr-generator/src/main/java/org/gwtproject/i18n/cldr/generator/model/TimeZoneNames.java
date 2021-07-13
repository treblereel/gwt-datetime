package org.gwtproject.i18n.cldr.generator.model;

import java.util.List;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/12/21
 */
public class TimeZoneNames {

    private String hourFormat;
    private String gmtFormat;
    private String gmtZeroFormat;
    private String fallbackFormat;

    private List<RegionFormat> regionFormat;

    private List<Zone> zone;
    private List<Zone> metazone;

    public String getHourFormat() {
        return hourFormat;
    }

    public void setHourFormat(String hourFormat) {
        this.hourFormat = hourFormat;
    }

    public String getGmtFormat() {
        return gmtFormat;
    }

    public void setGmtFormat(String gmtFormat) {
        this.gmtFormat = gmtFormat;
    }

    public String getGmtZeroFormat() {
        return gmtZeroFormat;
    }

    public void setGmtZeroFormat(String gmtZeroFormat) {
        this.gmtZeroFormat = gmtZeroFormat;
    }

    public String getFallbackFormat() {
        return fallbackFormat;
    }

    public void setFallbackFormat(String fallbackFormat) {
        this.fallbackFormat = fallbackFormat;
    }

    public List<RegionFormat> getRegionFormat() {
        return regionFormat;
    }

    public void setRegionFormat(List<RegionFormat> regionFormat) {
        this.regionFormat = regionFormat;
    }

    @Override
    public String toString() {
        return "TimeZoneNames{" +
                "hourFormat='" + hourFormat + '\'' +
                ", gmtFormat='" + gmtFormat + '\'' +
                ", gmtZeroFormat='" + gmtZeroFormat + '\'' +
                ", fallbackFormat='" + fallbackFormat + '\'' +
                ", regionFormat=" + regionFormat +
                ", zone=" + zone +
                '}';
    }

    public List<Zone> getZone() {
        return zone;
    }

    public void setZone(List<Zone> zone) {
        this.zone = zone;
    }

    public List<Zone> getMetazone() {
        return metazone;
    }

    public void setMetazone(List<Zone> metazone) {
        this.metazone = metazone;
    }
}
