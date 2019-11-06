package deprecatedtest;

/**
 * example of deprecated annotation 
 * @author HP
 * have a method Display()in class DeprecatedTest  
 */
public class DeprecatedTest {

    @Deprecated
    public void Display(){
        System.out.println("Deprecatedtest display()");
    }
    public static void main(String[] args) {
        DeprecatedTest d1= new DeprecatedTest();
        d1.Display();
    }
    
}
