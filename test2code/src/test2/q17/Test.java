package test2.q17;

class Test{
    public static void main(String[] args){
        int k = 1;
        int[] a = { 1 };
        k += (k = 4) * (k + 2);
        a[0] += (a[0] = 4) * (a[0] + 2);
        System.out.println( k + " , " + a[0]);
    }
}

//Select 1 option:
//        A. It will not compile.
//        B. 4,4
//       !C. 25,25
//        D. 13,13
//        E. None of the above.
