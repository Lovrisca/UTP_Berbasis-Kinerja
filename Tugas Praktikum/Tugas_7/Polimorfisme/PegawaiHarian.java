package lovre;

public class PegawaiHarian extends Pegawai{
    private double upahPerJam;
    private int totalJam;

    public PegawaiHarian(String nama, String noKTP, double upahPerJam, int totalJam) {
        super(nama, noKTP);
        this.upahPerJam = upahPerJam;
        this.totalJam = totalJam;
    }

    public double getUpahPerJam() {
        return upahPerJam;
    }

    public void setUpahPerJam(double upahPerJam) {
        this.upahPerJam = upahPerJam;
    }

    public int getTotalJam() {
        return totalJam;
    }

    public void setTotalJam(int totalJam) {
        this.totalJam = totalJam;
    }

    @Override
    public String toString() {
        return String.format("-".repeat(50) +
                             "\n" + " ".repeat(17) + "Pegawai Harian" +
                             "\n" + "-".repeat(50) +
                             "\nPegawai Harian      : " + getNama() +
                             "\nNo. KTP             : " +getNoKTP()) +
                String.format("\nUpah/jam            : Rp " + getUpahPerJam() +
                              "\nTotal jam kerja     : " + (double)getTotalJam() +
                              "\nPendapatan          : Rp " + (int)gaji());
    }

    @Override
    public double gaji() {
        double salary = 0;
        if(getTotalJam() <= 40) {
            salary = getUpahPerJam() * getTotalJam();
        }
        else if(getTotalJam() > 40) {
            salary = (((40 * getUpahPerJam()) + ((getTotalJam() - 40)) * getUpahPerJam())) * 1.5;
        }
        return salary;
    }
}
