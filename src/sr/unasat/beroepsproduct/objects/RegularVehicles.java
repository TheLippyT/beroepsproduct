package sr.unasat.beroepsproduct.objects;

/*
deze class is gemaakt om objects te maken van de andere voertuigen. de niet speciale voertuigen deze zijn
de normale personen auto's. de reden waarom ik het apart heb gehouden is omdat deze auto's niet dezelfde elementen
zullen beschikken net als de speciale wagens. de speciale wagens hebben elk hun eigen priority and hun prioriteiten
blijven onveranderd. bij de personen auto's hebben we te maken met de ligging van deze wagens(wegdek waar de auto's
zich bevinden).
 */

public class RegularVehicles {
    private String carName;
    private String licensePlate;


    public RegularVehicles(String cN, String lP){

       this.carName = cN;
       this.licensePlate = lP;

    }



    public String getCarName() {
        return carName;
    }

    public void setCarName(String cN) {
        this.carName = carName;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String lP) {
        this.licensePlate = licensePlate;
    }



    @Override
    public String toString() {
        return "\n" + "RegularVehicles{" +
                ", carName='" + carName + '\'' +
                ", licensePlate='" + licensePlate + '\'' +
                '}';
    }
}
