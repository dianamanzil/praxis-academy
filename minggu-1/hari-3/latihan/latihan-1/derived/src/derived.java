/**
 * Example of override annotation
 * class derived merupakan inheritance dari class base
 * @author HP
 * terdapat satu method display()
 */

public class derived  extends base{
    @Override
    public void display(int x){
        System.out.println("Derived display (int )");
    }
    public static void main(String args[]){
        derived obj= new derived();
        obj.display();
    }
    
}
