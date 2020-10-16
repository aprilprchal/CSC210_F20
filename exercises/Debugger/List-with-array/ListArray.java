/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amylarson
 */
public class ListArray {
    
    int numberOfItems = 0;
    
    Integer[] array = new Integer[5];
    
    public ListArray() {}
    
    public void add(int value) {
        array[numberOfItems] = value;
        ++numberOfItems;
    }
    
    public void addFirst(int value) {
        for (int i=numberOfItems; i<0; i--) {
            array[i] = array[i-1];
        }
        array[0] = value;
        ++numberOfItems;
    }
    
    public Integer removeLast() {
        if (0 == numberOfItems) {
            return null;
        }
        --numberOfItems;
        return array[numberOfItems];
    }  
    
    public void traverse() {
        for (int i=0; i<numberOfItems; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}
