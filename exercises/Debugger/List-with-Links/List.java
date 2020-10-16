/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amylarson
 */
public class List {
    
    class Node {
        Integer data = null;
        Node next = null;
        
        Node(Integer d) {
            data = d;
        }
    }
    
    /** Reference to the first element */
    private Node head = null;
    /** Reference to the last element */
    private Node tail = null;
    
    /** Default constructor -- does nothing. */
    public List() {}
    
    // Getters for head and tail
    public Node first() { return head; }
    public Node last() { return tail; }
    
    /** Add to the front of the list.
     * 
     * @param value data to be added 
     */
    public void add(Integer value) {
        Node n = new Node(value);
        head = n;
        n.next = head;
    }
    
    /** Add element to the end of the list.
     * 
     * @param value to be added 
     */
    public void addEnd(Integer value) {
        Node n = new Node(value);
        if (tail==null) {
            head = n;
            tail = n;
            return;
        }
        tail.next = n;
        tail = n;
    }
    
    /** Remove front element of the list.
     * @return data in first node or null if list empty
     */
    public Integer removeFirst() {
        Integer data = head.data;
        head = head.next;
        return data;
    }
    
    /** Traverse and print list from head to tail
     * 
     */
    public void traverse() {
        System.out.print("List is ");
        Node p = head;
        while (null != p) {
            System.out.print(p.data+" --> ");
            p = p.next;
        }
        System.out.println("null");
    }
}
