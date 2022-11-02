import java.util.Scanner;

public class bai4 {
    public static boolean prime (int k)
    {
        if (k < 2)
            return false;
        else {
            for (int i = 2; i <= (int)Math.sqrt(k); i++)
                if (k % i == 0)
                {
                    return false;
                }
        }
        return true;
    }

    public static boolean superPrime (int k)
    {
        int count = 0; // dem so nguyen to 
        int count2 = 0; // dem so chu so
        while (k > 0)
        {
            if (prime(k % 10))
                count++;
            k /= 10;
            count2 ++;
        }
        if (count == count2)
            return true;
        return false;
    }

    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++)
            if (superPrime(a[i]) && prime(a[i]))    
            { 
                System.out.println (a[i] + " ");
                count++;
            }
        if (count == 0) System.out.println ("No"); 
    }
}