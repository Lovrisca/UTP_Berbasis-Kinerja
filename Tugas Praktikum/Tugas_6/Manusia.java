package lovre;

public class Manusia {
    private String nama;
    private String NIK;
    private boolean jenisKelamin;
    private boolean menikah;

    public Manusia(String nama, String NIK, boolean jenisKelamin, boolean menikah) {
        this.nama = nama;
        this.NIK = NIK;
        this.jenisKelamin = jenisKelamin;
        this.menikah = menikah;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public boolean isJenisKelamin() {
        return jenisKelamin;
    }

    public String JenisKelamin() {
        String a = " ";
        if(isJenisKelamin()) {
            a = "Laki-Laki";
        }
        else if(!isJenisKelamin()) {
            a = "Perempuan";
        }
        return a;
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public boolean isMenikah() {
        return menikah;
    }

    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }

    public double getTunjangan() {
        double tunjangan1 = 0;

        if(isMenikah()) {
            if(isJenisKelamin()) {
                tunjangan1 = 25;
            } else if(!isJenisKelamin()) {
                tunjangan1 = 20;
            }
        }
        else if(!isMenikah()) {
            tunjangan1 = 15;
        }
        return tunjangan1;
    }

    public double getPendapatan() {
        return getTunjangan();
    }

    public String toString() {
        return String.format("-".repeat(50) +
                             "\nNama              : " + getNama() +
                             "\nNIK               : " + getNIK() +
                             "\nJenis Kelamin     : " + JenisKelamin() +
                             "\nPendapatan        : " + getPendapatan() + "$");
    }
}
