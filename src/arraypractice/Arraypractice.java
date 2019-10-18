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
public class Arraypractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        DynamicArray group = new DynamicArray<String>(5);
        System.out.println(group.isEmpty());
        group.insert(0, "v");
        System.out.println(group.get(0));
        group.set(0, "r");
        group.set(3, "d");
        
        System.out.println(group.get(6));
        System.out.println(group.get(0));
        
        // TODO code application logic here
    }
    
}
