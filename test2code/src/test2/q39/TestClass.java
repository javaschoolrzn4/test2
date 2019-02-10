package test2.q39;

class A extends Thread {
    public void run() {
        System.out.println("Starting loop");
        while(true){}
    }
}
public class TestClass {
    public static void main(String args[]) throws Exception {
        A a = new A();
        a.start();
        Thread.sleep(1000);
        a.interrupt();
    }
}

//Which statements regarding the following code are correct?
//Select 1 option:
//        A. This will not compile.
//        B. It will compile but it will throw an exception at Runtime.
//       !C. It will run but it will never end.
//        D. It will run and will end after about a second.
//        F. None of these.
