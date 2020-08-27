package sr.unasat.beroepsproduct;

import sr.unasat.beroepsproduct.objects.RegularVehicles;
import sr.unasat.beroepsproduct.objects.Wegen;

import static sr.unasat.beroepsproduct.util.Constants.light;
import static sr.unasat.beroepsproduct.util.Constants.wegen;


public class VerkeerOrder {
    public void runMethods(){
        stoplicht();
        reverse();
    }


    private void drive(Wegen wegen){
        RegularVehicles regularVehicles = wegen.getvehicleQueue().delete();
        System.out.println(regularVehicles.getCarName() +" "+ regularVehicles.getLicensePlate() + " rijd van " + wegen.getWeg());
    }
    // -------------------------------------------------------------
    private void defaultDrive(Wegen wegen) {                                                                       //per wegdek blijft t licht op groen zodat er maximaal 5 auto's oprijden

        for (int i = 0; i < 5; i++) {
            drive(wegen);

            if (wegdekLeeg(wegen)) {
                System.out.println("\n" + wegen.getWeg() + " is empty");
                break;
            }
        }
    }
    // -------------------------------------------------------------
    private void noord(Wegen wegen) {

        if (wegen.getvehicleQueue().getnVehicles() < 5) {

            int items = wegen.getvehicleQueue().getnVehicles();
            for (int i = 0; i < items; i++) {
                drive(wegen);

                if (wegdekLeeg(wegen)) {
                    System.out.println("\n  weg " + wegen.getWeg() + " is leeg");
                }
            }
        } else {
            defaultDrive(wegen);
        }
    }
    // -------------------------------------------------------------
    private void zuid(Wegen wegen) {

        if (wegen.getvehicleQueue().getnVehicles() > 10) {

            for (int i = 0; i < 10; i++) {
                drive(wegen);
            }
        } else {
            defaultDrive(wegen);
        }
    }

    // -------------------------------------------------------------
    private void oost(Wegen wegen) {

        if (!wegdekLeeg(wegen)) {
            defaultDrive(wegen);
        }
    }

    // -------------------------------------------------------------
    private void west(Wegen wegen) {

        if (wegen.getvehicleQueue().getnVehicles() > 10) {

            for (int i = 0; i < 10; i++) {
                drive(wegen);
            }
        } else {                                                                                                           //    Anders default
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




    public void stoplicht() {

        int wegdekIndex;

        for (wegdekIndex = 0; wegdekIndex < light.length; wegdekIndex++) {                                          //laat 1 wegdek groen worden


            if (wegdekLeeg(wegen[wegdekIndex])) {                                                                      //als wegdek leeg is, ga naar volgende wegdek
                System.out.println( wegen[wegdekIndex].getWeg() + " is leeg-*");

                if (wegdekIndex == 3) {                                                                                 //als wegdek 3 leeg is, check als alle wegdekken leeg zijn
                    if (wegdekLeeg(wegen[0]) && wegdekLeeg(wegen[1]) && wegdekLeeg(wegen[2]) && wegdekLeeg(wegen[3])) {
                        System.out.println("no vehicles left");
                        return;                                                                                         //als alle wegdekken leeg zijn, geen volgende stoplicht ronde
                    } else {                                                                                            //als niet alle wegdekken leeg zijn, start nieuwe ronde
                        wegdekIndex = -1;
                        continue;
                    }
                }

                continue;
            } else {                                                                                                      //als het wegdek niet leeg is, groenlicht

                switch (wegdekIndex) {

                    case 0:
                        System.out.println("\n\n wegdek " + wegen[wegdekIndex].getWeg() + " mag oprijden\n\n");
                        noord(wegen[wegdekIndex]);

                        break;
                    case 1:
                        System.out.println("\n\n wegdek " + wegen[wegdekIndex].getWeg() + " mag oprijden\n\n");
                        zuid(wegen[wegdekIndex]);

                        break;
                    case 2:
                        System.out.println("\n\n wegdek " + wegen[wegdekIndex].getWeg() + " mag oprijden\n\n");
                        oost(wegen[wegdekIndex]);

                        break;
                    case 3:
                        System.out.println("\n\n wegdek " + wegen[wegdekIndex].getWeg() + " mag oprijden\n\n");
                        west(wegen[wegdekIndex]);
                        wegdekIndex = -1;                                                                                //als allemaal aan de beurt zijn geweest, start weer bij wegdek noord
                        break;

                    default:
                        System.out.println("default");
                        break;
                }
            }
        }


    }
//    private void driveBack(Wegen wegen){
//        RegularVehicles regularVehicles = wegen.getVehicleStack().pop();
//        System.out.println(regularVehicles.getCarName() + " back to " + wegen.getWeg() );
//        wegen.getvehicleQueue().insert(regularVehicles);
//    }
    public void reverse(){
    int wedekI;
    for (wedekI=light.length-1;wedekI>=0;wedekI--){
        System.out.println("\nvoertuigen op" + wegen[wedekI].getWeg() + " rijden terug\n");
        allBack(wegen[wedekI]);
        timeSkipReverse(wegen[wedekI]);

    }
}
    private void timeSkipReverse(Wegen wegen){
        int vehicles = wegen.getvehicleQueue().getnVehicles();

        for (int i = 0; i < vehicles; i++ ){
            RegularVehicles regularVehicles = wegen.getvehicleQueue().delete();
            System.out.println(regularVehicles.getCarName()+ " " + regularVehicles.getLicensePlate() + "is back to " + wegen.getWeg());

            if(reverseEmpty(wegen)){
                continue;
            }
        }
    }
    private void driveBack(Wegen wegen) {
        RegularVehicles regularVehicles = wegen.getVehicleStack().pop();
        System.out.println(regularVehicles.getCarName() + " " + regularVehicles.getLicensePlate() + "reversing to " + wegen.getWeg());
        wegen.getvehicleQueue().insertIntoStack(regularVehicles);
    }

    private void allBack(Wegen wegen) {
        int items = wegen.getVehicleStack().getnVehicles();

        for (int i = 0; i < items; i++) {
            driveBack(wegen);

            if (reverseEmpty(wegen)) {
                System.out.println("\n cars returned to  " + wegen.getWeg() + "\n");
            }
        }
    }
    private boolean reverseEmpty(Wegen wegen) {
        if (wegen.getVehicleStack().isEmpty()) {
            return true;
        }
        return false;
    }



}
