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
public class unit41 {
    public static void main(String[] args) {
        BookCase bc = new BookCase();
        bc.setColor("Red");
        System.out.println(bc.getColor());
        bc.setColor("Black");
        System.out.println(bc.getColor());
    }
}

class BookCase{
    private int size;
    private String color;
    private boolean good;

    public boolean isGood() {
        return good;
    }

    public void setGood(boolean good) {
        this.good = good;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
}
