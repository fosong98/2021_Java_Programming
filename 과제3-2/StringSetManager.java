import java.lang.reflect.Array;
import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

enum StringCommand
{
  ADD("ADD"), REMOVE("REMOVE"), CLEAN("CLEAN"), QUIT("QUIT"), SORT("SORT");

  String value;

  StringCommand(String value) { this.value = value; }
}

public class StringSetManager {
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> stringSet = new ArrayList<>();

    while (true)
    {
      try
      {
        StringCommand command = StringCommand.valueOf(scanner.next().toUpperCase());

        if (command == StringCommand.QUIT)
          break;

        switch (command)
        {
          case ADD : add(scanner.next(), stringSet);
          break;
          case REMOVE: remove(scanner.next(), stringSet);
          break;
          case CLEAN : clean(stringSet);
          break;
          case SORT : sort(scanner.next(), stringSet);
          break;
          default:;
        }
      }
      catch (Exception e) {}

      System.out.println("Element Size: " + stringSet.size() + " , Values = " + stringSet.toString());
    }
    System.out.println("BYE!");
    scanner.close();
  }

  private static void add(String data, ArrayList<String> array)
  {
    if (Collections.binarySearch(array, data) < 0)
      array.add(data);
  }

  private static void remove(String data, ArrayList<String> array)
  {
    array.remove(data);
  }

  private static void sort(String mode, ArrayList<String> array)
  {
    if ("ASC".equalsIgnoreCase(mode))
      Collections.sort(array);
    else if ("DESC".equalsIgnoreCase(mode))
      Collections.sort(array, Collections.reverseOrder());
  }

  private static void clean(ArrayList<String> array)
  {
    array.clear();
  }
}
