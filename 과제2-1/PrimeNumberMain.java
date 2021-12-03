import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class PrimeNumberMain
{
    static ArrayList<Integer> primeNumbers;

    static void makePrimeNumbers(int n)
    {
        primeNumbers = new ArrayList<Integer>();

        primeNumbers.add(2);

        for (int i = 3; i <= n; ++i)
        {
            int j;
            for (j = 2; j < i; ++j)
            {
                if (i % j == 0)
                    break;
            }
            if (i == j)
                primeNumbers.add(i);
        }
    }

    private static Object[] getPrimeNumber(final int n)
    {
        int lastIndex = 0;
        while (lastIndex < primeNumbers.size() &&
               primeNumbers.get(lastIndex) <= n) ++lastIndex;

        return primeNumbers.subList(0, lastIndex).toArray();
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();
        makePrimeNumbers(num);

        for (int i = 2; i <= num; ++i)
        {
            System.out.print("Prime Numbers less than or equal to ");
            System.out.println(i + " = " + Arrays.toString(getPrimeNumber(i)));
        }
    }
}