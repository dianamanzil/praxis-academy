/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2;

/**
 *
 * @author HP
 */
public class Test2 {
    static <T> void genericDisplay(T element){
        System.out.println(element.getClass().getName()+"="+element);
    }
    public static void main(String[] args) {
        genericDisplay(11);
        genericDisplay("GeeksForGeeks");
        genericDisplay(1.0);
    }
    
}
