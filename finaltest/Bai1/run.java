
import java.util.Scanner;

public class run {
    public static int count(String s) {
        int count1 = 0, count2 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(')
                count1++;
            else {
                if (count1 > 0)
                    count1--;
                else
                    count2++;
            }
        }
        return count1 + count2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(count(s));
    }
}
