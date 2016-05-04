/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studyandshare.Studyandshare.oo;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author NgT
 */
public class unit50 {

    public static void main(String[] args) {
        ArrayList<E> al = new ArrayList<E>();
        al.add(new E());
        al.add(new E());
        for (int i = 0; i < al.size(); i++) {
            al.get(i).show();
        }
        HashMap<String, F> map = new HashMap<>();
        map.put("Nguy", new F());
//        map.put(new Integer(2), new F());
    }
}

class E {

    public void show() {

    }
}

class F {

    public void show() {

    }
}
