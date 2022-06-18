package lovre;

public class Sales extends Pegawai{
    private int penjualan;
    private double komisi;

    public Sales(String nama, String noKTP, int penjualan, double komisi) {
        super(nama, noKTP);
        this.penjualan = penjualan;
        this.komisi = komisi;
    }

    public int getPenjualan() {
        return penjualan;
    }

    public void setPenjualan(int penjualan) {
        this.penjualan = penjualan;
    }

    public double getKomisi() {
        return komisi;
    }

    public void setKomisi(double komisi) {
        this.komisi = komisi;
    }

    @Override
    public String toString() {
        return  String.format("-".repeat(50) +
                              "\n" + " ".repeat(22) + "Sales" +
                              "\n" + "-".repeat(50) +
                              "\nSales               : " + getNama() +
                              "\nNo. KTP             : " +getNoKTP()) +
                String.format("\nTotal Penjualan     : " + (double)getPenjualan() +
                              "\nBesaran Komisi      : " + getKomisi() +
                              "\nPendapatan          : Rp " + (int)gaji());
    }

    @Override
    public double gaji() {
        return (getPenjualan() * getKomisi());
    }
}
