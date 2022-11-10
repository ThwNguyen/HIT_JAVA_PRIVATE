import java.util.Scanner;

public class bai1 {

    public static String del (String a, int pos) {
        String a1 = a.substring(0, pos);
        String a2 = a.substring (pos+1, a.length());
        return a1  = a1.concat(a2);

    }

    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();       

        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            if (str.charAt(i) == ' ') {
                str = del (str, i);
                i--;
            }
            else {
                for (int j = i+1; j < str.length(); j++) 
                    if (str.charAt(i) == str.charAt(j)) {
                        count++;
                        str = del (str, j);
                        j--;
                    }
                System.out.println (str.charAt(i) + " : " + count);
            }            
        }              
    }
}
