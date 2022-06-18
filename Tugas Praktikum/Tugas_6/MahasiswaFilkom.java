package lovre;

public class MahasiswaFilkom extends Manusia{
    private String NIM;
    private double IPK;

    public MahasiswaFilkom(String nama, String NIK, boolean jenisKelamin, boolean menikah, String NIM, double IPK) {
        super(nama, NIK, jenisKelamin, menikah);
        this.NIM = NIM;
        this.IPK = IPK;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public double getIPK() {
        return IPK;
    }

    public void setIPK(double IPK) {
        this.IPK = IPK;
    }

    public String getStatus() {
        String prodi = " ";
        if(getNIM().charAt(6) == '2')
            prodi = "Teknik Meniup Gelembung";
        else if(getNIM().charAt(6) == '3')
            prodi = "Teknik Berburu Ubur Ubur";
        else if(getNIM().charAt(6) == '4')
            prodi = "Sistem Perhamburgeran";
        else if(getNIM().charAt(6) == '6')
            prodi = "Pendidikan Chum Bucket";
        else if(getNIM().charAt(6) == '7')
            prodi = "Teknologi Telepon Kerang";

        //------------------------------------
            return prodi + ", 20" + getNIM().charAt(0) + getNIM().charAt(1);
    }

    public double getBeasiswa(){
        double beasiswa1 = 0;

        if(getIPK() < 3.0) {
            beasiswa1 = 0;
        }
        else if(getIPK() >= 3.0 && getIPK() <= 3.5) {
            beasiswa1 = 50;
        }
        else if(getIPK() >= 3.6 && getIPK() <=4) {
            beasiswa1 = 75;
        }
        return beasiswa1 + getPendapatan();
    }

    public String toString() {
        System.out.println("-".repeat(50) +
                           "\nNama              : " + getNama() +
                           "\nNIK               : " + getNIK() +
                           "\nJenis Kelamin     : " + JenisKelamin() +
                           "\nPendapatan        : " + getBeasiswa() + "$");

        return String.format("IPK               : " + getIPK() +
                             "\nNIM               : " + getNIM() +
                             "\nStatus            : " +getStatus());
    }
}
