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
        
        // Create a new list and add stuff (to the front)
        List list = new List();
        list.add(5);
        list.add(10);
        list.add(15);
        list.traverse();
        //  What does the head and tail look like?
        System.out.println("Head "+list.first());
        System.out.println("Tail "+list.last());

        // Add an element to the end
        list.addEnd(20);
        list.traverse();
        
        // Remove the first element (twice)
        Integer first = list.removeFirst();
        first = list.removeFirst();
        list.traverse();
    }
    
}
