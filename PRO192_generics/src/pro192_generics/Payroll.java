/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro192_generics;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author NgT
 */
public class Payroll<E> {
    
    List<E> resource = new ArrayList<E>();
    
    public void add(E x){
        resource.add(x);
        
    }
    
    public void remove(E x){
        resource.remove(x);
    }
    
    public E getLastElement(){
        if (resource.size() > 0){
            return resource.get(resource.size()- 1);
        }
        else {
            return null;
            
        }
    }
    
}
