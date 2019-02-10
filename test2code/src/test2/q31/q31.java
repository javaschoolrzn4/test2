package test2.q31;

import java.io.FileReader;
import java.sql.Connection;

public class q31 {
    public void readData(String fileName) throws Exception {
        try(FileReader fr1 = new FileReader(fileName)){
            Connection c = getConnection();
            //...other valid code
        }
    }

                                private Connection getConnection() throws Exception { throw new ClassNotFoundException(); }

                                public static void main(String[] args) {
                                    try {
                                        new q31().readData("C:\\Windows\\win.ini");
                                    } catch (Throwable t) {
                                        System.out.println(t.getClass().getCanonicalName());
                                    }
                                }
}

//    Given that getConnection method throws ClassNotFoundException and that an IOException is thrown while
//    closing fr1, which exception will be received by the caller of readData() method?
//    Select 1 option:
//    A. java.lang.Exception
//   !B. java.lang.ClassNotFoundException
//    C. java.io.IOException
//    D. java.lang.RuntimeException
