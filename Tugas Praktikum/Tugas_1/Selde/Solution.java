import java.io.*;
import java.util.*;

public class Solution {
    static int input;

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);

        input = in.nextInt();
        //System.out.println(input);

        selde(input);
    }

    static void selde(int input) {
        int hasil = 0;
        int a = input;

        while(input > 0) {
            int input1 = input%10;
            hasil = (hasil*10) + input1;
            input = input/10;
            //System.out.println(hasil);
        }

        if (a == hasil) {
            System.out.println(a + " adalah selde.");
        }
        else {
            System.out.println(a + " bukan selde.");
        }
    }
}
