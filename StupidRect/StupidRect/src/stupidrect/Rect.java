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
public class Rect {

    public String label;
    public int x;
    public int y;
    public int w;
    public int h;

    public Rect(String label, int x, int y, int w, int h) {
        this.label = label;
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    public boolean isIntersection(Rect rect) {
        int x_overlap = Math.max(0, Math.min(this.x + this.w, rect.x + rect.w) - Math.max(this.x, rect.x));
        int y_overlap = Math.max(0, Math.min(this.y + this.h, rect.y + rect.h) - Math.max(this.y, rect.h));
        return x_overlap * y_overlap > 0;
    }

}
