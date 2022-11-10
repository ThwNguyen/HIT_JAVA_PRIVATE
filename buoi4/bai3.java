import java.util.Scanner;

public class bai3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        String str = sc.nextLine();
        int count = 0; 
        int sum = 0;
        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) >= 48 && str.charAt(i) <= 57)
            {
                sum += (int) str.charAt(i) - '0';
                count++;
            }
        if (count == 0)     System.out.println ("false");
        else    System.out.printf ("true \n" + (double) Math.round((double) sum/count * 1000) / 1000);    
    }
}