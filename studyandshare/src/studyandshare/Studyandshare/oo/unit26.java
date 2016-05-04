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
public class unit26 {
    public static void main(String[] args) {
        ReferentBook book = new ReferentBook();
        book.move();
    }
}

interface Document {

    void show();
}

interface ReferentDoc extends Document {

}

class Book implements Document {

    public void show() {

    }
    
    public void move(){
        
    }
}

class Paper implements Document {

    public void show() {

    }
}

class ReferentBook extends Book implements Document, ReferentDoc {

}
