### Lab 4 : Using Generics with a LIST Abstract Data Type
#### Due Tuesday, October 13 before lab
#### Submit a single zipped file to Moodle

<hr>

Learning Outcomes:

- Be able to implement a _List_ using generics.
- Be able to implement a _List_ using an interface.

<hr>

General Requirements:

1. Create an `interface List`.
2. Modify the `class List` to implement the interface (renamed `ListArray`).
3. Modify the `class ListArray` to use generics `<T>`
4. Extend functionality of _ListArray_
3. Document all code with Javadocs.

<hr>

Start by creating a new project with all of your code from Lab3. You will be modifying this code to create a new class `ListArray` that implements an interface and makes use of generics. Essentially, we are writing the `ArrayList` class provided by Java. This will give you experience creating your own abstract data type (ADT), so that you can better understand how using different basic data structures impact the efficiency of the ADT operations.


#### Create Lab3 Project

> These directions are for those using NetBeans, but it doesn't mean you have to use NetBeans as your IDE.

1. In NetBeans, create a new ANT project _Lab4_. Be sure to NOT create a main.

2. Go to your finder, locate the _Lab3_ _src_ folder and copy all the _.java_ files. Paste them into the _Lab4_ _src_ folder.

3. Return to NetBeans and make sure the files now appear in the project sidebar (you might have to restart NetBeans.) You can now edit your new project.

#### Lists Using Generics

The next step is to incorporate the use of generics, so that your data structure implementation can be used with any type of object, not just songs.

1. In _List.java_, change the class definition to:
  ```
  public class List<T>
  ```

2. In _List.java_, change all `Song` type references to type `T`. Use your editor's find-and-replace (and you probably want to make sure it is case sensitive when it looks for Song). Then change all variables `song` to `item` or whatever generic variable name you like.

3. In _List.java_ in the constructor, modify the code so that it suppresses the warning about declaring a generic type array.
  ```
  public List(int size) {
    capacity = size;
    // from Frank Carrano : Data Structures
    // cast is safe because new array contains null entries
    @SuppressWarnings("unchecked")
    T[] tempArray = (T[]) new Object[capacity];
    items = tempArray;
  }
  ```

4. In the method _List.sublist()_, change the return type to `List<T>`.

5. In _TestList.java_ , replace all the _List_ type declarations with _List<Song>_. For example on line 21, the line is `List songs = new List(5);`, but now it should be	`List<Song> songs = new List<Song>(5);`. (By the way, the compiler is fine with `List<Song> songs = new List<>(5)`.) Again, use your editor's find-and-replace. There are a lot of comments that contain the word "List", you can leave them as is or change them -- your choice. 

6. In `SongList.java`, change the class definition to extend `List<Song>`

7. Compile and run `TestList.java` to ensure everything is functional by looking at the results of your tests.

6. Adjust Javadocs documentation as appropriate.

### LISTS with an Interface

As part of the project, you will be creating a second implementation of a List using a linked list basic data structure. In preparation, you will create a List interface.  

7. In the src directory of the Lab4 lab, **copy _List.java_ to a new file _ListArray.java_**. (You probably want to do this outside of NetBeans.)

8. In _List.java_,
  - change `class` to `interface`,
  - remove the constructors,
  - remove toString,
  - remove all definitions (keeping each only as a declaration),
  - remove all member variables

9. In _ListArray.java_,
  - change the class name to _ListArray_,
  - have it implement the _List_ interface,
  - add `@Override` to methods, as appropriate.

10. In _SongList.java_, change it to extend _ListArray<Song>_, rather than _List<Song>_.

11. Compile and run `TestList.java` to confirm everything is working by looking at the results of your tests.

12. Adjust Javadocs documentation as appropriate.

#### Extending Functionality

13. Add the following method declarations to the interface and add stubs (i.e. methods that do nothing to start with) to the List.java file. Note that `toArray` is overloaded. This time the user passes an array to be filled -- nothing is returned. The `addAll()` method adds all elements in the passed array to the List.

 - `public void addAll(T[] toAdd);`
 - `public void toArray(T[] array);`


14. Add a test for each of the above methods in _TestList.java_.

Add the below lines to the bottom of `testAdds()` in TestList.java. Notice that I just switched types to Integer rather than Song! This is not sufficient for testing this new method, but we will start with this.

```java
List<Integer> numbers = new List<>(10);
Integer[] addArray = { 0, 1, 2, 3 };
numbers.addAll(addArray);
for (Integer i=0; i<addArray.length; i++) {
	if (numbers.peek(i) != i) {
		System.out.println("ERROR: addAll peek("+i+")");
	}
}
```

Add the below lines to the bottom of `testConvert()`. Again, this is not sufficient for testing this new method, but a good start.

```java
List<Integer> numbers = new List<>(10);
for (Integer i=0; i<5; i++) {
	numbers.add(i);
}
Integer[] fillArray = new Integer[numbers.length()];
numbers.toArray(fillArray);
if (null == fillArray) {
	System.out.println("ERROR: addAll(fillArray) returned null;");
} else {
	for (Integer i=0; i<fillArray.length; i++) {
		assertEquals(i,numbers.peek(i),"addAll peek("+i+")");
	}
}
```

Run TestList.java to confirm the tests are compiling (tests will fail). Complete the methods and run the tests again to confirm they are passing.

15. Add the javadocs documentation.

<hr>
<hr>

When complete, generate javadocs and inspect your work. If you are in NetBeans, there is an option to generate Javadoc documentation from the pulldown _Run_ menu. Alternatively, you can create a `docs` folder inside the Lab2 folder. Compile javadoc comments from within that folder. This will generate a collection of web pages. If at the command prompt, it looks like this:
  ```
  mkdir docs
  cd docs
  javadoc ../*.java
  ```
  You can view the results by opening the index.html file.
