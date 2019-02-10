package test2.q12;

public class Tshirt extends Thread {
    public static void main(String[] args) {
        System.out.print(Thread.currentThread().getId() + " "); // line 4
        Thread t1 = new Thread(new Tshirt());
        Thread t2 = new Thread(new Tshirt());
        t1.start();
        t2.run(); // line 8
    }
    public void run() {
        for(int i = 0; i < 2; i++)
            System.out.print(Thread.currentThread().getId() + " ");
    }
}

//    Which are true?
//        Choose all that apply:
//        A. No output is produced.
//       !B. The output could be 1 1 9 9 1
//        C. The output could be 1 2 9 9 2
//        D. The output could be 1 9 9 9 9
//        E. An exception is thrown at runtime.
//        F. Compilation fails due to an error on line 4.
//        G. Compilation fails due to an error on line 8.
