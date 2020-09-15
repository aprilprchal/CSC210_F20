## Lab 0 Modularity, Reuse, and Testing
### Due Tuesday, September 15 BEFORE class
### Zip it all up and submit to Moodle

<mark>The important part about this assignment is writing the "helper" functions corresponding to the 4 JAVA Array Labs exercises in Java. You will write this in your editor (e.g. NetBeans, IntelliJ, Visual Studio Code, Atom). In addition to writing those helper functions, you will write a couple of tests for each function. I want you to show me that you understand how to write code that can be automatically tested. The final piece is writing getUserInput() to improve the proposed methods of zyBooks.</mark>

In zyBooks Chapter 18, there was a series of programming exercises assigned. In each one, the function began by filling an array with user input, then doing something to the array. Here is an example of one of those exercises.

```Java
public class LabProgram {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int[] userValues = new int[9];  // Set of data specified by the user      
		// user enters number up to 9. uses negative to indicate done.
		for (int i=0; i<9; i++) {
			System.out.print("enter number: ");
			int number = scnr.nextInt();
			if (number < 0) {
				break;
			}
			userValues[i] = number;
		}
		/* Write code to find the middle value of the array */
	}
}
```

There are several ways in which this approach can be improved. These are the issues we are going to address:

1. If input is accepted one number at a time, it is unknown how many numbers the user would like to enter, therefore it is difficult to size the array appropriately. An alternative in the exercise is to get a list of numbers, and the first one indicates how many more numbers the user will enter. This is awkward and it still has the problem of sizing the array appropriately.

2. Filling an array with user data is part of every exercise, and every time it is rewritten for the next exercise. (_Keep in mind that if you are repeating code, it might be time for a helper function!_)

3. It is necessary for a human to interact with the function to enter in data to test it.

4. It is necessary for a human to visually inspect the output and compare it to the expected resutls to confirm it is correct.

Let's make this code better!

<hr>

You can address the first two issues above by allowing the user to enter in a series of numbers on a single line, without knowing ahead of time how many numbers there will be.

You can write a function that takes in user input (of unknown size), places the data into an array, and returns the array. It should have the following signature:

```Java
int[] getUserInput() { ... }
```

When you read input from the user, use `nextLine()` instead of `nextInt()`. The key here will be to ask the user to separate values with a space and use the `split()` method for the _String_ class. It will look like this:

```Java
String line = scanner.nextLine();
String[] tokens = line.split(" ");
int length = tokens.length;
int[] numbers = new int[length];
// iterate over tokens, convert each to an integer and place in numbers[]
// ...
return numbers;
```

You can convert a string to an integer like this: `Integer.valueOf("5")`.

Now the user can enter as many numbers as they want, and they don't have to tell you how many because you will declare the array (and its size) AFTER the quantity is known.

<hr>

The next step is to write a helper function that meets the requirements of the assignment. For example, to find the middle value, you would write a function with the signature `int getMiddle(int[] array)`. It might seem excessive to make a function out of such a simple task, but you will see how easy this is to test!

With the two helper functions, the zyBook exercise is going to look like the below code. Look at how easy that is to read!!!

```Java
public class LabProgram {
	public static void main(String[] args) {
		int[] userInput = getUserInput();
		System.out.println("Middle value is "+getMiddle(userInput));
   }
}
```

Finally, we want to make it easier for a human to determine if the output is correct. We can do this by checking the expected output against the actual output. It looks like this:

```Java
public class LabProgram {
	public static void main(String[] args) {
		// TESTING getMiddle()...
		int[] testOne = {1};
		if (1 != getMiddle(testOne)) {
			System.out.println("Not working with {1}");
		}
		int[] testTwo = {1,2};
		if (1 != getMiddle(testTwo)) {
			System.out.println("Not working with {1,2}");
		}
		/** and so on **/
	}
}
```

Notice that something is printed out only when the program is not working. This makes it very easy to see if something is wrong.

**"What is the big deal?" you ask.** Well, it isn't such a huge improvement here, but the bigger the function, the more important it is to make testing really easy! (And along the way we improved readability, plus we have a nice, reusable way to get user input that is MODULAR.)

<hr>

### YOUR ASSIGNMENT

Follow the steps above to redo the zyBook assignments of Ch. 18 **IN A NEW JAVA PROJECT IN YOUR EDITOR (e.g. NetBeans, Intelli-J, Visual Studio Code)**. Create a helper function to take in user input to put into an array. Then write methods for each exercise using the method signatures as indicated:

1. 18.14 Find the middle item.
	```Java
	/** return the value of the element in the middle of the array.
	If the size of the array is even thus has 2 elements in the middle, return the one in the smaller index.
	*/
	int getMiddle(int[] array)
	```
2. 18.16 Normalize the list.
	```Java
	/** Normalize an array by subtracting the smallest value from each element. */
	void normalize(int[] array)

3. 18.19 Elements in range.
	```Java
	/** Return new array with values only in range between min and max inclusive. */
	int[] inRange(int min, int max, int[] array)
	```
4. 18.20 Find 2 smallest numbers.
	```Java
	/** Find 2 smallest numbers in array, return in a 2-element array.
	The first element should be the smaller of the two. */
	int[] twoSmallest(int[] array) {
	```

Finally, add a couple of test cases for each function to test your results. You can make one big main() function or you can break it apart further to isolate the testing for each of the functions.

Putting it all together, your main function might have this general structure:

```Java
public static void main(String[] args) {
	// try with user input
	int[] userValues = getUserInput();
	System.out.println("Middle is "+getMiddle(userValues));
	// test cases for getMiddle.
	int[] testOne = {1};
	if (1 != getMiddle(testOne)) {
		System.out.println("Not working with {1}");
	}
	int[] testTwo = {1,2};
	if (1 != getMiddle(testTwo)) {
		System.out.println("Not working with {1,2}");
	}
	/** repeat for the other 3 assignments. **/
}
```

If you want something that makes use of a lot of helper functions, you can use the LabProgram.java framework included in this lab's directory.

> The zyBooks assignment is still required so that you can have a sense of why this approach is an improvement. You can complete the assignments in zyBooks, then copy it to your machine to finish this lab, or complete this lab then copy code to zyBooks.
