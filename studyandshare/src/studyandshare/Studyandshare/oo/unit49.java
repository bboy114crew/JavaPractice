/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studyandshare.Studyandshare.oo;

import java.util.HashMap;

/**
 *
 * @author NgT
 */
public class unit49 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("hay", "ho");
        map.put("dep", "zai");
        map.put(new Integer(5), "the");
        map.put("dep", "gai");
        System.out.println(map.get("hay"));
        System.out.println(map.get("dep"));
        map.clear();
        System.out.println(map.get("dep"));
        
    }
}
