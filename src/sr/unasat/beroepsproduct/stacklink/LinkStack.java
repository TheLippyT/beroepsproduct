package sr.unasat.beroepsproduct.stacklink;

import sr.unasat.beroepsproduct.objects.RegularVehicles;

public class LinkStack {
    private LinkList linkList;

    public LinkStack(){
        linkList = new LinkList();
    }
    public void push(RegularVehicles regularVehicles)
    // put item on top of stack
    {
        linkList.insertFirst(regularVehicles);
    }
    //--------------------------------------------------------------
    public RegularVehicles pop()
    // take item from top of stack
    {
        return linkList.deletFirst();
    }
    //--------------------------------------------------------------
    public boolean isEmpty()
    // true if stack is empty
    {
        return ( linkList.isEmpty() );
    }
    //--------------------------------------------------------------
    public void displayStack()
    {
        System.out.print("Stack (top-->bottom): ");
        linkList.displayList();
    }
//--------------------------------------------------------------
} // end class LinkStack

