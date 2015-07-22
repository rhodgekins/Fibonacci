import java.util.Scanner;

public class Main {

    private static boolean finished = false;
    private static Scanner input;

    public static void main(String[] args)
    {
        input = new Scanner(System.in);
        printWelcome();

        while (!finished)
        {
            run();
        }
        System.exit(0);
    }

    private static void printWelcome()
    {
        System.out.println("----------------------------");
        System.out.println("Fibonacci Sequence Generator");
        System.out.println("----------------------------");
    }

    private static void run()
    {
        while (true)
        {
            System.out.println("Please enter the required length of the sequence");
            System.out.print(">> ");
            try
            {
                int temp = Integer.parseInt(input.nextLine());
                System.out.println();
                if (temp < 0 || temp > 92)
                {
                    System.out.println("Number cannot be negative or greater than 92");
                    System.out.println();
                }
                else
                {
                    fib(temp);
                    System.out.println();
                    break;
                }
            } catch (NumberFormatException e)
            {
                System.out.println("Invalid Input"); // Non-numerical entry
            }
        }
        setRestart();
    }

    private static void setRestart()
    {
        while (true)
        {
            System.out.println();
            System.out.println("Do you want to quit? y/n");
            System.out.print(">> ");
            String restart = input.nextLine();
            if (restart.equalsIgnoreCase("y"))
            {
                finished = true;
                System.out.println("Goodbye!");
                break;
            }
            else if (restart.equalsIgnoreCase("n"))
            {
                finished = false;
                System.out.println();
                break;
            }
            System.out.println("Please enter y or n");
        }
    }

    public static void fib(int n)
    {
        System.out.println("Showing sequence for " + n + " places");
        long x = 0;
        long y = 1;
        long z;
        System.out.print(y);

        for (int i = 2; i < n + 1; i++)
        {
            z = (x + y);
            x = y;
            y = z;
            System.out.print(", " + z);
        }
    }
}
