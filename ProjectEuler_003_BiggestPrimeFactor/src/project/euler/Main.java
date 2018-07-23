package project.euler;

public class Main
{
    public final static long TARGET = 600851475143L;
    public static void main(String[] args)
    {
        long n = TARGET;
        long lpf = 0L;
        int k = 2;
        while (n > 1)
        {
            while (n % k == 0)
            {
                lpf = k;
                n = n / k;
            }
            int offset = (k > 2) ? 2 : 3;
            k+= offset;
        }
        System.out.println(lpf);
        System.out.println();
    }
}
