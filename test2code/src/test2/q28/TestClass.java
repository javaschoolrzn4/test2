package test2.q28;

import java.util.ArrayList;
import java.util.Collections;
class Address implements Comparable<Address> {
    String street;
    String zip;
    public Address(String street, String zip){
        this.street = street; this.zip = zip;
    }
    public int compareTo(Address o) {
        int x = this.zip.compareTo(o.zip);
        return x == 0? this.street.compareTo(o.street) : x;
    }
}
public class TestClass {
    public static void main(String[] args) {
        ArrayList<Address> al = new ArrayList<>();
        al.add(new Address("dupont dr", "28217"));
        al.add(new Address("sharview cir", "28217"));
        al.add(new Address("yorkmont ridge ln", "11223"));
        Collections.sort(al);
        for(Address a : al) System.out.println(a.street+" "+ a.zip);
    }
}

//    What will be printed?
//        Select 1 option:
//       !A. yorkmont ridge ln 11223
//           dupont dr 28217
//           sharview cir 28217
//        B. sharview cir 28217
//           yorkmont ridge ln 11223
//           dupont dr 28217
//        C. sharview cir 28217
//           dupont dr 28217
//           yorkmont ridge ln 11223
//        D. The order of output messages cannot be determined.
//        E. It will throw an exception at run time.
//        F. It will not compile.
