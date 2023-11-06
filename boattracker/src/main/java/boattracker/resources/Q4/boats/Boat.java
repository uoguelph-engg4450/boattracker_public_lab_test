package boattracker.boats;

import boattracker.internal.*;

public class Boat {
    private String modelNumber;
    private String boatColor;
    private double boatPrice = 0.0;

    public Boat(String modelNumber){
        this.modelNumber = modelNumber;
    }

    public String getBoatColor() {
        return boatColor;
    }
 
    public double getBoatPrice() {
        return boatPrice;
    }

}
