
public class Main {

    public static void main(String[] args)
    {
        fib(20);
    }

    public static void fib(int n)
    {
        int x = 0;
        int y = 1;
        int z;
        System.out.print(y);

        for (int i = 2; i < n+1; i++)
        {
            z = (x + y);
            x = y;
            y = z;
            System.out.print(", " + z);
        }
    }
}
