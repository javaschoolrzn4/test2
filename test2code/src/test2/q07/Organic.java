package test2.q07;

public class Organic<E> {
    void react(E e) { }
    static void main(String[] args) {
        // Organic<? extends Organic> compound = new Aliphatic<Organic>(); // line 5
        // Organic<? super Aliphatic> compound = new Aliphatic<Organic>(); // line 6
//        compound.react(new Organic()); // line 7
//        compound.react(new Aliphatic()); //line 8
//        compound.react(new Hexane()); // line 9
    }
}
class Aliphatic<F> extends Organic<F> { }
class Hexane<G> extends Aliphatic<G> { }

//Which, taken independently, are true?
//        Choose all that apply:
//       !A. If line 5 is uncommented, compilation fails due to an error at line 7.
//       !B. If line 5 is uncommented, compilation fails due to an error at line 8.
//       !C. If line 5 is uncommented, compilation fails due to an error at line 9.
//       !D. If line 6 is uncommented, compilation fails due to an error at line 7.
//        E. If line 6 is uncommented, compilation fails due to an error at line 8.
//        F. If line 6 is uncommented, compilation fails due to an error at line 9.
