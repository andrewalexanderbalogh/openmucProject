package com.mitechisys;

import org.openmuc.jrxtx.Parity;
import org.openmuc.jrxtx.SerialPort;
import org.openmuc.jrxtx.SerialPortBuilder;

public class OpenmucTest {
    // see https://openmuc.github.io/jrxtx/javadoc/index.html

    public static void main(String[] args) throws Throwable {
        System.setProperty("java.library.path", "/usr/lib/jni");
        String currentSystemPath = System.getProperty("java.library.path");
        System.out.println("Starting Openmuc Test...");

        // some stack-overflow example: https://stackoverflow.com/questions/52697598/java-rxtxcomm-lib-does-not-load-or-is-not-to-be-found
        try {
            SerialPort port = SerialPortBuilder.newBuilder("/dev/ttyACM0").setBaudRate(9600).setParity(Parity.NONE).build();
        }
        catch (Throwable throwable){
            System.out.println(throwable.getMessage());
        }

        System.out.println("Ending Openmuc Test...");
    }
}
