package sr.unasat.beroepsproduct;

import sr.unasat.beroepsproduct.objects.RegularVehicles;
import sr.unasat.beroepsproduct.specialvehicles.PriorityQueue;
import sr.unasat.beroepsproduct.objects.SpecialVehicles;

import java.io.IOException;

import static sr.unasat.beroepsproduct.util.Constants.wegen;

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

        wegen[0].insertIntoWeg(new RegularVehicles("car 1","PK 97-31"));
        wegen[0].insertIntoWeg(new RegularVehicles("car 1","PK 97-31"));
        wegen[0].insertIntoWeg(new RegularVehicles("car 1","PK 97-31"));

        wegen[1].insertIntoWeg(new RegularVehicles("car 1","PK 97-31"));
        wegen[1].insertIntoWeg(new RegularVehicles("car 1","PK 97-31"));
        wegen[1].insertIntoWeg(new RegularVehicles("car 1","PK 97-31"));
        wegen[1].insertIntoWeg(new RegularVehicles("car 1","PK 97-31"));
        wegen[1].insertIntoWeg(new RegularVehicles("car 1","PK 97-31"));
        wegen[1].insertIntoWeg(new RegularVehicles("car 1","PK 97-31"));
        wegen[1].insertIntoWeg(new RegularVehicles("car 1","PK 97-31"));
        wegen[1].insertIntoWeg(new RegularVehicles("car 1","PK 97-31"));
        wegen[1].insertIntoWeg(new RegularVehicles("car 1","PK 97-31"));
        wegen[1].insertIntoWeg(new RegularVehicles("car 1","PK 97-31"));
        wegen[1].insertIntoWeg(new RegularVehicles("car 1","PK 97-31"));
        wegen[1].insertIntoWeg(new RegularVehicles("car 1","PK 97-31"));
        wegen[1].insertIntoWeg(new RegularVehicles("car 1","PK 97-31"));
        wegen[1].insertIntoWeg(new RegularVehicles("car 1","PK 97-31"));
        wegen[1].insertIntoWeg(new RegularVehicles("car 1","PK 97-31"));
        wegen[1].insertIntoWeg(new RegularVehicles("car 1","PK 97-31"));
        wegen[1].insertIntoWeg(new RegularVehicles("car 1","PK 97-31"));

        wegen[2].insertIntoWeg(new RegularVehicles("car 1","PK 97-31"));
        wegen[2].insertIntoWeg(new RegularVehicles("car 1","PK 97-31"));
        wegen[2].insertIntoWeg(new RegularVehicles("car 1","PK 97-31"));
        wegen[2].insertIntoWeg(new RegularVehicles("car 1","PK 97-31"));
        wegen[2].insertIntoWeg(new RegularVehicles("car 1","PK 97-31"));

        wegen[3].insertIntoWeg(new RegularVehicles("car 1","PK 97-31"));
        wegen[3].insertIntoWeg(new RegularVehicles("car 1","PK 97-31"));
        wegen[3].insertIntoWeg(new RegularVehicles("car 1","PK 97-31"));
        wegen[3].insertIntoWeg(new RegularVehicles("car 1","PK 97-31"));
        wegen[3].insertIntoWeg(new RegularVehicles("car 1","PK 97-31"));
        wegen[3].insertIntoWeg(new RegularVehicles("car 1","PK 97-31"));
        wegen[3].insertIntoWeg(new RegularVehicles("car 1","PK 97-31"));
        wegen[3].insertIntoWeg(new RegularVehicles("car 1","PK 97-31"));
        wegen[3].insertIntoWeg(new RegularVehicles("car 1","PK 97-31"));
        wegen[3].insertIntoWeg(new RegularVehicles("car 1","PK 97-31"));
        wegen[3].insertIntoWeg(new RegularVehicles("car 1","PK 97-31"));
        wegen[3].insertIntoWeg(new RegularVehicles("car 1","PK 97-31"));
        wegen[3].insertIntoWeg(new RegularVehicles("car 1","PK 97-31"));

        VerkeerOrder verkeerOrder = new VerkeerOrder();
        verkeerOrder.reverse();

    } // end main()


    }


