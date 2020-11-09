This in-class exercise for practicing with comparators.


Everyone pick a KEY comparator to write. Choose among:
- Album
- Artist
- Title
- Year

Write the class definition for Comparator<Object> that uses a key value to compare with a Song object. The signature of the compare function must be:

```
public int compare(Object object, Object key);
```

Keep in mind that you need to:
- check the type of the object (it should be Song)
- check the type of the key (it will either be String or Integer)
- cast the Objects to the appropriate type for a comparison

Then attempt to write the lessThan and greaterThan methods in List. These should PRINT all items that are less than the "key" and greater than the "key", respectively. Look at how they are called in Main to understand what should happen there. You are only printing those values -- not returning them.

When I say it is time, each person in your group should share their screen and show their results. Everyone help to make sure it is correct.

Once you have all of your comparators complete, combine everyone's work into a single project and test the results.

IF that is all working, you can try to complete the inRange method together and write some tests for that.

EVERYONE SUBMIT WHAT THEY HAVE DONE in this google form:

https://docs.google.com/forms/d/e/1FAIpQLSd0fxyMnVNlimx5iAuAHCjAsdZAL32a41V1YLeLKf9DHdJ-TA/viewform?usp=sf_link
