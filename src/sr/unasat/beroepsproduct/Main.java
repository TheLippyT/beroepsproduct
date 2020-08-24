package sr.unasat.beroepsproduct;

import sr.unasat.beroepsproduct.linkedl.Link;
import sr.unasat.beroepsproduct.linkedl.LinkList;
import sr.unasat.beroepsproduct.linkedl.RegularVehicles;
import sr.unasat.beroepsproduct.priorityq.PriorityQueue;
import sr.unasat.beroepsproduct.priorityq.Vehicles;

import java.io.IOError;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        PriorityQueue priorityQueue = new PriorityQueue(3);
        priorityQueue.insert(new Vehicles(3, "ambulance met sirene", "Dienst: 2745"));
        priorityQueue.insert(new Vehicles(1, "politie met sirene","Dienst: 2568"));
        priorityQueue.insert(new Vehicles(2,"brandweer met sirene", "dienst: 2648"));

        while( !priorityQueue.isEmpty() )
        {
            Vehicles item = priorityQueue.remove();
            System.out.print(item + " ");
        }
        System.out.println("");



        LinkList theList = new LinkList(); // make new list
        //w=wegdek , cN=carName , lP=LicensePlate
        theList.insertFirst(new RegularVehicles('N',"car 3","PK 87-23"));
        theList.insertFirst(new RegularVehicles('N',"car 2","PK 98-21"));
        theList.insertFirst(new RegularVehicles('N',"car 1","PK 78-23"));

        theList.displayList();
        // display list
        while( !theList.isEmpty() )
        // until it’s empty,
        {
            Link aLink = theList.deleteFirst();
            // delete link
            System.out.print("Deleted");
            // display it
            aLink.displayLink();
            System.out.println("");
        }
        theList.displayList();
        // display list
    } // end main()


    }


