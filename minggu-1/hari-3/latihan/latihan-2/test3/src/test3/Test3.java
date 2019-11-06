package test3;
import java.util.*;
public class Test3 {
    public static void main(String[] args) {
        //creating arraylist without any type specified
        ArrayList a1= new ArrayList();
        a1.add("Sachin");
        a1.add("Rahul");
        a1.add(10);
        
        String s1=(String)a1.get(0);
        String s2=(String)a1.get(1);
       
        String s3=(String)a1.get(2);
    }
    
}
