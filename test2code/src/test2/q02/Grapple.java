package test2.q02;

class Grab {
    static int x = 5;
    synchronized void adjust(Grab y) {
        System.out.print(x-- + " ");
        y.view(y);
    }
    synchronized void view(Grab z) { if(x > 0) z.adjust(z); }
}
public class Grapple implements Runnable {
    static Thread t1;
    static Grab g, g2;
    public void run() {
        if(Thread.currentThread().getId() == t1.getId()) g.adjust(g2);
        else g2.view(g);
    }
    public static void main(String[] args) {
        g = new Grab();
        g2 = new Grab();
        t1 = new Thread(new Grapple());
        t1.start();
        new Thread(new Grapple()).start();
    }
}

//    Which are true?
//        Select 3 options:
//        A. Compilation fails
//       !B. The output could be 5 4 3 2 1
//       !C. The output could be 5 4 3 2 1 0
//        D. The program could produce thousands of lines of output.
//        E. The program could deadlock before producing any output.
//       !F. The output could be "5 ", followed by the program deadlocking.
