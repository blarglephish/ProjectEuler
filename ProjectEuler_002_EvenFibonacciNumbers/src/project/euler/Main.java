package project.euler;

public class Main
{
    public final static int MAX_VALUE = 4000000;
    
    public static void main(String[] args)
    {
        long retVal = 0;
        int i = 0;
        int fibVal;
        while ((fibVal = fib(i)) <= MAX_VALUE)
        {
            if (fibVal %2 == 0)
            {
                retVal += fibVal;
            }
            i++;
        }
        System.out.println(retVal);
        System.out.println();
    }

    private static int fib(int n)
    {
        int x = 0, y = 1, z = 1;
        for (int i = 0; i < n; i++)
        {
            x = y;
            y = z;
            z = x + y;
        }
        return x;
    }
}
