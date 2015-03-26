package stuba.bpbphibernatemapper;
// Generated 26-Mar-2015 03:57:15 by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * GtfsAgencies generated by hbm2java
 */
public class GtfsAgencies  implements java.io.Serializable {


     private String id;
     private String fareUrl;
     private String lang;
     private String name;
     private String phone;
     private String timezone;
     private String url;
     private Set gtfsRouteses = new HashSet(0);

    public GtfsAgencies() {
    }

	
    public GtfsAgencies(String id) {
        this.id = id;
    }
    public GtfsAgencies(String id, String fareUrl, String lang, String name, String phone, String timezone, String url, Set gtfsRouteses) {
       this.id = id;
       this.fareUrl = fareUrl;
       this.lang = lang;
       this.name = name;
       this.phone = phone;
       this.timezone = timezone;
       this.url = url;
       this.gtfsRouteses = gtfsRouteses;
    }
   
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    public String getFareUrl() {
        return this.fareUrl;
    }
    
    public void setFareUrl(String fareUrl) {
        this.fareUrl = fareUrl;
    }
    public String getLang() {
        return this.lang;
    }
    
    public void setLang(String lang) {
        this.lang = lang;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getTimezone() {
        return this.timezone;
    }
    
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }
    public String getUrl() {
        return this.url;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }
    public Set getGtfsRouteses() {
        return this.gtfsRouteses;
    }
    
    public void setGtfsRouteses(Set gtfsRouteses) {
        this.gtfsRouteses = gtfsRouteses;
    }




}


