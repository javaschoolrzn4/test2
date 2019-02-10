package test2.q11;

import java.util.*;
public class Bucket {
    public static void main(String[] args) {
        Set<String> hs = new HashSet<String>();
        Set<String> lh = new LinkedHashSet<String>();
        Set<String> ts = new TreeSet<String>();
        List<String> al = new ArrayList<String>();
        String[] v = {"1", "3", "1", "2"};
        for(int i=0; i< v.length; i++) {
            hs.add(v[i]); lh.add(v[i]); ts.add(v[i]); al.add(v[i]);
        }
        Iterator it = hs.iterator();
        while(it.hasNext()) System.out.print(it.next() + " ");
                System.out.println();
        Iterator it2 = lh.iterator();
        while(it2.hasNext()) System.out.print(it2.next() + " ");
                System.out.println();
        Iterator it3 = ts.iterator();
        while(it3.hasNext()) System.out.print(it3.next() + " ");
                System.out.println();
        Iterator it5 = al.iterator(); // line 18
        while(it5.hasNext()) System.out.print(it5.next() + " ");
    }
}

//    Which statements are true?
//        Choose all that apply:
//        A. An exception is thrown at runtime.
//        B. Compilation fails due to an error on line 18.
//       !C. "1 3 2" is only guaranteed to be in the output once.
//       !D. "1 2 3" is only guaranteed to be in the output once.
//        E. "1 3 2" is guaranteed to be in the output more than once.
//        F. "1 2 3" is guaranteed to be in the output more than once.
//       !G. "1 3 1 2" is guaranteed to be in the output at least once.
//        H. Compilation fails due to error(s) on lines other than line 18.
