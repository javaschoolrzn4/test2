package test2.q03;

public class TestClass{
    static boolean b;
    static int[] ia = new int[1];
    static char ch;
    static boolean[] ba = new boolean[1];
    public static void main(String args[]) throws Exception{
        boolean x = false;
        if( b ){
            x = ( ch == ia[ch]);
        }
        else x = ( ba[ch] = b );
        System.out.println(x+" "+ba[ch]);
    }
}

//Select 1 option:
//        A. true true
//        B. true false
//        C. false true
//       !D. false false
//        E. It will not compile.
