import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main
{

    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        int a = 999;
        while (a > 100)
        {
            int b = 999;
            while (b > 100)
            {
                int retVal = a*b;
                if (isPalindrome(Integer.toString(retVal)))
                {
                   list.add(retVal);
                    System.out.println(retVal + " = " + a + "x" + b);
                }
                b--;
            }
            a--;
        }
        
        System.out.println(Collections.max(list));
        System.out.println();
    }

    private static boolean isPalindrome(String s)
    {
        String reverse = "";
        for (int i = s.length()-1; i >= 0; i--)
        {
            reverse += s.charAt(i);
        }
        
        return (s.equalsIgnoreCase(reverse));
    }
}
