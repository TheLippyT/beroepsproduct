package sr.unasat.beroepsproduct.linkedl;

public class Link {
    // linkList.java
// demonstrates linked list
// to run this program: C>java LinkListApp
////////////////////////////////////////////////////////////////

//        public int iData;
        // data item (key)
//        public double dData;
        public RegularVehicles regularVehicles;
        // data item
        public Link next;
        // next link in list
// -------------------------------------------------------------

        public Link(RegularVehicles rV) // constructor
        {
            regularVehicles = rV;
            // initialize data
//            dData = dd;
            // (‘next’ is automatically
        }
        // set to null)
// -------------------------------------------------------------
        public void displayLink()
        // display ourself
        {
            System.out.print("{" + regularVehicles + "} ");
        }
    } // end class Link
    ////////////////////////////////////////////////////////////////




