package test2.q04;

import java.io.*;
public class Edgy {
    public static void main(String[] args) {
        try {
            wow();
// throw new IOException(); // line 6
        } finally {
// throw new Error(); // line 8
// throw new IOException(); // line 9
        }
    }
    static void wow() {
// throw new IllegalArgumentException(); //line 13
// throw new IOException(); // line 14
    }
}
//    And given that IOException is a direct subclass of java.lang.Exception: and that
//        IllegalArgumentException is a runtime exception, which of the following, if uncommented
//        independently, will compile?
//Choose all that apply:
//        A. Line 6
//       !B. Line 8
//        C. Line 9
//       !D. Line 13
//        E. Line 14
//        F. The code will NOT compile as is.
