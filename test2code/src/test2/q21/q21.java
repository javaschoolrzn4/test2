package test2.q21;

import java.util.concurrent.CyclicBarrier;

public class q21 {

    public static void main(String[] args) throws Exception{
        Merger m = new Merger();
        //LINE 3
        CyclicBarrier cb = new CyclicBarrier(2, m);

        ItemProcessor ip = new ItemProcessor(cb);
        ip.start(); //LINE 4
        cb.await();
    }
}

//    What should be inserted in the following code such that run method of Merger will be executed only after the thread
//        started at 4 and the main thread have both invoked await?
//
//        Select 1 option:
//        A. Make ItemProcessor extend Thread instead of implementing Runnable and add CyclicBarrier cb = new
//          CyclicBarrier(1, m); to //LINE 3
//       !B. Make ItemProcessor extend Thread instead of implementing Runnable and add CyclicBarrier cb = new
//          CyclicBarrier(2, m); to //LINE 3
//        C. Make Merger extend Thread instead of implementing Runnable and add CyclicBarrier cb = new CyclicBarrier(1,
//          m); to //LINE 3
//        D. Make Merger extend Thread instead of implementing Runnable and add CyclicBarrier cb = new CyclicBarrier(2,
//          m); to //LINE 3
//        E. Just add CyclicBarrier cb = new CyclicBarrier(1, m); to //LINE 3
//        F. Just add CyclicBarrier cb = new CyclicBarrier(2, m); to //LINE 3
