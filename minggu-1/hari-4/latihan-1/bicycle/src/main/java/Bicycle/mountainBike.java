
public class mountainBike extends bicycle {
    //the mountainBike subclass has one field
    public int seatHeight;
    
    // the mountainBike subclass has one constructor
    public mountainBike(int startHeight, int startCadence, int startSpeed, int startGear){
        super(startCadence, startSpeed, startGear);
        seatHeight=startHeight;
    }
    
    //the mountainBike subclass has one method
    public void setHeight(int newValue){
        seatHeight=newValue;
        
    }
    
}
