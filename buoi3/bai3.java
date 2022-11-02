import java.util.Scanner;

public class bai3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        int []b = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        for (int i = 0; i < n-1; i++ )
        {
            int count = 0;
            for (int j = i; j < n-1; j++)
            {
                if (a[j] >= a[j+1])
                    break;
                else    count++;              
            }
            b[i] = count+1; 
        }

        int max = b[0];
        for (int i = 1; i < n; i++)
            if (b[i] > max)
                max = b[i];
        System.out.print (max);
        
    }
}