/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmmachine;

/**
 *
 * @author HP
 */
public class BalanceInquiry extends ATMMachine{
    static double balance=0;
    public void setBalance(double b){
        balance=b;
    }
    public static double getBalance(){
        return balance;
    }
    
}
