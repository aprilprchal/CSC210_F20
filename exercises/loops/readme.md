## CSC210 Breakout Room Exercise : Loops and Arrays
### Tuesday, Sept 8

This lab is a group exercise to give you practice in solving a computational problem that requires either a for-loop or a while-loop. You will be developing code using a technique called *Pair Programming*. There is an excellent article on the subject here: <a href="https://www.sitepoint.com/pair-programming-guide/" target="_blank">https://www.sitepoint.com/pair-programming-guide/</a> 

<hr>

The relevant resources include:
- Prework Google form completed before lab (posted in announcement and here): <a href="https://forms.gle/cVukRNvGPjhKgW9j9" taget="_blank">https://forms.gle/cVukRNvGPjhKgW9j9</a>
- Google Slide document with additional information and a slide that each group needs to complete. Links below.
- A user account with codecollab.io. Go here: <a href="https://codecollab.io" target="_blank">https://codecollab.io/</a>

Groups for Lab A at 1:50pm
- Google Document for this lab section <a href="https://docs.google.com/presentation/d/1UcBr1Ic2sObCh_m0J-dLroZjgNqHmubCySq0RuUjWP0/edit?usp=sharing" target="_blank">HERE</a>
1. Ted S., Andy T.
2. April P., Halah W., Chris T.
3. Kaltun H., Annabelle A.,  Luna X. 
4. Kourtnie B., Alyssa T., Khalid S.
5. Temesgen B., Muhyadin A., Tou KL.
6. Farah D., Khadar M., Wilson V.
7. Gavin U., Chris H.

Groups for Lab B at 3:40pm
- Google Document for this lab section <a href="https://docs.google.com/presentation/d/1pMvuG26FYaXcfJOKUVAGhogDyNKDNpZq6xF1yt5IR2Q/edit?usp=sharing" target="_blank">HERE</a>
1. Noah D., Seymour P.
2. Jonathan V, Collin C., Gregory S.
3. Eric O., Eduardo DV., Josh K.
4. Elliot B., Abdirizak D., Mohamed
5. Amal Y., Zaj L., Kevin G.

<hr>

### Assessment

You are being assessed on your participation and engagement in pair programming. If everything gets completed perfectly because you took over and you did all the work alone, you are failing the assignment. If you are working as a team on the code for the whole lab, you are doing an excellent job on the assignment, no matter how many functions you complete.

<hr>

### Testing

It is important that you test the code that you have written. You want to think about usual and unusual input. When you test input, it is helpful to print the test along with the results, as well as the expected value. 

Consider a function that tests if all the numbers in an array are above a threshold. The test cases might look like this:

```Java
// Check results of empty array
int[] empty = {};
System.out.println("Empty array, expect false. Results "+threshold(0,empty));

// Check results of array with positive nums. some true, some false results due to elements at various locations
int[] arrayPos = { 12, 20, 10, 15, 8};
System.out.println("Positive nums. All >. Expect true. Results "+threshold(1,arrayPos));
System.out.println("Positive nums. First is ==. Expect false. Results "+threshold(12,arrayPos));
System.out.println("Positive nums. Last <. Expect false. Results "+threshold(8,arrayPos));
System.out.println("Positive nums. Middle <. Expect false. Results "+threshold(11,arrayPos);
System.out.println("Positive nums, negative threshold. Expect true. Results "+threshold(-5,arrayPos));

// Check results of array with negative nums.
int[] arrayNeg = { -1, -2, -3};
System.out.println("Negative nums. All >. Expect true. Results "+threshold(-10,arrayNeg));
System.out.println("Negative nums. First is <. Expect false. Results "+threshold(0,arrayNeg));
```

### Directions

> When everyone has made sufficient progress on the first three, we will come back together as a group and review. I will randomly pick students and ask them questions about the process and the specific code. 

> WHEN YOU ARE DONE WITH THE FIRST THREE, send a chat to let me know (e.g. "Group #2 done with first 3 functions").


__Google Slide Document__
- Find the slide that corresponds to your lab section and group/breakout room number.
    - Put your names on the slide (if not already there)
    - As a group, complete the test cases for the functions on the right. The left has been filled in for you.

__codecollab Project__
- Locate your project (organized by lab section and group number) on codecollab.
    - For each of the first three functions, fill in the name for each of the roles. Please vary your role.
    - Discussion leader and keyboardist work on coding the function. BE SURE TO ADD COMMENTS to the code.
    - Tester, you write the test cases. (If you have only 2 in your group, first write the tests, then write the functions).
    - Once complete, run the tests and fix any bugs.

__If you have questions__
- Send me a chat or "raise your hand."
- I will observe every project by viewing it through the web interface in codecollab.
- I might drop in to your breakout room from time to time.













