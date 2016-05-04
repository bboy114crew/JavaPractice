/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studyandshare.Studyandshare.oo;

import java.io.*;




/**
 *
 * @author NgT
 */
public class unit45 {
    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");
        file.createNewFile();
        File directory = new File("new");
        directory.mkdir();
    }
}
