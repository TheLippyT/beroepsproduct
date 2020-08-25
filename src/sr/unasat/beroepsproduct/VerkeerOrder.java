package sr.unasat.beroepsproduct;

import sr.unasat.beroepsproduct.util.Constants;

public class VerkeerOrder {
    public void verkeerslichtFlow(){
        int wegIndex;
        for(wegIndex=0;wegIndex< Constants.light.length; ++wegIndex){
            switch(wegIndex){
                case 0:
                    System.out.println(Constants.wegen[wegIndex].getWeg());
                    Constants.wegen[wegIndex].getLinkQueue().display();
                    break;
                case 1:
                    System.out.println("\n" + Constants.wegen[wegIndex].getWeg());
                    Constants.wegen[wegIndex].getLinkQueue().display();
                    break;
            }
        }
    }
}
