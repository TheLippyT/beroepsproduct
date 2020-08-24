package sr.unasat.beroepsproduct.priorityq;

/*
  Deze class is gemaakt voor de speciale voertuigen nl. politie-, brandweer-, ambulancewagen.
 */

public class SpecialVehicles {
    //all standard stuff for making a object datatype
    //manually input licenseplate because generating license plate requires more code

    private int priorityNumber;
    private String vehicleName;
    private String vehicleLicensePlate;

    public SpecialVehicles(int p, String vN, String vLP){
        this.priorityNumber = p;
        this.vehicleName = vN;
        this.vehicleLicensePlate = vLP;
    }

    public int getPriorityNumber() {
        return priorityNumber;
    }

    public void setPriorityNumber(int p) {
        this.priorityNumber = p;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vN) {
        this.vehicleName = vN;
    }

    public String getVehicleLicensePlate() {
        return vehicleLicensePlate;
    }

    public void setVehicleLicensePlate(String vLP) {
        this.vehicleLicensePlate = vLP;
    }
    public boolean equals(SpecialVehicles other){
        return this.getPriorityNumber() == other.getPriorityNumber();
    }


    @Override
    public String toString() {
        return "Vehicles{" +
                "priorityNumber=" + priorityNumber +
                ", vehicleName='" + vehicleName + '\'' +
                ", vehicleLicensePlate='" + vehicleLicensePlate + '\'' +
                '}'+ " rijd " +"\n";
    }
}
