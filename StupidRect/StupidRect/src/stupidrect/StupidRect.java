/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stupidrect;

/**
 *
 * @author pc
 */
public class StupidRect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rect a = new Rect("A", 10, 10, 100, 100);
        Rect b = new Rect("B", 50, 50, 100, 100);
        Rect c = new Rect("C", 70, 70, 100, 100);
        Rect d = new Rect("D", 500, 500, 100, 100);

        RectCollection collection = new RectCollection();
        collection.add(a);
        collection.add(b);
        collection.add(c);
        collection.add(d);

        collection.displayIntersections();

    }

}
