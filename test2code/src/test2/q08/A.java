package test2.q08;

public interface A {

//    volatile String NAME ="Name";
//    transient String NAME ="Name";
//    public static final String NAME="Name";

    default void m(){
        System.out.println("A.m()");
    }
}
