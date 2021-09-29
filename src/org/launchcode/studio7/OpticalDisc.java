package org.launchcode.studio7;
//abstract class

public interface OpticalDisc {

 //   public static boolean loadDisc() {
 //       return true;
 //    }

    void spinDisc();
    void readData();
    void writeData(String name, String contents);
    void getInfo();

}
