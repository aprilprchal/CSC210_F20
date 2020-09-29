import java.lang.reflect.*;
import java.util.Scanner;
import java.io.*;

public class TestList {

  static Song iggy = new Song("Dum Dum Boys","Iggy Pop","The Idiot","1977");
  static Song pil = new Song("Swan Lake","Public Image Ltd.","Second Edition","1980");
  static Song femmes = new Song("Add It Up","Violent Femmes","Violent Femmes","1983");

  public static void main(String[] args) {
    
    // Initial add() and peek() test
    /* It is a bit of a chicken-and-egg problem. 
    * To test add(), peek() needs to be correct to confirm song was added.
    * To test peek(), add() needs to be correct to confirm location of song.
    */
    List songs = new List(5);
    songs.add(iggy);
    assertEquals(1,songs.length(),"First Add (length)");
    assertEquals(iggy,songs.peek(0),"Fird Add (iggy)");
    /* Once the above are confirmed to be working, the rest of the testing can proceed.
    */

    testConstructorGetters();
    testSearches();
    testAdds();
    testRemoves();
    testConvert();
  }


  public static void testConstructorGetters() {
    System.out.println("Testing List constructor ...");
    // length
    // capacity
    // isFull
    // isEmpty
  }

  public static void testSearches() {
    System.out.println("Testing List search methods ...");
    // check that the assertEquals compares values, ignoring case, not references
    // don't forget to try erroneous input (e.g. bad index)
    // peek(index)
    // find(song)
    // contains(song)
  }

  public static void testAdds() {
    System.out.println("Testing List add methods ...");
    // remember to test numberOfItems as well as the song in the list
    // don't forget to try erroneous input (e.g. bad index, over capacity)
    // add(Song)
    // add(Song, index)
    // set(Song, index)
  }

  public static void testRemoves() {
    System.out.println("Testing List remove methods ...");
    // remember to test numberOfItems as well as the removal of song in the list
    // don't forget to try erroneous input (e.g. bad index)
    // remove(index)
    // remove(Song)
    // removeAll()
  }

  public static void testConvert() {
    System.out.println("Testing List convert methods ...");
    // remember to test numberOfItems as well as the removal of song in the list
    // don't forget to try erroneous input (e.g. bad index)
    // Song[] toArray()
    // List sublist(start,end)
  }
  
  static void assertEquals(Song expect, Song result, String msg) {
    if (!expect.equals(result)) {
      System.out.println(msg+". Expected "+expect+". Result "+result);
    }
  }

  static void assertEquals(int expect, int result, String msg) {
    if (expect != result) {
      System.out.println(msg+". Expected "+expect+". Result "+result);
    }
  }
} // end class Main
