import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * Created by ank on 7/27/2015.
 */
public class ParkingLot {
    
    int count=0;
    int capacity;
    int token=0;
    HashMap<Integer,Integer> map1;

    ParkingLot(int capacity){
        this.capacity=capacity;
        map1= new HashMap<Integer,Integer>();
    }
    ParkingLot(){
        this.capacity=100;
        map1= new HashMap<Integer,Integer>();
    }
    

    
    public boolean isFull(){
        return count==capacity;
    }
    

    public int park(Car c){
        
        if(isFull())
            throw new ArrayIndexOutOfBoundsException();

        else {

            map1.put(++token,c.id);
            capacity++;
            return token;
        }
    }

}
