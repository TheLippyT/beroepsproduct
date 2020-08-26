package sr.unasat.beroepsproduct;

import sr.unasat.beroepsproduct.linkedl.RegularVehicles;
import sr.unasat.beroepsproduct.linkedl.Wegen;
import sr.unasat.beroepsproduct.util.Constants;

public class VerkeerOrder {

    private void drive(Wegen wegen){
        RegularVehicles regularVehicles = wegen.getvehicleQueue().delete();
        System.out.println(regularVehicles.getCarName() + regularVehicles.getLicensePlate() + "rijd van" + wegen.getWeg());
    }
    // -------------------------------------------------------------
    private void defaultDrive(Wegen wegen) {                                                                       //per wegdek blijft t licht op groen zodat er maximaal 5 auto's oprijden

        for (int i = 0; i < 5; i++) {
            defaultDrive(wegen);

            if (wegdekLeeg(wegen)) {
                System.out.println("\n          ****Alle auto's op wegdek " + wegen.getWeg() + " zijn opgereden****");
                break;
            }
        }
    }
    // -------------------------------------------------------------
    private void Noord(Wegen wegen) {

        if (wegen.getvehicleQueue().getnVehicles() < 5) {

            int items = wegen.getvehicleQueue().getnVehicles();
            for (int i = 0; i < items; i++) {
                drive(wegen);

                if (wegdekLeeg(wegen)) {
                    System.out.println("\n          ****Alle auto's op wegdek " + wegen.getvehicleQueue() + " zijn opgereden****");
                }
            }
        } else {
            defaultDrive(wegen);
        }
    }
    // -------------------------------------------------------------
    private boolean wegdekLeeg(Wegen wegen) {
        if (wegen.getvehicleQueue().isEmpty()) {
            return true;
        }
        return false;
    }
    // -------------------------------------------------------------




    public void verkeerslichtFlow(){
        int wegIndex;



    }
}
