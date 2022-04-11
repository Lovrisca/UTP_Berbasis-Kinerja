import java.util.*;

public class Solution {
    static double s;
    static double a;
    static double t;
    static double r;

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        int menu = sc.nextInt();
        //System.out.println(menu);

        Persegi psg   = new Persegi();
        Segitiga sgt  = new Segitiga();
        Lingkaran lng = new Lingkaran();

        if (menu == 1) {
            s = sc.nextDouble();
            psg.persegi((int) s);
        }
        else if (menu == 2) {
            a = sc.nextDouble();
            t = sc.nextDouble();
            sgt.segitiga(a,t);
        }
        else if (menu == 3) {
            r = sc.nextDouble();
            lng.lingkaran(r);
        }
        else {
            System.out.println("Input yang anda masukan tidak sesuai");
        }
    }
}

class Persegi {
    void persegi(int sisi) {
        int luas = sisi*sisi;
        System.out.println(luas);
    }
}

class Segitiga {
    void segitiga(double alas, double tinggi) {
        double luas = alas*tinggi/2;
        System.out.println((int)luas);
    }
}

class Lingkaran {
    void lingkaran(double radius) {
        double phi = 3.14;

        //System.out.println(radius);

        if (radius % 7 == 0) {
            int luas = (int) ((22/7)*radius*radius);
            System.out.println((double)luas);
        }
        else {
            int luas = (int) (phi*radius*radius);
            System.out.println((double)luas);
        }
    }
}
