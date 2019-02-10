package test2.q01;

import java.util.*;
public class AndOver {
    public static void main(String[] args) {
        List g = new ArrayList();
        g.add(new Gaited("Eyra"));
        g.add(new Gaited("Vafi"));
        g.add(new Gaited("Andi"));
        Iterator i2 = g.iterator();
        while(i2.hasNext()) {
//            System.out.print(i2.next().name + " ");
        }
    } }
class Gaited {
    public String name;
    Gaited(String n) { name = n; }
}

//    What is the result?
//        Select 1 option:
//        A. Vafi Andi
//        B. Andi Eyra Vafi
//        C. Andi Vafi Eyra
//        D. Eyra Vafi Andi
//       !E. Compilation fails.
//        F. The output order is unpredictable.
