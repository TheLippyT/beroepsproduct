package sr.unasat.beroepsproduct.priorityq;

public class PriorityQueue {
    private int maxSize;
    private SpecialVehicles[] queArray;
    private int nVehicles;


    public PriorityQueue(int maxSize) {
        this.maxSize = maxSize;
        queArray = new SpecialVehicles[this.maxSize];
        nVehicles = 0;
    }
    //--------------------------------------------------------------------------------------
    public void insert(SpecialVehicles vehicles){
        int i;

        if (nVehicles == 0) //if there is nothing start at 0
            queArray[nVehicles++] = vehicles;
        else {
            for (i = nVehicles-1; i >= 0; i--) {
                if (vehicles.getPriorityNumber() > queArray[i].getPriorityNumber()) {//the priority number is taken from the inserted objects and then compared with each other. if the priority number is higher than it will go as last
                    queArray[i + 1] = queArray[i];
                }
                else {
                    break;
                }
            }
            queArray[i+1] = vehicles;
            nVehicles++;
        }
    }
    //--------------------------------------------------------------------------------------
    public SpecialVehicles remove(){
        return queArray[--nVehicles];
    } //regular removing vehicles from the queue
    //--------------------------------------------------------------------------------------
    public SpecialVehicles peekmin(){
        return queArray[nVehicles-1];
    } //peek method
    //--------------------------------------------------------------------------------------
    public boolean isEmpty(){
        return (nVehicles == 0);
    } //method if the amount of vehicles is 0
    //--------------------------------------------------------------------------------------
    public boolean isFull(){
        return (nVehicles==maxSize);
    } //return if the amount of vehicles is the same amount as the max amount of indexes allowed
    //------------------------------------------------------------------------------------


}
