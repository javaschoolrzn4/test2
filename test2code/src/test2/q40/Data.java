package test2.q40;

public class Data implements java.io.Serializable {
    public static String f1;
    public static transient int f2;
    public transient boolean f3;
    public final static String f4 = "4";
    public String f5 = "5";


    @Override
    public String toString() {
        return "Data{" +
                "f1=" + f1 +
                ", f2=" + f2 +
                ", f3=" + f3 +
                ", f4=" + f4 +
                ", f5='" + f5 + '\'' +
                '}';
    }
}
