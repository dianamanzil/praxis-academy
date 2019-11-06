package suppresswarningtest;
/**
 * contoh penggunaan anotasi suppresswarningtest
 * @author HP
 */
class DeprecatedTest{
    @Deprecated
    public void Display(){
        System.out.println("Deprecated display()");
    }
}
public class SuppressWarningTest {
    @SuppressWarnings({"Checked","deprecation"})
    public static void main(String[] args) {
       DeprecatedTest d1=new DeprecatedTest();
       d1.Display();
    }
    
}
