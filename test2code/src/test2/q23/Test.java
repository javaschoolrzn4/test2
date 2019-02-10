package test2.q23;

public class Test extends Thread {
    boolean flag = false;
    public Test(boolean f) { flag = f; }
    static Object obj1 = new Object();
    static Object obj2 = new Object();
    public void m1() {
        synchronized(obj1) {
            System.out.print("1 ");
            synchronized(obj2) {
                System.out.println("2");
            }
        }
    }
    public void m2() {
        synchronized(obj2) {
            System.out.print("2 ");
            synchronized(obj1) {
                System.out.println("1");
            }
        }
    }
    public void run() {
        if(flag){ m1(); m2(); }
        else { m2(); m1(); }
    }
    public static void main(String[] args) {
        new Test(true).start();
        new Test(false).start();
    }
}

//    Which of the following statements are correct?
//        Select 2 options:
//       !A. It may result in a deadlock and the program may get stuck.
//        B. There is no potential for deadlock in the code.
//        C. Deadlock may occur but the program will not get stuck as the JVM will resolve the deadlock.
//        D. The program will always print: 1 2, 2 1, 1 2 and 2 1.
//       !E. Nothing can be said for sure.
