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
public class ListFile {
    public static void main(String[] args) {

        System.out.println("Let ke cac file, thu muc con cua thu muc C:\\temp");
        int depth = 0;
        String path = "D:\\Music and video";
        //path = "Thang04385.dat";

        try {
            File file = new File(path);
            //file.createNewFile();
            //System.out.println("Duong dan tuyet doi den file moi tao la: " +file.getAbsolutePath());
            LietKe_DeQuy(file, depth);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

    }

    private static void LietKe_DeQuy(File file, int depth) {
        try {
            if (file.isDirectory()) {
                String[] lstFile = file.list();
                System.out.println("So con cua " + file.getAbsolutePath() + "la: " + lstFile.length);
                //indent (xu li lui voa theo do sau

                for (int k = 0; k < lstFile.length; k++) {
                    for (int j = 0; j < depth; j++) {
                        System.out.print("\t");
                    }
                    //in ra ten file / thu muc
                    System.out.println(lstFile[k]);
                    
                    //kiem tra xem no la thu muc thi goi de quy.
                    File child = new File(file, lstFile[k]);
                    if (child.isDirectory()) {
                        LietKe_DeQuy(child, depth+1);
                    } 
                    
                }
            } else {
                System.out.println("Error: " + file.getAbsoluteFile() + "is a file , so we cannot list out file list");

            }

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
