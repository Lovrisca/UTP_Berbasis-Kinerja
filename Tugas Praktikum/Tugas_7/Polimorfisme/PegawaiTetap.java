package lovre;

public class PegawaiTetap extends Pegawai{
    private double upah;

    public PegawaiTetap(String nama, String noKTP, double upah) {
        super(nama, noKTP);
        this.upah = upah;
    }

    public double getUpah() {
        return upah;
    }

    public void setUpah(double upah) {
        this.upah = upah;
    }

    @Override
    public String toString() {
        return String.format("-".repeat(50) +
                             "\n" + " ".repeat(18) + "Pegawai Tetap" +
                             "\n" + "-".repeat(50) +
                             "\nPegawai Tetap       : " + getNama() +
                             "\nNo. KTP             : " +getNoKTP()) +
                String.format("\nUpah                : " + getUpah() +
                              "\nPendapatan          : Rp " + (int)gaji());
    }

    @Override
    public double gaji() {
        return upah;
    }
}
