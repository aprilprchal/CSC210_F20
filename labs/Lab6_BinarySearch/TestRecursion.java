class TestRecursion {

  public static void main(String[] args) {

    int[] A = { 5, 4, 3, 2, 1 };

    for (int i=0; i<A.length; i++) {
      System.out.println("sumUpTo("+i+")="+sumUpTo(A,i));
    }

    System.out.println("All sum = "+sum(A,1,A.length-1));
  }

  /** Create a recursive algorithm to sum up to index n **/
  public static void sumUpTo(int[] A, int n) {

  }

  /** Create a recursive algorithm to sum from start to end index */
  public static void sum(int[] A, int start, int end) {

  }
}
