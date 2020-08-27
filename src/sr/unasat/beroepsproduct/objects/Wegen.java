package sr.unasat.beroepsproduct.objects;

import sr.unasat.beroepsproduct.queuelink.LinkQueue;
import sr.unasat.beroepsproduct.stacklink.LinkStack;

public class Wegen {
    private String weg;
    private LinkQueue linkQueue = new LinkQueue();
    private LinkStack linkStack = new LinkStack();

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
    public LinkStack getVehicleStack(){return linkStack;}
}
