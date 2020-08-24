package sr.unasat.beroepsproduct.linkedl;

public class LinkQueue {
    private LinkList linkList;
    public LinkQueue(){
        linkList = new LinkList();
    }
    public boolean isEmpty(){
        return linkList.isEmpty();
    }
    public void insert(RegularVehicles regularVehicles){
        linkList.insertAtTheEnd(regularVehicles);
    }
    public RegularVehicles delete(){
        return linkList.deleteFirst();
    }
    public void display(){
        linkList.displayList();
    }

}
