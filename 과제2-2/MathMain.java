import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;
import java.util.Arrays;

public class MathMain {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter N: ");
    final int n = scanner.nextInt();

    int[] inputs = new int[n];

    for (int i = 0; i < n; ++i)
      inputs[i] = scanner.nextInt();

    int max = getMax(inputs);
    System.out.printf("Max element : %d in %s\n", max, Arrays.toString(inputs));

    int min = getMin(inputs);
    System.out.printf("Min element : %d in %s\n", min, Arrays.toString(inputs));
  }

  private static int getMax(int[] inputs)
  {
    int max = Integer.MIN_VALUE;
    for (int elem : inputs)
      if (max < elem)
        max = elem;

    return max;
  }

  private static int getMin(int[] inputs)
  {
    int min = Integer.MAX_VALUE;
    for (int elem : inputs)
      if (min > elem)
        min = elem;

    return min;
  }
}
