package sr.unasat.beroepsproduct.queuelink;

import sr.unasat.beroepsproduct.objects.RegularVehicles;

public class Link {

        public RegularVehicles regularVehicles;
        public Link next;
        // next link in list
// -------------------------------------------------------------

        public Link(RegularVehicles regularVehicles) // constructor
        {
            this.regularVehicles = regularVehicles;
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
    }




