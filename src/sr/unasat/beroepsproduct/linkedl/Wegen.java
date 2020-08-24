package sr.unasat.beroepsproduct.linkedl;

public class Wegen {
    private char weg;
    private LinkQueue linkQueue = new LinkQueue();

    public Wegen(char weg){
        this.weg = weg;
    }
    public void insertIntoWeg(RegularVehicles regularVehicles){
        this.linkQueue.insert(regularVehicles);
    }

    public char getWeg() {
        return weg;
    }

    public LinkQueue getLinkQueue() {
        return linkQueue;
    }
}
