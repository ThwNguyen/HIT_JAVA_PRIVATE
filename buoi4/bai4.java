import java.util.Scanner;

public class bai4 {

    public static String del (String a, int pos) {
        String a1 = a.substring (0, pos);
        String a2 = a.substring (pos+1, a.length());
        return a1 = a1.concat(a2);
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        String str = sc.nextLine();
        str = str.trim();
        str = str.toLowerCase();
        
        for (int i = 11; i < str.length(); i++)
            if (str.charAt(i) == ' ' && str.charAt(i-1) == ' ')
            {
                str = del (str, i-1);
                i--;
            }

        for (int i = 0; i < str.length(); i++)
            if ( str.charAt(i) >= 48 && str.charAt(i) <= 57)
            {
                str = del (str, i);
                i--;
            }

        char[] a = str.toCharArray();
        a[0] -= 32;
        for (int i = 1; i < str.length(); i++) 
            if (str.charAt(i-1) == ' ')
                a[i] -= 32;
        System.out.println (a);
    }
}