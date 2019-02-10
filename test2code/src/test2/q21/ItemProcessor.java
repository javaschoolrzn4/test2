package test2.q21;

import java.util.concurrent.CyclicBarrier;

public class ItemProcessor /*implements Runnable*/ extends Thread { //LINE 1
    CyclicBarrier cb;
    public ItemProcessor(CyclicBarrier cb){
        this.cb = cb;
    }
    public void run(){
        System.out.println("processed");
        try {
            cb.await();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
