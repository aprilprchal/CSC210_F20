
class LabProgram {
    public static void main(String[] args) {
        test_getUserInput();
        test_getMiddle();
        test_normalize();
        test_inRange();
        test_twoSmallest();
    }
    // --------------------------------------------------------------------
    // ------------------   The 4 functions to be tested ------------------/
    // --------------------------------------------------------------------
    public static void getMiddle(int[] A){
        // code for getMiddle
    }

    public static void normalize(int[] A) {
        // code for normalize
    }

    public static int[] inRange() {
        // code for inRange
    }

    public static int[] twoSmallest(int[] A) {
        // code for twoSmallest
    }
    
    /** Visual inspection to test the results of getUserInput() */
    public static void test_getUserInput() {
        int[] input = null;
        input = getUserInput();
        for (int el : input) {
            System.out.print(el+" ");
        }
        System.out.println();
    }
    // --------------------------------------------------------------------
    // ------------  AUTOMATED TESTS for the 4 functions ------------------
    // --------------------------------------------------------------------
    
    /** Automated test of getMiddle(int[] A) : returns middle element */public static void test_getMiddle() {
        // test cases for getMiddle.
        int[] testOne = {1};
        if (1 != getMiddle(testOne)) {
            System.out.println("Middle not working with {1}");
        }
        int[] testTwo = {1,2};
        if (1 != getMiddle(testTwo)) {
            System.out.println("Middle not working with {1,2}");
        }
    }

    /** Automated test of normalize(int[] A) :subtracts min value from all elements.
    */
    public static void test_normalize() {
        // test cases for Normalize
        int[] testOne = {1};
        normalize(testOne);
        if (0 != testOne[0] {
            System.out.println("Normalize not working with {1}");
        }
        int[] testTwo = {2,1};
        normalize(testTwo);
        // expect testTwo is now {1,0}
        if ((1 != testTwo[0]) || (0 != testTwo[1])) {
            System.out.println("Normalize not working with {2,`}");
        }
    }

    /** Automated test of inRange(int min, int max, int[] array) :
    returns new array containing elements of array in range of min and max
    */
    public static void test_inRange() {
        // tests for inRange
    }

    /** Automated test of itwoSmallest(int[] array) :
    returns new array containing the 2 smallest elements of array
    */
    public static void test_twoSmallest() {
        // tests for twoSmallest
    } // end test_twoSmallest

} // end class Main

    