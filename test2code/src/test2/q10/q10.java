package test2.q10;

public class q10 {

    public static void main(String[] args) {
        try {
            throw new Error(); // line 5
        }
        catch (Error e) { // line 7
            try { throw new RuntimeException(); } // line 8
            catch (Throwable t) { } // line 9
        }
        System.out.println("phew");
    }
}

//    Which are true?
//        Choose all that apply:
//       !A. The output is phew
//        B. The code runs without output.
//        C. Compilation fails due to an error on line 5.
//        D. Compilation fails due to an error on line 7.
//        E. Compilation fails due to an error on line 8.
//        F. Compilation fails due to an error on line 9.
