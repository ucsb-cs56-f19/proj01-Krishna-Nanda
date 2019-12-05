package earthquakes.searches;
public class EqSearch {
    EqSearch(){
        distance = 0;
        minmag = 0;
        lat = 0;
        lon = 0;
        location = "";
    } 

    public int getDistance(){
        return distance;
    }
    public int getMinmag(){
        return minmag;
    }
    public void setDistance(int d){
        distance = d;
    }
    public void setMinmag(int m){
        minmag = m;
    }
    public double getLat(){
        return lat;
    }
    public double getLon(){
        return lon;
    }
    public String getLocation(){
        return location;
    }
    public void setLat(double d){
        lat = d;
    }
    public void setLon(double d){
        lon = d;
    }
    public void setLocation(String d){
        location = d;
    }
    private int distance;
    private int minmag;
    private double lat;
    private double lon;
    private String location;
}