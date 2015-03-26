package stuba.bpbphibernatemapper;
// Generated 26-Mar-2015 03:57:15 by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * GtfsTrips generated by hbm2java
 */
public class GtfsTrips  implements java.io.Serializable {


     private GtfsTripsId id;
     private GtfsRoutes gtfsRoutes;
     private String serviceIdAgencyId;
     private String serviceIdId;
     private String shapeIdAgencyId;
     private String shapeIdId;
     private String tripShortName;
     private String tripHeadsign;
     private String routeShortName;
     private String directionId;
     private String blockId;
     private Integer wheelchairAccessible;
     private Set tripPositionses = new HashSet(0);
     private Set gtfsStopTimeses = new HashSet(0);

    public GtfsTrips() {
    }

	
    public GtfsTrips(GtfsTripsId id) {
        this.id = id;
    }
    public GtfsTrips(GtfsTripsId id, GtfsRoutes gtfsRoutes, String serviceIdAgencyId, String serviceIdId, String shapeIdAgencyId, String shapeIdId, String tripShortName, String tripHeadsign, String routeShortName, String directionId, String blockId, Integer wheelchairAccessible, Set tripPositionses, Set gtfsStopTimeses) {
       this.id = id;
       this.gtfsRoutes = gtfsRoutes;
       this.serviceIdAgencyId = serviceIdAgencyId;
       this.serviceIdId = serviceIdId;
       this.shapeIdAgencyId = shapeIdAgencyId;
       this.shapeIdId = shapeIdId;
       this.tripShortName = tripShortName;
       this.tripHeadsign = tripHeadsign;
       this.routeShortName = routeShortName;
       this.directionId = directionId;
       this.blockId = blockId;
       this.wheelchairAccessible = wheelchairAccessible;
       this.tripPositionses = tripPositionses;
       this.gtfsStopTimeses = gtfsStopTimeses;
    }
   
    public GtfsTripsId getId() {
        return this.id;
    }
    
    public void setId(GtfsTripsId id) {
        this.id = id;
    }
    public GtfsRoutes getGtfsRoutes() {
        return this.gtfsRoutes;
    }
    
    public void setGtfsRoutes(GtfsRoutes gtfsRoutes) {
        this.gtfsRoutes = gtfsRoutes;
    }
    public String getServiceIdAgencyId() {
        return this.serviceIdAgencyId;
    }
    
    public void setServiceIdAgencyId(String serviceIdAgencyId) {
        this.serviceIdAgencyId = serviceIdAgencyId;
    }
    public String getServiceIdId() {
        return this.serviceIdId;
    }
    
    public void setServiceIdId(String serviceIdId) {
        this.serviceIdId = serviceIdId;
    }
    public String getShapeIdAgencyId() {
        return this.shapeIdAgencyId;
    }
    
    public void setShapeIdAgencyId(String shapeIdAgencyId) {
        this.shapeIdAgencyId = shapeIdAgencyId;
    }
    public String getShapeIdId() {
        return this.shapeIdId;
    }
    
    public void setShapeIdId(String shapeIdId) {
        this.shapeIdId = shapeIdId;
    }
    public String getTripShortName() {
        return this.tripShortName;
    }
    
    public void setTripShortName(String tripShortName) {
        this.tripShortName = tripShortName;
    }
    public String getTripHeadsign() {
        return this.tripHeadsign;
    }
    
    public void setTripHeadsign(String tripHeadsign) {
        this.tripHeadsign = tripHeadsign;
    }
    public String getRouteShortName() {
        return this.routeShortName;
    }
    
    public void setRouteShortName(String routeShortName) {
        this.routeShortName = routeShortName;
    }
    public String getDirectionId() {
        return this.directionId;
    }
    
    public void setDirectionId(String directionId) {
        this.directionId = directionId;
    }
    public String getBlockId() {
        return this.blockId;
    }
    
    public void setBlockId(String blockId) {
        this.blockId = blockId;
    }
    public Integer getWheelchairAccessible() {
        return this.wheelchairAccessible;
    }
    
    public void setWheelchairAccessible(Integer wheelchairAccessible) {
        this.wheelchairAccessible = wheelchairAccessible;
    }
    public Set getTripPositionses() {
        return this.tripPositionses;
    }
    
    public void setTripPositionses(Set tripPositionses) {
        this.tripPositionses = tripPositionses;
    }
    public Set getGtfsStopTimeses() {
        return this.gtfsStopTimeses;
    }
    
    public void setGtfsStopTimeses(Set gtfsStopTimeses) {
        this.gtfsStopTimeses = gtfsStopTimeses;
    }




}

