package test2.q16;

public class StaticTest {
    static {
        System.out.println("In static");
    }
    {
        System.out.println("In non - static");
    }
    public static void main(String args[ ]) {
        StaticTest st1; // line 1
        System.out.println(" 1 ");
        st1 = new StaticTest(); // line 2
        System.out.println(" 2 ");
        StaticTest st2 = new StaticTest(); // line 3
    }
}

//Select 1 option:
//       !A. In static, 1, In non - static, 2, In non - static :in that order.
//        B. Compilation error.
//        C. 1, In static, In non - static, 2, In non - static : in that order.
//        D. In static, 1, In non - static, 2, In non - static : in unknown order.
