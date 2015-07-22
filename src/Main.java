
public class Main {

    public static void main(String[] args)
    {
        if (args.length >= 1)
        {
            try
            {
                fib(Integer.parseInt(args[0]));
            } catch (Exception e)
            {
                System.out.println("Error, unknown argument - " + args[0]);
            }
        }
        else
            System.out.println("Error, no argument used");
    }

    public static void fib(int n)
    {
        System.out.println("Showing sequence for " + n + " places");
        int x = 0;
        int y = 1;
        int z;
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
