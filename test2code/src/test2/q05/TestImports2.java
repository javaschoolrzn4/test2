package test2.q05;

import test2.q05.MyClass;
public class TestImports2 {
    public static void main(String[] args) {
        MyClass.howdy(); // line 14
        System.out.print(MyClass.myConstant + " "); // line 15
//        System.out.print(myConstant + " "); // line 16
//        howdy(); // line 17
//        System.out.print(mc.instVar + " "); // line 18
//        System.out.print(instVar + " "); // line 19
    }
}

//    What is the result?
//        Choose all that apply:
//        A. howdy 343 343 howdy 42 42
//        B. Compilation fails due to an error on line 14.
//        C. Compilation fails due to an error on line 15.
//       !D. Compilation fails due to an error on line 16.
//       !E. Compilation fails due to an error on line 17.
//       !F. Compilation fails due to an error on line 18.
//       !G. Compilation fails due to an error on line 19.
