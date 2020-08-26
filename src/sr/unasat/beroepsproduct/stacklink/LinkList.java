package sr.unasat.beroepsproduct.stacklink;

import sr.unasat.beroepsproduct.objects.RegularVehicles;
import sr.unasat.beroepsproduct.queuelink.Link;

public class LinkList {
    private Link first;

    public LinkList(){
        first = null;
    }
    public boolean isEmpty(){
        return (first == null);
    }
    public void insertFirst(RegularVehicles regularVehicles){
        Link newLink = new Link(regularVehicles);
        newLink.next =  first;
        first = newLink;
    }
    public RegularVehicles deletFirst(){
        Link temp = first;
        first = first.next;
        return temp.regularVehicles;
    }
    public void displayList(){
        Link current = first;
        while (current != null){
            current.displayLink();
            current=current.next;
        }
        System.out.println("");
    }
}
