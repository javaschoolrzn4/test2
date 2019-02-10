package test2.q40;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class q40 {

    static final String name = "tmp.ser";

    public static void write() throws Exception {

        Data d = new Data();
        d.f1 = "f1";
        d.f2 = 2;
        d.f3 = true;

        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(name));
        os.writeObject(d);
        os.close();
    }

    public static void read() throws Exception  {
        ObjectInputStream is = new ObjectInputStream(new FileInputStream(name));
        Data d = (Data) is.readObject();
        System.out.println(d);
    }

    public static void main(String[] args) throws Exception {
        //write();
        //read();
    }

}

//        Which fields of the above class will be preserved when the object referred to by the variable 'd' is serialized and
//        deserialized in another JVM?
//        Select 1 option:
//        A. f1, f4, f5
//        B. f4, f5
//        C. f5
//        D. f3, f5
