/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro192_08_io;

import java.io.File;

/**
 *
 * @author NgT
 */
public class PRO192_08_IO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //text, binary, object
        //Try to creat a new file named test.txt in C driver
        //append : ghi co bo sung
        //overwrite : ghi de
        try {
            String filename = "D:\\test.txt";
            File f = new File(filename);
            if (f.exists()) {
                System.out.println("This" + filename + "is exist! So you can creat new file!");
                
            } else if(f.createNewFile()){
                System.out.println("Creat a new file is successfully");
            } else {
                System.out.println("Application can not creat a new file");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
    
}
