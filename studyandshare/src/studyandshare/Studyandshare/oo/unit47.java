/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studyandshare.Studyandshare.oo;

/**
 *
 * @author NgT
 */
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class unit47 {

    public static void main(String[] args) {
        File file = new File("blog.txt");

        try {
            FileReader fr = new FileReader(file);

            BufferedReader br = new BufferedReader(fr);

            String line = "";
            int i = 0;
            try {
                while ((line = br.readLine()) != null) {
                    System.out.println(++i + ": " + line);
                }
                br.close();
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(unit47.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(unit47.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
