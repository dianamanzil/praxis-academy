/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainappconcurrent;

/**
 *
 * @author HP
 */
public class Counter implements Runnable{
    private final MainAppConcurrent mainApp;
    private final int loopLimit;
    private final String task;
    
    public Counter (MainAppConcurrent mainApp, int loopLimit, String task){
        this.mainApp=mainApp;
        this.loopLimit=loopLimit;
        this.task=task; 
    }
    @Override
    public void run(){
        for(int i=0; i<loopLimit; i++){
            System.out.println("Thread: "+Thread.currentThread().getName()+"Counter: "+(i+1)+" Task: "+task);
            mainApp.pause(Math.random());
        }
    }
    
}
