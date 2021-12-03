import java.lang.reflect.Array;
import java.util.*;
import java.util.regex.Pattern;

enum Command {
    ADD("ADD"), LIST("LIST"), SRTA("SRTA"),
    SRTD("SRTD"), SUM("SUM"),QUIT("QUIT");

    String value;

    Command(String value)
    {
        this.value = value;
    }
}

public class ArrayEnum {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        Command command;
        String pattern = "[a-zA-Z]*";
        Pattern p = Pattern.compile(pattern);

        while (true) {
            try {
                command = Command.valueOf(scanner.next(p).toUpperCase());

                if (command == Command.QUIT)
                    break;

                switch (command) {
                    case ADD:
                        add(scanner.nextInt(), list);
                        break;
                    case LIST:
                        print(list);
                        break;
                    case SRTA:
                        Srta(list);
                        break;
                    case SRTD:
                        Srtd(list);
                        break;
                    case SUM:
                        sum(list);
                    default:
                        ;
                }
            } catch (InputMismatchException e) {
                continue;
            } catch (Exception e) {
                System.out.println("Invalid Command");
                continue;
            }
        }
        System.out.println("Bye");
    }
    private static void add(int n, ArrayList<Integer> array)
    {
        array.add(n);
    }

    private static void sum(ArrayList<Integer> array)
    {
        int sum = 0;

        for (int elem : array)
            sum += elem;

        System.out.println(sum);
    }

    private static void print(ArrayList<Integer> array)
    {
        for (int elem : array)
            System.out.print(elem + " ");
        System.out.println();
    }

    private static void Srta(ArrayList<Integer> array)
    {
        ArrayList<Integer> temp = new ArrayList<Integer>(array);

        Collections.sort(temp);
        print(temp);
    }

    private static void Srtd(ArrayList<Integer> array)
    {
        ArrayList<Integer> temp = new ArrayList<Integer>(array);

        Collections.sort(temp, Collections.reverseOrder());
        print(temp);
    }
}
