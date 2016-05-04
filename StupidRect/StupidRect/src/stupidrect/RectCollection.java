/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stupidrect;

import java.util.ArrayList;

/**
 *
 * @author pc
 */
public class RectCollection {

    private ArrayList<Rect> list = new ArrayList<>();

    public void add(Rect rect) {
        list.add(rect);
    }

    public Rect get(int index) {
        return list.get(index);
    }

    public void displayIntersections() {
        ArrayList<String> intersects = new ArrayList<>();

        for (Rect a : list) {
            for (Rect b : list) {
                if (a != b) {
                    if (a.isIntersection(b)) {
                        if (!isExist(intersects, a.label + "," + b.label)
                                && !isExist(intersects, b.label + "," + a.label)) {
                            intersects.add(a.label + "," + b.label);
                        }
                    }
                }
            }
        }

        for (String intersect : intersects) {
            System.out.println(intersect.replace(",", " intersect with "));
        }
    }

    public boolean isExist(ArrayList<String> list, String item) {
        for (String check : list) {
            if (check.equals(item)) {
                return true;
            }
        }
        return false;
    }
}
