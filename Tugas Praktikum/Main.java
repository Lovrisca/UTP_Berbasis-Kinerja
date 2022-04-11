package lovre;

import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nama    : Lovrisca Pritania Widianti");
        System.out.println("NIM     : 215150700111027");
        System.out.println("Kelas   : TI-A");
        System.out.println();

        System.out.println("========Data Merchant UBFood=========");
        System.out.print ("Masukkan Nama Merchant  : ");
        String namaMerchant = sc.nextLine();
        System.out.print ("Masukkan Nama Produk    : ");
        String namaProduk = sc.nextLine();
        System.out.print ("Masukkan Harga Produk   : ");
        double hargaProduk = sc.nextDouble();
        sc.nextLine();
        System.out.println();

        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant(namaMerchant, namaProduk, hargaProduk));

        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Bakso Pak Sahid", "Bakso", 8_000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Nasgor Mblebes", "Nasi Goreng Jawa", 10_000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Ayam Geprek Kak Ros", "Ayam Kota Ekstra Nasi", 10_000));
        DataMerchant.tampilanData();
        //DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant(DataMerchant.sc.nextLine(), DataMerchant.sc.nextLine(), DataMerchant.sc.nextDouble()));
        //DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant(namaMerchant, namaProduk, hargaProduk));

        System.out.println();
        System.out.println("========Perbarui Data Merchant UBFood=========");
        System.out.print ("Masukkan Nama Merchant yang akan diganti : ");
        String gantiMerchant = sc.nextLine();

        DataMerchant.tampilMerchant(DataMerchant.cariMerchant(gantiMerchant));
        DataMerchant.updateMerchant(DataMerchant.cariMerchant(gantiMerchant));
        //DataMerchant.cariMerchant(gantiMerchant);
        DataMerchant.tampilanData();

        /*System.out.print ("Masukkan Nama Merchant  : ");
        String updateMerchant = sc.nextLine();
        System.out.print ("Masukkan Nama Produk    : ");
        String updateProduk = sc.nextLine();
        System.out.print ("Masukkan Harga Produk   : ");
        double updateHarga = sc.nextDouble();
        System.out.println();*/

        //DataMerchant.tampilMerchant(DataMerchant.cariMerchant(gantiMerchant));
        //DataMerchant.updateMerchant(new Merchant(updateMerchant, updateProduk, updateHarga));
        //DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant(updateMerchant, updateProduk, updateHarga));
        //DataMerchant.tampilMerchant(new Merchant(updateMerchant, updateProduk, updateHarga));


    }
}
