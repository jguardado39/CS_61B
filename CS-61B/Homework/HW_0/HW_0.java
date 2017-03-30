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
