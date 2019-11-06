package test4;
import java.util.*;
public class Test4 {
    public static void main(String[] args) {
        //creating an arraylist with String specified
        ArrayList <String> a1= new ArrayList<String> ();
        
        a1.add("Sachin");
        a1.add("Rahul");
        a1.add(10);//compiler tidak sesuai tipe datanya
        
        String s1=(String)a1.get(0);
        String s2=(String)a1.get(1);
        String s3=(String)a1.get(2);
    }
    
}
