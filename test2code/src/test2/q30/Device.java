package test2.q30;
import java.io.IOException;

public class Device implements AutoCloseable {
    String header = null;
    public void open(){
        header = "OPENED";
        System.out.println("Device Opened");
    }
    public String read() throws IOException{
        throw new IOException("Unknown");
    }
    public void writeHeader(String str) throws IOException{
        System.out.println("Writing : "+str);
        header = str;
    }
    public void close(){
        header = null;
        System.out.println("Device closed");
                                                        //throw new RuntimeException("RTE");
    }
    public static void testDevice(){
        try(Device d = new Device()){
            d.open();
            d.read();
            d.writeHeader("TEST");
            d.close();
        }catch(IOException e){
            System.out.println("Got Exception");
        }
    }
    public static void main(String[] args) {
        Device.testDevice();
    }
}

//What will be printed when the following code is compiled and run?
//Select 1 option:
//       !A. Device Opened
//           Device closed
//           Got Exception
//        B. Device Opened
//           Got Exception
//           Device closed
//        C. Device Opened
//           Got Exception
//        D. The code will not compile.
