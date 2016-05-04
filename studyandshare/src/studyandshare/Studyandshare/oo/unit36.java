/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studyandshare.Studyandshare.oo;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author NgT
 */
public class unit36 {

    public int increase(int a){
        return a + 7;
    }
    
    public unit35 create() throws FileNotFoundException{
        return new unit35();
    }
}

class Tutorial36 {

    public int increase(int a) {
        return a + 5;
    }

    public Tutorial35 create() throws IOException{
        return new Tutorial35();
    }
}
