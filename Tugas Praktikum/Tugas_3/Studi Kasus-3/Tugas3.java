package Lovre;
import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Jaket jkt = new Jaket();
        jkt.display();
    }
}

class Jaket {
    String tipe;
    int jumlah;

    final double a = 100_000;
    final double b = 125_000;
    final double c = 175_000;

    public void Toko (){
        Scanner sc = new Scanner(System.in);

        System.out.println("Baju yang tersedia : ");
        System.out.println("Baju A dengan harga 100000");
        System.out.println("Baju B dengan harga 125000");
        System.out.println("Baju C dengan harga 175000");

        System.out.print("Baju yang akan anda beli bertipe            : ");
        tipe = sc.nextLine();

        System.out.print("Jumlah baju yang akan anda beli adalah      : ");
        jumlah = sc.nextInt();
    }

    void A() {
        if (jumlah > 100)
            System.out.println((int)(jumlah*(a-5_000)));
        else
            System.out.println((int)(jumlah*a));
    }

    void B() {
        if (jumlah > 100)
            System.out.println((int)(jumlah*(b-5_000)));
        else
            System.out.println((int)(jumlah*b));
    }

    void C() {
        if (jumlah > 100)
            System.out.println((int)(jumlah*(c-15_000)));
        else
            System.out.println((int)(jumlah*(c)));
    }

    void harga () {
        if (tipe.equalsIgnoreCase("A"))
            if (jumlah <= 100)
                System.out.println((int)a);
            else
                System.out.println((int)(a-5_000));

        else if (tipe.equalsIgnoreCase("B"))
            if (jumlah <= 100)
                System.out.println((int) b);
            else
                System.out.println((int)(b-5_000));

        else if (tipe.equalsIgnoreCase("C"))
            if (jumlah <= 100)
                System.out.println((int) c);
            else
                System.out.println((int)(c-15_000));
    }

    void display() {
        Toko();

        System.out.println("Jenis yang anda beli    : " +   tipe);
        System.out.print  ("Harga per buah          : "); harga();
        System.out.print  ("Total harga             : ");

        if (tipe.equalsIgnoreCase("A"))
            A();
        else if (tipe.equalsIgnoreCase("B"))
            B();
        else if (tipe.equalsIgnoreCase("C"))
            C();
    }
}
