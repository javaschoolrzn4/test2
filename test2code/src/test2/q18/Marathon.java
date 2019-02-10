package test2.q18;

class Jog implements Runnable {
    public void run() {
        for(int i = 0; i < 8; i++) {
            try { Thread.sleep(200); }
            catch (Exception e) { System.out.print("exc "); }
            System.out.print(i + " ");
        }
    }
}
public class Marathon {
    public static void main(String[] args) throws Exception {
        Jog j1 = new Jog();
        Thread t1 = new Thread(j1);
//        Thread ttt = null;
        t1.start();
        t1.sleep(500);
//        ttt.sleep(500);
        System.out.print("pre ");
        t1.interrupt();
        t1.sleep(500);
//        ttt.sleep(500);
        System.out.print("post ");
    }
}

//    Assuming that sleep() sleeps for about the amount of time specified in its argument, and that
//        all other code runs almost instantly, which output is likely?
//        Choose all that apply:
//        A. exc
//        B. 0 1 pre exc post
//        C. exc 0 1 2 3 4 5 6 7
//        D. pre post 0 1 2 3 4 5 6 7
//        E. pre exc 0 1 post 2 3 4 5 6 7
//       !F. 0 1 pre exc 2 3 4 post 5 6 7
