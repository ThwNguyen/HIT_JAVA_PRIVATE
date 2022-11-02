import java.util.Scanner;

public class bai2{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[4];
        int count = 0;
        for (int i = 0; i < 4; i++)
            a[i] = sc.nextInt();
            
        for (int i = 0; i < 4; i++)
            for (int j = i+1; j < 4; j++)
            {
                if (a[i] < a[j])
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        for (int i = 1; i < 4; i++)
        {
            if (a[i] == a[0])
                count++;
            else
            {
                System.out.print (a[i]);
                break;
            }
        }
        if (count == 3)
            System.out.print("khong co so lon thu 2");
    }
}


// xuat mang trong java
for (int i :
     arr) {
        System.out.print (i + " ")
}