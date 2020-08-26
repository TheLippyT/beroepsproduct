package sr.unasat.beroepsproduct.linkedl;
//better known as the firstlast class in the book

public class LinkList {
    private Link first;
    private Link last;
    private int nVehicles =0;

    // ref to first link on list
    // -------------------------------------------------------------
    public LinkList(){
    // constructor

        first = null;
        last = null;
        // no items on list yet
    }
    // -------------------------------------------------------------
    public boolean isEmpty()
    // true if list is empty
    {
        return (first==null);
    }
    // -------------------------------------------------------------
// insert at start of list
    public void insertAtTheEnd(RegularVehicles regularVehicles)
    {
        // make new link
        Link newLink = new Link(regularVehicles);
        Link previous = null;
        Link current = first;

        if(previous==null) {
            first = newLink;
        } else{
            previous.next = newLink;

        }
        newLink.next = current;
    }
    // -------------------------------------------------------------
    public RegularVehicles deleteFirst()
    // delete first item
    {
        // (assumes list not empty)
        RegularVehicles temp = first.regularVehicles;
        // save reference to link
        first = first.next;
//        if(first.next == null){
//            first = first.next;
//        }

        return temp;
        // return deleted link
    }
    // -------------------------------------------------------------

    public void displayList()
    {
//        System.out.print("List (first-->last): ");
        Link current = first;
        // start at beginning of list
        while(current != null)
        // until end of list,
        {
            current.displayLink();
            // print data
            current = current.next; // move to next link
        }
        System.out.println("");
    }
    // -------------------------------------------------------------

    public String peekfront(){
        return first.regularVehicles.getLicensePlate();

    }
}
