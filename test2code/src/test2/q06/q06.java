package test2.q06;

public class q06 {
    public static void main(String[] args) {
        int count = 0;
        outer: for(int x = 0; x < 5; x++) {
            middle: for(int y = 0; y < 5; y++) {
                if(y == 1) continue middle;
                if(y == 3) break middle;
                count++;
            }
            if(x > 2) continue outer;
            count = count + 10;
        }
        System.out.println("count: " + count);
    }
}

//    What is the result?
//        Select 1 option:
//        A. count: 33
//       !B. count: 40
//        C. count: 45
//        D. count: 65
//        E. Compilation fails.
//        F. The code runs in an endless loop.
