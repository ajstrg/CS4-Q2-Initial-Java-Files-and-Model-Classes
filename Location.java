import java.util.ArrayList;

public abstract class Location {
  
    private String currentLocation, activity;

    public Location(String loc){
      currentLocation = loc;
    }
  
    private String getLocation(){
      return currentLocation;
    }

    private String getAct(){
      return activity;
    }
}
