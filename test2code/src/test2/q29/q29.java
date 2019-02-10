package test2.q29;

import java.util.HashMap;
import java.util.Map;

public class q29 {
    public static void main(String[] args) {
        Map m = new HashMap();
        m.values(); // Collection
        m.put(m, new Object());
    }
}

//    Which of these statements concerning maps are true?
//        Select 1 option:
//        A. It is permissible for a map to contain itself as a key.
//        B. values() method returns an instance of Set.
//        C. The Map interface extends the Collection interface.
//       !D. All keys in a map are unique.
//        E. All Map implementations keep the keys sorted.
