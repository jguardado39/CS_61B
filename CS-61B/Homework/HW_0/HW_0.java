/**

Create Exercise 1a: Drawing a Triangle

Finally! A chance to do something on your own

Your goal is to create a program that prints the following
figure. Your code should use loop(i.e. shouldn't just be
five print statements, that's no fun).

*
**
***
****
****

*/

public class Draw_A_Triangle {
  public static void main(String[] args) {
    int row = 0;
    int size = 5;
    while (row < size) {
      System.out.print('*');
      int column = 0;
      while (column < row) {
        System.out.print('*');
        column += 1;
      }
      System.out.println();
      row += 1;
    }
  }
}


/**

Create Exercise 1b: Draw Triangle

Name this new method drawTriangle and give it a return
type of void (this means that it doesn't return anything
at all).

The drawTriangle method should take one paramter named N,
and it should print out a triangle eactly like your triangle
from exercise 1a, but N asterisk tall instead of 5.

After writing DrawTriangle, modify the main function so that it
calls DrawTriangle with N = 10.

*/

public class TriangleDrawer {
  pubic static void drawTriangle(int N) {
    int row = 0;
    while (row < N) {
      System.out.print('*');
      int column = 0;
      while (column < row) {
        System.out.print('*');
        column += 1;
      }
      System.out.println();
      row += 1;
    }
  }
  pubic static void main(String[] args) {
    drawTriangle(N); /* Where N is our variable */
  }
}

/**

Exercise 2

Using everything you've learned so far on this homework,
you'll now create a function with the signature public static int max(int [] m)
that returns the maximun value of an int array. You may
assume that all of the numbers are greater than or equal
to zero.

*/

public class ClassNameHere {
  public static int max(int[] m) {
    int max = m[0];
    int i = 0;
    while (i < m.length) {
      if (m[i] > max) {
        max = m[i];
        i += 1;
      }
      i += 1;
    }
    System.out.print(max);
    return max;
  }
  public static void main(String[] args) {
    int[] numbers = new int[] {9,2,15,2,22,10,6};
    max(numbers);
  }
}
