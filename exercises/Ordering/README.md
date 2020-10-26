This in-class exercise is to be completed in groups of size 2-3. We will continue to work on this throughout the week.

This project contains 1) the OrderedList class (not quite working) that holds a generic list of object of generic type that extends Comparable, 2) the Person class that extends Comparable, and 3) a main class People that creates an ordered list of persons and operates on that list.

Here are your tasks:

1. Create a codecollab project and provide editable permission to all group members and to Dr. Larson. If codecollab's server is having a bad day, we'll have to come up with a different way to share.

2. Write the equals method in Person. Use the "id" exclusively to determine if 2 persons are the same.

3. Write the compareTo method so that it compares id's to determine ordering.

4. Fix the add method so that it compiles. It is broken because of the relational operator used to compare elements. The compiler doesn't know how to determine if one person is less than another. This is where you make use of the Comparable interface.

	CHECK that your list is ordered by ID. This isn't a very good test, because the id's are given in increasing order, therefore the list of people are in the same order that they were entered into the system.

5. Modify the compareTo method so that it uses the last name to order people. NOTE: If the last name is the same, then it should use the first name as the tie-breaker.

6. But wait, maybe I want to have the option of setting the order!! Add this to Person:

	```
/** static variable to determine how to order persons */
private static String orderBy = "last";
public static void orderBy(String field) { orderBy = field; }
```

7. AND, change your compareTo method so that it checks the orderBy value and returns the results of the comparison of the specified field. The user should be able to sort by lastName, id, or age.

8. Before you create the list, set the order with something like: `Person.orderBy("id");`

9. Try the different orderings and make sure it is working correctly.
