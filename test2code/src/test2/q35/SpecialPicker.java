package test2.q35;

public class SpecialPicker<K> {
    public K pickOne(K k1, K k2){
        return k1.hashCode()>k2.hashCode()?k1:k2;
    }

    public static void main(String[] args) {
        SpecialPicker<Integer> sp = new SpecialPicker<>(); // line 1
        System.out.println(sp.pickOne(1, 2).intValue()+1); // line 2
    }
}

//    what will be the result of running the following lines of code:
//        Select 1 option:
//        A. line 1 will not compile.
//        B. line 2 will not compile.
//        C. It will throw an exception at run time.
//       !D. It will print 3.
