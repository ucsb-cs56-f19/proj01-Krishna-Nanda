package earthquakes.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Location {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long place_id;
    private double lon;
    private double lat;
    private String name;
    private String uid;
    
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public void setLat(double l){
        lat = l;
    }
    public double getLat(){
        return lat;
    }
    public void setLon(double l){
        lon = l;
    }
    public double getLon(){
        return lon;
    }
    public void setName(String l){
        name = l;
    }
    public String getName(){
        return name;
    }
    public long getPlaceId(){
        return place_id;
    }
    public void setPlaceId(long l){
        place_id = l;
    }

   
    public String getUid() { return uid; }
    public void setUid (String uid) { this.uid = uid; }
}