package project.euler;

public class Main
{
    private final static int TARGET = 999;
    
    public static void main(String[] args)
    {
        int retVal = 0;
//        for (int i = 0; i < TARGET; i++)
//        {
//            if (i % 3 == 0 || i % 5 == 0)
//            {
//                retVal += i;
//            }
//        }
        
        retVal = SumDivisibleBy(3) + SumDivisibleBy(5) - SumDivisibleBy(15);
        
        System.out.println(retVal);
        System.out.println();
    }
    
    private static int SumDivisibleBy(int n)
    {
        int p = TARGET / n;
        return n*(p*(p+1))/2;
    }

}
