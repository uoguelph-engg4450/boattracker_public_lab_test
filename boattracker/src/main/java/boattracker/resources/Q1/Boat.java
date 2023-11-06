package boattracker;

public class Boat {
    private String modelNumber;
    private String boatColor;
    private double boatPrice = 0.0;
    private Employee user;

    public Boat(String modelNumber){
        this.modelNumber = modelNumber;
    }

    public String getBoatColor() {
        return boatColor;
    }

    public double getBoatPrice() {
        return boatPrice;
    }

    public void assignUser(Employee employee){
        this.user = employee;
    }
}
