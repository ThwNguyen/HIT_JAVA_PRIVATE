import java.util.Scanner;

public class bai5 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        String str = sc.nextLine();
        int sum = 0;
        for (int i = str.length() - 1; i >= 0; i--)
        {
            if (str.charAt(i) == 'I')
                sum += 1;
            if (str.charAt(i) == 'V')
            {
                if (i == 0)     sum += 5;
                else {
                    if (str.charAt(i-1) == 'I')     sum += 4;
                    else    sum += 5;
                }
            }
            if (str.charAt(i) == 'X')
            {
                if (i == 0)     sum += 10; 
                else {
                    if (str.charAt(i-1) == 'I')     sum += 9;
                    else    sum += 10;
                }
            }
            if (str.charAt(i) == 'L')
            {
                if (i == 0)     sum += 50; 
                else{
                    if (str.charAt(i-1) == 'X')     sum += 40;
                    else    sum += 50;
                }
            }
            if (str.charAt(i) == 'C')
            {
                if (i == 0)     sum += 100; 
                else {
                    if (str.charAt(i-1) == 'X')     sum += 90; 
                    else    sum += 100;
                }
            }
            if (str.charAt(i) == 'D')
            {
                if (i == 0)     sum += 500;
                else {
                    if (str.charAt(i-1) == 'C')     sum += 400;
                    else    sum += 500;
                }
            }
            if (str.charAt(i) == 'M')
            {
                if (i == 0)     sum += 1000;
                else {
                    if (str.charAt(i-1) == 'C')     sum += 900;
                    else    sum += 1000;
                }
            }
        }
        System.out.println (sum);
    }
}