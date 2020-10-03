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

      System.out.println("\n\nSanity check test of add, length, peek.");
      System.out.println("If these initial tests do not pass, the rest of the tests are irrelevant!");
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
    System.out.println("\n\nTesting List constructor ...");

		// Test default constructor and getters
		List jams = new List ();
		assertEquals(2000, jams.capacity(), "List() capacity");
		assertEquals(0, jams.length(), "List() length");
		assertEquals(true, jams.isEmpty(), "List() isEmpty");

		// Test constructor with size parameter
    List songs = new List(5);
		assertEquals(0, songs.length(), "List(5) length");
    assertEquals(5, songs.capacity(), "List(5) capacity");
		assertEquals(true, songs.isEmpty(), "List(5) isEmpty");

		// Test length getter (tested at 0 above)
		songs.add(pil);
    assertEquals(1,songs.length(),"length()");

    // Test isEmpty and isFull.
		List tunes = new List(3);
		assertEquals(false, tunes.isFull(), "isFull - empty");
		assertEquals(true, tunes.isEmpty(), "isEmpty");

		tunes.add(pil);
		assertEquals(false, tunes.isFull(), "isFull - 1 of 3");
		assertEquals(false, tunes.isEmpty(), "isEmpty - 1 of 3");

		tunes.add(pil);
		tunes.add(pil);
		assertEquals(true, tunes.isFull(), "isFull - 3 of 3");
		assertEquals(false, tunes.isEmpty(), "isEmpty - 3 of 3");


  }

	public static void testSearches() {
		System.out.println("\n\nTesting List search methods ...");

    // check that search compares values (ignoring case), not references
		Song iggy = new Song("Dum Dum boys","Iggy pop","The idiot","1977");
		Song pil = new Song("Swan lake","Public image Ltd.","Second edition","1980");
		Song femmes = new Song("Add it up","violent femmes","violent femmes","1983");
		Song s = new Song("a", "b", "c");

		List songs = new List(5);
		songs.add(iggy);
		songs.add(pil);
		songs.add(femmes);

		//testing peek
		assertEquals(iggy,songs.peek(0),"Peek at index 0");
		assertEquals(pil,songs.peek(1),"Peek at index 1");
		assertEquals(femmes,songs.peek(2),"Peek at index 2");
		assertEquals(null,songs.peek(4), "Peek invalid >length");
		assertEquals(null,songs.peek(-1), "Peek invalid -1");

		//Testing find
		assertEquals(0, songs.find(iggy), "Find first");
		assertEquals(1, songs.find(pil), "Find middle");
		assertEquals(2,songs.find(femmes), "Find last");
		assertEquals(-1, songs.find(s), "find not in list");

		//Testing contains
		assertEquals(true, songs.contains(iggy),"Contains in list");
		assertEquals(false,songs.contains(s),"Contains() not in list.");
	}

  public static void testAdds() {
    System.out.println("\n\nTesting List add methods ...");

		// more songs to work with
		Song wire = new Song("Map Ref 41 Degrees", "Wire", "154", "1979");
		Song heat = new Song("A New Kind of Water","Fame" ,"Post-Punk","1981");
		Song tv = new Song("Dorian Gray","TV Personalities","Kids Love It","1981");
		Song sonic = new Song ("Death Valley","Sonic Youth","Bad Moon Rising");

		// add(Song) ------------------------------------------------
		List songs = new List(3);
		assertEquals(0,songs.length(),"pre-add (length)");
		songs.add(iggy);
		assertEquals(1,songs.length(),"add first (length)");
		assertEquals(iggy,songs.peek(0),"add first (value)");
		songs.add(pil);
		assertEquals(2,songs.length(),"add 2nd (length)");
		assertEquals(pil,songs.peek(1),"add 2nd (value)");
		songs.add(femmes);
		assertEquals(3,songs.length(),"add to capacity (length)");
		assertEquals(femmes,songs.peek(2),"add to capacity (value)");
		songs.add(iggy);
		assertEquals(3,songs.length(),"add attempt over capacity (length)");
		assertEquals(femmes,songs.peek(2),"add attempt over capacity (value)");


		// add(song, index) ------------------------------------------------
		List tunes = new List(6);
		// tunes = {iggy}
		tunes.add(iggy,0);
		assertEquals(1,tunes.length(),"add to empty (length)");
		assertEquals(iggy,tunes.peek(0),"add to empty (value)");
		// tunes = {pil, iggy}
		tunes.add(pil,0);
		assertEquals(2,tunes.length(),"add at 0 (length)");
		assertEquals(pil,tunes.peek(0),"add at 0 (value)");
		assertEquals(iggy,tunes.peek(1),"add at 0 (2nd song)");
		// tunes = {pil,iggy,femmes}
		tunes.add(femmes,2);
		assertEquals(3,tunes.length(),"add at end (length)");
		assertEquals(femmes,tunes.peek(2),"add at end (value)");
		assertEquals(pil,tunes.peek(0),"add at end (1st song)");
		assertEquals(iggy,tunes.peek(1),"add at 0 (2nd song)");
		// tunes = {pil,sonic,iggy,femmes}
		tunes.add(sonic,1);
		assertEquals(4,tunes.length(),"add to middle (length)");
		assertEquals(sonic,tunes.peek(1),"add to middle (value)");
		assertEquals(pil,tunes.peek(0),"add to middle (1st song)");
		assertEquals(iggy,tunes.peek(2),"add to middle (3rd song)");
		assertEquals(femmes,tunes.peek(3),"add to middle (4th song)");
		// test invalid indices
		tunes.add(wire,-1);
		assertEquals(4,tunes.length(),"add at -1 (length)");
		tunes.add(wire,5);
		assertEquals(4,tunes.length(),"add beyond last (length)");
		assertEquals(null,tunes.peek(5),"add beyond last (value)");
		tunes.add(wire,7);
		assertEquals(4,tunes.length(),"add beyond capacity (length)");


		// set(Song, index) ------------------------------------------------
		List jams = new List(6);
		// †his assumes that add is working correctly!
		jams.add(iggy);
		jams.add(pil);
		jams.add(femmes);
		// jams = {wire,pil,femmes}. Set at first element
		jams.set(wire,0);
		assertEquals(3,jams.length(),"set(0) length");
		assertEquals(wire,jams.peek(0),"set(0) value");
		assertEquals(pil,jams.peek(1),"set(0) (2nd song)");
		assertEquals(iggy,jams.peek(2),"set(0) (3rd song)");
		// jams = {wire,heat,femmes}. Set at middle element
		jams.set(heat,1);
		assertEquals(3,jams.length(),"set(1) length");
		assertEquals(heat,jams.peek(1),"set(1) value");
		assertEquals(wire,jams.peek(0),"set(1) (1st song)");
		assertEquals(femmes,jams.peek(2),"set(1) (3rd song)");
		// jams = {wire,heat,tv}. Set at last element
		jams.set(tv,2);
		assertEquals(3,jams.length(),"set(2) length");
		assertEquals(tv,jams.peek(2),"set(2) value");
		assertEquals(wire,jams.peek(0),"set(2) (1st song)");
		assertEquals(heat,jams.peek(1),"set(2) (2nd song)");
		//  invalid indices.
		jams.set(iggy,3);	// set 1 past the last element
		assertEquals(3,jams.length(),"set at length (length)");
		assertEquals(null,jams.peek(3),"set at length (value)");
		jams.set(pil,5);
		assertEquals(3,jams.length(),"set at capacity (length)");
		assertEquals(null,jams.peek(5),"set at capacity (value)");
		jams.set(pil,-1);
		assertEquals(3,jams.length(),"set at -1 (length)");
		assertEquals(null,jams.peek(0),"set at -1 (value)");
	}

	public static void testRemoves() {
		System.out.println("\n\nTesting List remove methods ...");

		Song sonic = new Song ("Death Valley","Sonic Youth","Bad Moon Rising");

		// remember to test numberOfItems as well as the removal of song in the list
		// don't forget to try erroneous input (e.g. bad index)
		// remove(index)

		// remove(Song) ------------------------------------------------
		// This is assuming add, length, contains is working!
		List songs = new List(5);
		songs.add(iggy);
		songs.add(pil);
		songs.add(femmes);
		songs.add(sonic);

		assertEquals(4,songs.length(),"pre-removal (length)");
		// songs = {iggy,femmes,sonic}
		songs.remove(pil);
		assertEquals(3,songs.length(),"remove middle (length)");
		assertEquals(false,songs.contains(pil),"remove middle");
		assertEquals(iggy,songs.peek(0),"remove middle (1st song)");
		assertEquals(femmes,songs.peek(1),"remove middle (2nd song)");
		assertEquals(sonic,songs.peek(2),"remove middle (3rd song)");
		// songs = {iggy,femmes}
		songs.remove(sonic);
		assertEquals(2,songs.length(),"remove at end (length)");
		assertEquals(false,songs.contains(sonic),"remove at end");
		assertEquals(iggy,songs.peek(0),"remove at end (1st song)");
		assertEquals(femmes,songs.peek(1),"remove at end (2nd song)");
		// songs = {femmes}
		songs.remove(iggy);
		assertEquals(1,songs.length(),"remove first (length)");
		assertEquals(false,songs.contains(iggy),"remove first");
		assertEquals(femmes,songs.peek(1),"remove first (1st song)");
		// songs = {}
		songs.remove(femmes);
		assertEquals(0,songs.length(),"remove last element (length)");
		assertEquals(false,songs.contains(femmes),"remove last");
		assertEquals(null,songs.peek(0),"remove last");

		// remove invalid song. list is empty
		songs.remove(femmes);
		assertEquals(0,songs.length(),"remove from empty");
		songs.add(pil);
		songs.remove(femmes);
		assertEquals(0,songs.length(),"remove not in list");
		assertEquals(pil,songs.peek(0),"remove not in list (1st song)");

		// remove(index) ------------------------------------------------
		songs = new List(5);
		songs.add(iggy);
		songs.add(pil);
		songs.add(femmes);
		songs.add(sonic);

		assertEquals(4,songs.length(),"pre-removal (length)");

		songs.remove(1);
		// songs = {iggy,femmes,sonic}
		assertEquals(3,songs.length(),"remove middle (length)");
		assertEquals(false,songs.contains(pil),"remove middle");
		assertEquals(iggy,songs.peek(0),"remove middle (1st song)");
		assertEquals(femmes,songs.peek(1),"remove middle (2nd song)");
		assertEquals(sonic,songs.peek(2),"remove middle (3rd song)");

		songs.remove(2);
		// songs = {iggy,femmes}
		assertEquals(2,songs.length(),"remove at end (length)");
		assertEquals(false,songs.contains(sonic),"remove at end");
		assertEquals(iggy,songs.peek(0),"remove at end (1st song)");
		assertEquals(femmes,songs.peek(1),"remove at end (2nd song)");

		songs.remove(0);
		// songs = {femmes}
		assertEquals(1,songs.length(),"remove first (length)");
		assertEquals(false,songs.contains(iggy),"remove first");
		assertEquals(femmes,songs.peek(1),"remove first (1st song)");

		songs.remove(0);
		// songs = {}
		assertEquals(0,songs.length(),"remove last element (length)");
		assertEquals(false,songs.contains(femmes),"remove last");
		assertEquals(null,songs.peek(0),"remove last");

		// remove invalid index. list is empty
		songs.remove(0);
		assertEquals(0,songs.length(),"remove from empty");
		songs.add(pil);
		songs.remove(1);
		assertEquals(0,songs.length(),"remove not in list");
		assertEquals(pil,songs.peek(0),"remove not in list (1st song)");
		songs.remove(-1);
		assertEquals(0,songs.length(),"remove at -1");
		assertEquals(pil,songs.peek(0),"remove at -1 (1st song)");


		// removeAll()
		songs = new List(5);
		songs.add(pil);
		songs.add(femmes);
		songs.add(iggy);
		assertEquals(3,songs.length(),"pre remove all (length)");
		songs.removeAll();
		assertEquals(0,songs.length(),"remove all (length)");
		assertEquals(false,songs.contains(pil),"remove all pil");
		assertEquals(false,songs.contains(femmes),"remove all femmes");
		assertEquals(false,songs.contains(iggy),"remove all iggy");
		assertEquals(null,songs.peek(0),"remove all");

	}

  public static void testConvert() {
    System.out.println("\n\nTesting List convert methods ...");

		Song[] array;

		// more songs to work with
		Song wire = new Song("Map Ref 41 Degrees", "Wire", "154", "1979");
		Song heat = new Song("A New Kind of Water","Fame" ,"Post-Punk","1981");
		Song tv = new Song("Dorian Gray","TV Personalities","Kids Love It","1981");
		Song sonic = new Song ("Death Valley","Sonic Youth","Bad Moon Rising");

		// Testing toArray ---------------------------------------------
		List songs = new List(4);
		if (null!=songs.toArray()) {
			System.out.println(
			"ERROR: toArray empty list. Expect null. Results not null.");
		}

    songs.add(iggy);
    array = songs.toArray();
		if (null==array) {
			System.out.println("ERROR: toArray 1 element. Returns null.");
		} else {
			assertEquals(1,array.length,"toArray 1 element (length)");
    	assertEquals(array[0], iggy, "toArray 1 element (value)");
		}

		songs.add(pil); // songs = {iggy,pil}
		array = songs.toArray();
		if (null==array) {
			System.out.println("ERROR: toArray 2 elements. Returns null.");
		} else {
			assertEquals(2,array.length,"toArray 2 elements (length)");
			assertEquals(array[0], iggy, "toArray 2 elements (1st song)");
			assertEquals(array[1], pil, "toArray 2 elements (2nd song)");
		}

		songs.add(femmes);
		songs.add(sonic); // songs = {iggy,pil,femmes,sonic}
		array = songs.toArray();
		if (null==array) {
			System.out.println("ERROR: toArray at capacity. Returns null.");
		} else {
			assertEquals(4,array.length,"toArray at capacity (length)");
			assertEquals(array[0], iggy, "toArray at capacity (1st song)");
			assertEquals(array[1], pil, "toArray at capacity (2nd song)");
			assertEquals(array[2], femmes, "toArray at capacity (3rd song)");
			assertEquals(array[3], sonic, "toArray at capacity (4th song)");
		}

		// Testing sublist ---------------------------------------------
		List sublist = null;
		List tunes = new List(5);

		sublist = tunes.sublist(0,1);
		if (null!=sublist) {
			System.out.println(
			"ERROR: Sublist of empty list. Expect null. Results not null.");
		}
		tunes.add(iggy);
		tunes.add(pil);
		tunes.add(femmes);
		tunes.add(sonic);
		tunes.add(wire);

		// tunes = {iggy,pil,femmes,sonic,wire}
		sublist = tunes.sublist(0,4);
		if (null==sublist) {
			System.out.println("ERROR: sublist all elements. Returns null.");
		} else {
			assertEquals(5,sublist.length(),"sublist all elements (length)");
			assertEquals(iggy,sublist.peek(0),"sublist 1st song");
			assertEquals(pil,sublist.peek(1),"sublist 2nd song");
			assertEquals(femmes,sublist.peek(2),"sublist 3rd song");
			assertEquals(sonic,sublist.peek(3),"sublist 4th song");
			assertEquals(wire,sublist.peek(4),"sublist 5th song");
		}
		// tunes = {iggy,pil,femmes,sonic,wire}
		sublist = tunes.sublist(1,3);
		if (null==sublist) {
			System.out.println("ERROR: sublist middle elements. Returns null.");
		} else {
			assertEquals(3,sublist.length(),"sublist middle elements (length)");
			assertEquals(pil,sublist.peek(0),"sublist middle 1st song");
			assertEquals(femmes,sublist.peek(1),"sublist middle 2nd song");
			assertEquals(sonic,sublist.peek(2),"sublist middle 3rd song");
		}

		// tunes = {iggy,pil,femmes,sonic,wire}
		sublist = tunes.sublist(0,0);
		if (null==sublist) {
			System.out.println("ERROR: sublist first only. Returns null.");
		} else {
			assertEquals(1,sublist.length(),"sublist first only (length)");
			assertEquals(iggy,sublist.peek(0),"sublist first only");
		}

		// tunes = {iggy,pil,femmes,sonic,wire}
		sublist = tunes.sublist(4,4);
		if (null==sublist) {
			System.out.println("ERROR: sublist last only. Returns null.");
		} else {
			assertEquals(1,sublist.length(),"sublist last only (length)");
			assertEquals(wire,sublist.peek(0),"sublist last only");
		}

		// tunes = {iggy,pil,femmes,sonic,wire}
		sublist = tunes.sublist(0,6);
		if (null!=sublist) {
			System.out.println(
			"ERROR: sublist invalid end index. Expect null. Results not null.");
		}
		sublist = tunes.sublist(-1,1);
		if (null!=sublist) {
			System.out.println(
			"ERROR: sublist invalid start index. Expect null. Results not null.");
		}
		sublist = tunes.sublist(3,1);
		if (null!=sublist) {
			System.out.println(
			"ERROR: sublist end<start index. Expect null. Results not null.");
		}
  }

  static void assertEquals(Song expect, Song result, String msg) {
		if (null==expect && null==result) {
			return;
		}
		if (null==expect || !expect.equals(result)) {
      System.out.println("ERROR: "+msg+". Expected "+expect+". Result "+result);
    }
  }

  static void assertEquals(int expect, int result, String msg) {
    if (expect != result) {
      System.out.println("ERROR: "+msg+". Expected "+expect+". Result "+result);
    }
  }
	static void assertEquals(boolean expect, boolean result, String msg) {
		if (expect != result) {
			System.out.println("ERROR: "+msg+". Expected "+expect+". Result "+result);
		}
	}
} // end class Main
