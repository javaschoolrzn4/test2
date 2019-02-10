package test2.q15;

public class Outer
{
    int i = 10;
    class Inner
    {
        public void methodA()
        {
            //line 1.
            //System.out.println(this.i);
            System.out.println(i);
            System.out.println(Outer.this.i);
        }
    }
}

//    Which of the following statements are valid at line 1.
//        Select 2 options:
//        A. System.out.println(this.i);
//       !B. System.out.println(i);
//       !C. System.out.println(Outer.this.i);
//        D. 'i' cannot be accessed inside the inner class method.
//        E. The code cannot be compiled.
