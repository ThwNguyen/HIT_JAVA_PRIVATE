import java.util.Scanner;

public class bai4{

    public static boolean scp (int a)
    {
        int sq = (int)Math.sqrt(a);
        if (sq * sq == a)
            return true;
        return false;
    }

    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int n;
        do {
            n = sc.nextInt();
        } while (n <= 0);

        int count = 0;
        int i;
        while (n > 0)
        {
            i = n % 10;
            n /= 10;
            if (scp(i))
            {
                System.out.print (i + "  ");
                count++;
            }
        }
        if (count == 0)
            System.out.print ("No");
    }
}