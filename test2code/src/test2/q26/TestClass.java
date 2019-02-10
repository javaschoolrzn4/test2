package test2.q26;

class A extends Thread {
    static protected int i = 0;
    public void run() {
        for(; i<5; i++) System.out.println("Hello");
    }
}
public class TestClass extends A {
    public void run() {
        for(; i<5; i++) System.out.println("World");
    }
    public static void main(String args []) {
        Thread t1 = new A();
        Thread t2 = new TestClass();
        t2.start(); t1.start();
    }
}

//Which statements regarding the following program are correct?
//Select 1 option:
//        A. It will not compile because run method cannot be overridden.
//        B. It will print both "Hello" and "World" 5 times each.
//        C. It will print both "Hello" and "World" 5 times each but they may be interspersed.
//        D. Total 5 words will be printed.
//        E. Either 5 "Hello"s or 5 "world"s will be printed.
//       !F. None of these.
