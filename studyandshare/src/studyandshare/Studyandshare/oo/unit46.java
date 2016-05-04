/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studyandshare.Studyandshare.oo;

import java.io.*;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NgT
 */
public class unit46 {

    public static void main(String[] args) {
        try {
            File file = new File("blog.txt");
            file.createNewFile();
            
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            
            String data = "Nguythangkhtn";
            bw.write(data);
            bw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(unit46.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

}
