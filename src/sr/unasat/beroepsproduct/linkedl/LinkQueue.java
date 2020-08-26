package sr.unasat.beroepsproduct.linkedl;

public class LinkQueue {
    private LinkList linkList;
    private int nVehicles;
    // -------------------------------------------------------------

    public LinkQueue(){
        linkList = new LinkList();
    }
    // -------------------------------------------------------------

    public boolean isEmpty(){
        return linkList.isEmpty();
    }
    // -------------------------------------------------------------

    public void insert(RegularVehicles regularVehicles){

        linkList.insertAtTheEnd(regularVehicles);
        nVehicles++;
    }
    // -------------------------------------------------------------

    public RegularVehicles delete(){
        nVehicles--;
        if (isEmpty()){
            return null;
        }
        return linkList.deleteFirst();
    }
    // -------------------------------------------------------------

    public void display(){
        linkList.displayList();
    }
    // -------------------------------------------------------------
    public int getnVehicles(){ return nVehicles;}


}
