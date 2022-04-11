package lovre;
import java.util.*;

public class DataMerchant {
    static Merchant [] merc = new Merchant[0];
    static Scanner sc = new Scanner(System.in);

    public static Merchant[] tambahMerchant(Merchant merchant){
        /*System.out.println("Masukkan Nama Merchant  : ");
        String namaMerchant = sc.nextLine();
        System.out.println("Masukkan Nama Produk    : ");
        String namaProduk = sc.nextLine();
        System.out.println("Masukkan Harga Produk   : ");
        double hargaProduk = sc.nextDouble();
        sc.nextLine();*/
        Merchant[] a = new Merchant[merc.length + 1];
        for (int i = 0; i < merc.length; i++) {
            System.arraycopy(merc, 0, a, 0, merc.length);
            a[i] = merc[i];
        }
        a[merc.length] = merchant;
        return a;
    }

    public static void tampilanData() {
        for (Merchant mch : merc) {
            System.out.println("====Tampilan Data Merchant UBFood====");
            System.out.println("Nama Merchant   : " + mch.getNamaMerchant());
            System.out.println("Nama Produk     : " + mch.getNamaProduk());
            System.out.println("Harga           : " + (int) mch.getHargaMakanan());
        }
    }

    public static Merchant cariMerchant(String nama) {
        Merchant a = new Merchant("", "", 0);
        //for(int i = 0; i<merc.length; i++) {
        for(Merchant mch : merc) {
            if(nama.equalsIgnoreCase(mch.getNamaMerchant())) {
                a = mch;
            }
        }
        return a;
    }

    public static void tampilMerchant(Merchant merchant) {
        System.out.println("====Tampilan Data Merchant UBFood====");
        System.out.println("Nama Merchant   : " + merchant.getNamaMerchant());
        System.out.println("Nama Produk     : " + merchant.getNamaProduk());
        System.out.println("Harga           : " + (int) merchant.getHargaMakanan());
    }

    public static void updateMerchant(Merchant merchant) {
        System.out.print ("Masukkan Nama Merchant  : ");
        String updateMerchant = sc.nextLine();
        merchant.setNamaMerchant(updateMerchant);

        System.out.print ("Masukkan Nama Produk    : ");
        String updateProduk = sc.nextLine();
        merchant.setNamaProduk(updateProduk);

        System.out.print ("Masukkan Harga Produk   : ");
        double updateHarga = sc.nextDouble();
        sc.nextLine();
        merchant.setHargaMakanan(updateHarga);

        System.out.println();
    }
}
