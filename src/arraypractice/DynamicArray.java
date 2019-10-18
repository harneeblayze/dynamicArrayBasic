/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraypractice;

/**
 *
 * @author appzone
 */
public class DynamicArray<String> {
    private int initialCapacity;
    private Object[]data;
    private int size;
    
    public DynamicArray(int initCap){
        initialCapacity = initCap;
        data = new Object[initialCapacity];
    }
    
    public String get(int index){
        return (String)data[index];
        
    }
    
    public void set(int index, String item){
        if(data!= null){
            data[index] = item;
        }
    
    }
    
    public boolean isEmpty(){
        return size == 0;
    }
    
    public void insert(int index, String item){
        if(data.length == initialCapacity)
            resize();
        
        size = data.length;
        for (int i = size-1; i > index; i--) {
                  data[i] = data[i-1];
                
            }
            data[index] = item;
            size++;
            //initialCapacity = ini
            
        
    }
    
    public void delete(int index){
        if(data == null)
            return;
        if(index!= data.length-1){
        for (int i = index; i < data.length; i++) {
            data[i] = data[i+1];
            
        }
        size --;
        
        }else{
            size--;
        }
    }
    
    public void resize(){
        if(data == null)
            return;
        //double the capacity
        
        Object[]fresh = new Object[initialCapacity*2];
        for (int i = 0; i < data.length; i++) {
              fresh[i] = data[i];
            
        }
        data = fresh;
        initialCapacity = initialCapacity * 2;
        fresh = null;
        
    }
    
    public boolean contains(String item){
        if(data == null)
            return false;
        for (int i = 0; i < data.length; i++) {
            if(data[i].equals(item)){
                return true;
            }
            
            //Object object = data[i];
            
        }
        return false;
    }
    
}
