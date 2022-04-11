import java.util.*;

public class Solution {
    static String teks;
    static int nilai;

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);

        teks  = in.nextLine();
        nilai = in.nextInt();

        //System.out.println(teks + nilai);

        geser();
    }

    static void geser() {
        for(int i = 0; i < teks.length(); i++) {
            if(Character.isLowerCase(teks.charAt(i))) {
                char a = (char) (((int) teks.charAt(i) - 97 + nilai) % 26 + 97);
                System.out.print(a);
            }
            else if(Character.isUpperCase(teks.charAt(i))) {
                char a = (char) (((int) teks.charAt(i) - 65 + nilai) % 26 + 65);
                System.out.print(a);
            }
            else if(teks.charAt(i) == ' ') {
                System.out.print(' ');
            }
        }
    }
}
