package functionalinterface.example.demo;

public class IsPOwerOfTwo {
  public static void main(String[] args) {
    System.out.println(helper(64));

    // functional interface approach
    System.out.println(logResult(64));
    System.out.println(logResult(62));
  }

  // general algorithm
  private static boolean helper(int n) {
    if (n == 0) {
      return false;
    }

    while (n != 1) {
      if (n % 2 != 0) {
        return false;
      }

      n >>= 1;
    }

    return true;
  }

  // functional interface way
  private static boolean logResult(int number) {
    PowerOfTwo powerOfTwo =
        n -> {
          return n != 0 && (n & (n - 1)) == 0;
        };
    return powerOfTwo.isPowerOfTwo(number);
  }
}
