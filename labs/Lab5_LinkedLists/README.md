### Lab 5 : Linked Lists Project Beginnings
##### Due Tuesday, October 20 before lab
##### Submit a single zipped file to Moodle (only 1 per group)
##### Submit Google forms at the end of lab today and after submission

<hr>

#### General Requirements:

1. Start the class _ListLinked_ that implements the _List_ interface.
2. Document all code using Javadocs.
13. Verify code using tests from Lab 4.

<hr>

### Getting Started

Start by creating a new project with all of your code from Lab 4. This will be your project 1 code. Add a _ListLinked.java_ file to the project. Probably the best way to start is to copy _ListArray.java_ to _ListLinked.java_, even though a lot of the methods will change.

Add the definition for `class Node` within the _ListLinked_ class. And add `Node head` and `Node tail`. Modify the constructors as appropriate.

> Note that any reference to capacity or being full for a linked list is not meaningful. For now, we will keep it so that the tests work for both arrays and linked lists. Make sure that isFull() always returns false.

Now go from top to bottom, and modify for a linked list. For this preliminary part, I will be looking at:

- boolean isEmpty()
- boolean isFull()
- T peek(int index)
- void add(T item) // add to the end of the list.
- String toString()
- T remove(int index)

I listed these in order of difficulty (in my opinion). Notice that you are still returning elements of type T, not Node.

### Testing

Use the tests from Lab 3 / Lab 4 to confirm everything is working.

#### Deliverables

1. Complete this Google Form related to your plan to work together (due Tue, October 14): https://forms.gle/b4VQjT25mSgMVjFUA

2. Create a single version of the lab to be submitted. You can either each work independently, then confer to combine results, or work together on a single version from the beginning.

3. Before lab on October 20th, submit the one version (only one of you submits it).

4. EACH member complete this Google Form after you submit the lab. It asks you about everyone's contribution to the lab (to be posted).
