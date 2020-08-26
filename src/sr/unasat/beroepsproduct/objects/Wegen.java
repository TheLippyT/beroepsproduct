package sr.unasat.beroepsproduct.objects;

import sr.unasat.beroepsproduct.queuelink.LinkQueue;

public class Wegen {
    private String weg;
    private LinkQueue linkQueue = new LinkQueue();

    public Wegen(String weg){
        this.weg = weg;
    }
    public void insertIntoWeg(RegularVehicles regularVehicles){
        this.linkQueue.insert(regularVehicles);
    }

    public String getWeg() {
        return weg;
    }

    public LinkQueue getvehicleQueue() {
        return linkQueue;
    }
}
