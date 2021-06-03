/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aggregations;


import java.io.Serializable;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author admin
 * @param <T>
 */


public class AssociatedList <T> implements Serializable {

   public List <T> elements;
   
   public  AssociatedList(){
        this.elements = new LinkedList<>();
    }
    
    public void addElement (T element){
     
       elements.add(element);
    }
      
    public <T> boolean removeElement(T element){
        return elements.remove(element);
    }
    


    public void modifyElement(T search, T newElement){
        
        int index = elements.indexOf(search);
        if(index >= 0){
            elements.set(index,newElement);
        }
    }
    
    public <T> T getElementat(int i){
        return (T) elements.get(i);
    }
    
    public void sortElement(Comparator comp){
        Collections.sort(elements, comp);
    }
    
    public List<T> getElements(){
        return this.elements;
    }
    
    
    public LinkedList<T> searchElement (Comparator c,T key){
    
       LinkedList<T> results = new LinkedList<>();
       ListIterator<T> i = elements.listIterator();
       
       while(i.hasNext()){
           T temp = i.next();
           if(c.compare(temp,key)==0){
               results.add(temp);  
           }
       }
      return results;
    }
    
    public int GetLength(){
        return elements.size();
    }
   
    @Override
    public String toString(){
        Iterator <T> iter;
        iter = elements.listIterator();
        String str = "";
        
        while(iter.hasNext()){
            
            str += iter.next().toString()+"\n";
        }
        
        return str;
    }


   


}
 

  
