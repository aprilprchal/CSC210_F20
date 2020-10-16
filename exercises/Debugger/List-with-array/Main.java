/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amylarson
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Create a list, copy it, pass it -- all the same object!
        ListArray list = new ListArray();
        ListArray list2 = list;
        helper(list2);
        // This is the ADDRESS of the object
        System.out.println("list "+list);
        
        // add some elements to the end and print results
        list.add(10);
        list.add(15);
        list.add(20);
        list.traverse();
        
        // let's try adding to the front and see results
        list.addFirst(5);
        list.traverse();
        
        // let's try removing things
        System.out.println("removed "+list.removeLast());
        list.traverse();
        
        // add over capacity
        list.add(25);
        list.add(30);
        list.traverse();
    }
    
    public static void helper(ListArray listH) {
        listH.add(100);
    }
    
}
