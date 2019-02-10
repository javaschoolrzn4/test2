package test2.q25;

class CoolThread extends Thread {
    String id = "";
    public CoolThread(String s){ this.id = s; }
    public void run() {
        System.out.println(id+" End");
    }
    public static void main(String args []) {
        Thread t1 = new CoolThread("AAA");
        t1.setPriority(Thread.MIN_PRIORITY);
        Thread t2 = new CoolThread("BBB");
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start(); t2.start();
    }
}

//Which of the following statements about this program are correct?
//Select 1 option:
//        A. "AAA End" will always be printed before "BBB End".
//        B. "BBB End" will always be printed before "AAA End".
//       !C. The order of "AAA End" and "BBB End" cannot be determined.
//        D. The program will not compile.
//        E. The program will throw an exception at runtime.
