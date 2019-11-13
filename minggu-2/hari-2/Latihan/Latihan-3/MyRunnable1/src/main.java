import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
public class main {
    private static final int NTHREDS=10;
    
    public static void main(String[] args){
        ExecutorService executor=Executor.newFixedThreadPool(NTHREAD);
        for(int i=0; i<500; i++){
            Runnable worker = new MyRunnable(1000000L+i);
            executor.execute(worker);
        }
        
        executor.shutdown();
        
        executor.awaitTermination();
        System.out.println("Finished all threads");
    }
}
