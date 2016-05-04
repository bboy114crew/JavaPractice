/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro192_08_io;

import java.io.*;

/**
 *
 * @author NgT
 */
public class WriteReadFileText {
    public static void main(String[] args) {
        
        try {
            String filename = "D:\\test.txt";
            File file = new File(filename);
            if (file.exists()) {
                System.out.println("This" + file.getAbsolutePath() + "is exists!");
                RandomAccessFile raf = new RandomAccessFile(file, "rw");
                System.out.println("Filesize: " + raf.length() + " byte");
                
                //di chuyen ve cuoi file de ghi bo sung
                
                raf.seek(raf.length());
                //raf.writeChars("Hello");
                raf.writeInt(1);
                raf.writeInt(2);
                raf.writeInt(3);
                raf.writeChars("Hello");
                System.out.println("Filesize: " + raf.length() + " byte");
                raf.seek(0);
                System.out.println(raf.readInt());
                System.out.println(raf.readInt());
                System.out.println(raf.readInt());
                System.out.println(raf.readLine());
                raf.close();
                
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        
    }
}
