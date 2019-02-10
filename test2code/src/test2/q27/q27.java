package test2.q27;

import java.util.ArrayDeque;
import java.util.Deque;

public class q27 {
    public static void main(String[] args) {
        Deque<Integer> d = new ArrayDeque<>();
        d.push(1);
        d.push(2);
        d.push(3);
        System.out.println(d.remove());
        System.out.println(d.remove());
        System.out.println(d.remove());
    }
}


//What will the following code print when run?
//        Select 1 option:
//        A. 123
//       !B. 321
//        C. Compilation error
//        D. Exception at run time
