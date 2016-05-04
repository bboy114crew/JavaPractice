
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author NgT
 */
public class Demo04_collection {

    public static void main(String[] args) {
        List lstEmployee = new LinkedList();
        lstEmployee.add("Nguy Van Thang");
        lstEmployee.add("Hoang Anh Khang");
        lstEmployee.add("Luu Thanh Cong");
        lstEmployee.add("Nguy Van Thang");
        /*
        Demo04_clollection obj = new Demo04_clollection();
        obj.dumClollectiom(lstEmployee);
         */
        dumpCollection(lstEmployee);

        System.out.println("---------HashSet Part---------");
        Set setGender = new HashSet();
        setGender.add(new String("Nam").toLowerCase());
        setGender.add(new String("Nu").toLowerCase());
        setGender.add(new String("nam").toLowerCase());
        setGender.add(new String("nu").toLowerCase());
        //setGender.removeAll(setGender);
        Set setNewGender = new HashSet();
        //setNewGender = setGender;
        //setNewGender co cung dia chi voi setGender
        //chu khong copy phan tu cua setGender sang setNewGender

        int N = setGender.size();
        Iterator iter = setGender.iterator();
        for (int k = 0; k < N; k++) {
            setNewGender.add(iter.next());

        }

        setNewGender.add(new String("Dong Tinh").toLowerCase());
        dumpCollection(setNewGender);
        setNewGender.removeAll(setGender);
        dumpCollection(setNewGender);

        System.out.println("---------SortedSet Part---------");
        SortedSet treeSet = new TreeSet();
        treeSet.add("1");
        treeSet.add("3");
        treeSet.add("4");
        treeSet.add("2");
        
        
        dumpCollection(treeSet);
        //tu sap xep theo thu tu tang dan

        System.out.println("---------LinkedHashSet Part---------");
        LinkedHashSet lnkHashset = new LinkedHashSet();
        lnkHashset.add("one");
        lnkHashset.add("two");
        lnkHashset.add("three");
        lnkHashset.add("four");
        dumpCollection(lnkHashset);

        System.out.println("---------Map Part---------");
        Map map1 = new HashMap();
        map1.put("key1", "J");
        map1.put("key2", "K");
        map1.put("key3", "L");
        map1.put("key4", "M");
        dumpCollection(map1.keySet());
        dumpCollection(map1.values());

        System.out.println("---------SortedMap Part---------");
        SortedMap map2 = new TreeMap();
        map2.put("key1", "JJ");
        map2.put("key4", "MM");
        map2.put("key3", "LL");
        map2.put("key2", "KK");

        dumpCollection(map2.keySet());
        dumpCollection(map2.values());

        System.out.println("---------LinkedHashMap Part---------");
        LinkedHashMap map3 = new LinkedHashMap();
        map3.put("key1", "JJJ");
        map3.put("key2", "KKK");
        map3.put("key3", "LLL");
        map3.put("key4", "MMM");
        displayAll(map3.keySet());
        displayAll(map3.values());
    }

    public static void dumpCollection(Collection c) {
        int N = c.size();
        System.out.println("So phan tu cua collection c la: " + N);
        Iterator i = c.iterator();
        int j = 0;
        while (i.hasNext()) {
            System.out.println("Element(" + j++ + ")" + i.next());
        }
    }

    public static void displayAll(Collection c) {
        dumpCollection(c);
    }
}
