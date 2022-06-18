package lovre;

public class Manajer extends Pekerja{
    private int lamaKerja;

    public Manajer(String nama, String NIK, boolean jenisKelamin, boolean menikah, int jamKerja, int hariKerja, String NIP, int lamaKerja) {
        super(nama, NIK, jenisKelamin, menikah, jamKerja, hariKerja, NIP);
        this.lamaKerja = lamaKerja;
    }

    public int getLamaKerja() {
        return lamaKerja;
    }

    public void setLamaKerja(int lamaKerja) {
        this.lamaKerja = lamaKerja;
    }

    public double Tunjangan() {
        double a = getTunjangan() + getGaji() + Bonus() + 15;
        return a;
    }

    public double Bonus() {
        double a = (getBonus() * 0.3) + getBonus();
        return a;
    }

    public String toString() {
        System.out.println("-".repeat(50) +
                "\nNama              : " + getNama() +
                "\nNIK               : " + getNIK() +
                "\nJenis Kelamin     : " + JenisKelamin() +
                "\nPendapatan        : " + Tunjangan() + "$");

        return String.format("Bonus             : " + Bonus() + "$" +
                             "\nGaji              : " + getGaji() + "$" +
                             "\nStatus            : " + getStatus() +
                             "\nLama Kerja        : " + getLamaKerja() + " hari");
    }
}
