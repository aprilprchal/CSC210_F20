### Lab 7 : Sort a List
##### Due Tuesday, Nov 10 before lab
##### Submit a single zipped file to Moodle

<hr>

#### General Requirements:

1. Create a Comparator that compares Persons by age.
2. Create a Comparator that compares Persons by name.
3. Create a Comparator that compares Persons by id.
4. Complete the sort method that takes a comparator to sort the List.
5. Modify the test file to test your comparators.

<hr>

### Your Assignment

In main, define a comparator for each of the following "fields" of a Person (the Person class you used in the last lab).

- Order by age. If age is the same, use the birthday month to break the tie.
- Order by FIRST name. If the first names are the same, use the last name to break the tie.
- Order by id. These are unique, therefore no tie-breaker is needed.

In OrderedList.java, complete the sort method by implementing Selection Sort. There are MANY ways to sort things -- selection, bubble, insertion, merge, quick, heapsort, radix, counting sort, and bin sort (I think there even more). I chose selection sort because it does not require recursion and it is conceptually straight-forward. The idea is that you do a linear search for the location of the minimum element than swap it with the element at index 0. You repeat this process for the next minimum element (between indices 1 and the last element).

You will need a NESTED for-loop. The outside loop is tracking where to place the next element. The inside loop is searching for the minimum. When working with nested loops, it is a good idea to maintain your indentation -- it is a common error to put something inside (or outside) the wrong loop.

Finally, modify the provided TestPersons.java file to test your Comparators.

### Assessment

10% : compiles and executes
25% : for the 3 comparators
50% : selection sort is complete and accurate
10% : modified test file
05% : javadocs
