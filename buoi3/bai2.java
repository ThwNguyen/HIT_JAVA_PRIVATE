import java.util.Scanner;

public class bai2 {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        int k = a[n-1];
        int []b = new int[k];
        for (int i = 0; i < k; i++)
            b[i] = i+1;

        for (int i = 0; i < n; i++)
            for (int j = i + count; j < k; j++)
                if (a[i] != b[j])
                {
                    System.out.print (b[j] + " ");
                    count++;
                }
                else break;
    }
}
// 6
// 1 4 5 7 8 10            
// 1 2 3 4 5 6 7 8 9 10    
// 2 3 6 9 