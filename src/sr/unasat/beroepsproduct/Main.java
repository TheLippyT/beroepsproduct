package sr.unasat.beroepsproduct;

import sr.unasat.beroepsproduct.linkedl.Link;
import sr.unasat.beroepsproduct.linkedl.LinkList;
import sr.unasat.beroepsproduct.linkedl.RegularVehicles;
import sr.unasat.beroepsproduct.priorityq.PriorityQueue;
import sr.unasat.beroepsproduct.priorityq.SpecialVehicles;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        PriorityQueue priorityQueue = new PriorityQueue(3);
        priorityQueue.insert(new SpecialVehicles(3, "ambulance met sirene", "Dienst: 2745"));
        priorityQueue.insert(new SpecialVehicles(1, "politie met sirene","Dienst: 2568"));
        priorityQueue.insert(new SpecialVehicles(2,"brandweer met sirene", "dienst: 2648"));

        while( !priorityQueue.isEmpty() )
        {
            SpecialVehicles item = priorityQueue.remove();
            System.out.print(item + " ");
        }
        System.out.println("");



    } // end main()


    }


