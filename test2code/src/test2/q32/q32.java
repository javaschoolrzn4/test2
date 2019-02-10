package test2.q32;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class q32 {
    public static void main(String[] args) {

    Map<String , List<? extends CharSequence>> stateCitiesMap = new HashMap<String, List<? extends CharSequence>>();

    //Which of the following options correctly achieves the same declaration using type inferencing?
    //Select 1 option:
    // A.
        //Map<String , List<? extends CharSequence>> stateCitiesMapA = new HashMap<String, List<>>();
    // B.
        Map<String , List<? extends CharSequence>> stateCitiesMapB = new HashMap();
    //!C.
        Map<String , List<? extends CharSequence>> stateCitiesMapC = new HashMap<>();
    // D.
        //Map<String , List<? extends CharSequence>> stateCitiesMapD = new HashMap<<>>();
    }
}
