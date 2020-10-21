### Project 1 : Homegrown Lists
##### Due Tuesday, October 27 before lab
##### Submit a single zipped file to Moodle

<hr>

#### Learning Outcomes:

- Be able to implement a generic type _List_ using an array.
- Be able to implement a generic type _List_ using a linked list.
- Be able to design and use tests to verify code.

<hr>

> You must earn a grade above the threshold of 60% on this project to pass this course. If after submission, you have not reached that threshold, you will have ample opportunity to work on the project until it meets this requirement. However, the grade will remain as it was for the work originally submitted.

#### General Requirements:

1. Write the class _ListLinked_ that implements the _List_ interface.
2. Add _lastIndexOf_ and _containsAll_ to _List_ and implement in _ListLinked_.
2. Extend functionality of _ListArray_ to match _ListLinked_.
2. Document all code using Javadocs.
1. Verify code using tests from Lab 4.

<hr>

### Getting Started

This project is building from your List and ListArray implementation. You probably already started it with Lab 5 by creating ListLinked.java from a copy of LIstArray.java. The file _List.java_ ensures that your List has all required methods.

### Primary Directive

You have essentially already completed half of this project. The other half is to repeat what you did, except use linked lists instead of arrays. And there are a few new methods to implement in both array and linked list.

Word of Advice: Code a little, then test. Code a little more, then test. Use the restructured tests from Lab 4 for the linked list implementation.

<hr>

### Extend Functionality

Your linked list should have all the same methods that were included in Lab 3, as well as `void toArray(T[]) and void addAll(T[])` that were part of Lab 4 requirements. Now add two more: add these method declarations to List.java then implement in ListArray.java and ListLinked.java.

```
/** Return index of last occurring el in the list. If it is not in the list, return -1. */
public int lastIndexOf(T el);

/** Return true if every element in "array" is also in the List, else return false. */
public boolean containsAll(T[] array);
```

#### Assessment:

- 15% : complete, compiles, and executes without throwing exception
- 10% : javadocs
- 65% : ListLinked passing all tests
- 10% : ListArray passing all tests

#### Extra Credit 

- For both arrays and linked lists, implement void removeDuplicates(). This should search for and remove any duplicate entries of any element.
- For both arrays and linked lists, implement void map(UnaryOperator<T> op), in which you modify every element by _applying_ the operator. The UnaryOperator is a _lambda function_ which you can pass around just like you pass a variable.
  - See https://www.geeksforgeeks.org/unaryoperator-interface-in-java/
  - See https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/UnaryOperator.html
  - Test your method by creating the operator `UnaryOperator<Integer> plusone = a->a+1;`.
  - Note: Lambda functions are not easy to understand -- that's why it is extra credit!
