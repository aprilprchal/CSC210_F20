This is an in-class exercise. As I am showing one of your groupmates how to construct a Comparator, you all can get the exercise set up in your netbeans.

Have the 1 person who is in charge of typing code be the one to share their screen. Collectively, write the code by communicating with each other. Once you have the code established on the shared screen, you can each copy that into your own version.

What needs to be done:

- Add a min(Comparator<T> orderBy) method to your OrderedList. You can start by writing a "find minimum" method as if you were dealing with numbers. Eventually it needs to use the comparator to determine the minimum. Keep in mind that the list should be sorted, but it might not be sorted using the fields being used in the Comparator. Therefore, you will need to iterate to find the min.

- Repeat the above, except create a max(Comparator<T> orderBy);

- Start to modify the TestPersons.java file so that it will test your min and max. When you call the method, it will look something like this:

`Person min = people.min(orderByName);`

When the group mate that I was working with returns to your group, they will show everyone how to construct a Comparator.

EVERYONE please submit your work on the link on Moodle.

p.s. In case you hadn't noticed, this will be directly applicable to Lab 7!
