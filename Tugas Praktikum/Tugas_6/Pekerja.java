package lovre;

import javax.swing.*;

public class Pekerja extends Manusia{
    private double gaji;
    private double bonus;
    private int jamKerja;
    private int hariKerja;
    private String NIP;

    public Pekerja(String nama, String NIK, boolean jenisKelamin, boolean menikah, int jamKerja, int hariKerja, String NIP) {
        super(nama, NIK, jenisKelamin, menikah);
        this.gaji = gaji;
        this.bonus = bonus;
        this.jamKerja = jamKerja;
        this.hariKerja = hariKerja;
        this.NIP = NIP;
    }

    public double getGaji() {
        gaji = getHariKerja() * getJamKerja() * 15;
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public double getBonus() {
        int a = 0;
        int weekend = 0;
        int bonusLembur = 0;
        int bonusLibur = 0;

        for(int i = 1; i <= getHariKerja(); i++) {
            //System.out.println(i);
            if(getHariKerja() < 30) {
                if (i % 6 == 0) {
                    weekend++;
                }
                if (i % 7 == 0) {
                    weekend++;
                }
            }
            else if(getHariKerja() == 30 || getHariKerja() == 31) {
                if (i % 6 == 0) {
                    weekend++;
                }
                if (i % 7 == 0) {
                    weekend++;
                }
                a = weekend - 1;
            }
        }

        //System.out.println(a);
        //System.out.println(weekend);
        if(getHariKerja() < 30) {
            bonusLembur = (getHariKerja() - weekend) * (getJamKerja() - 7) * 7;
            bonusLibur = weekend * getJamKerja() * 20;
        }
        else if(getHariKerja() == 30 || getHariKerja() == 31) {
            bonusLembur = (getHariKerja() - a) * (getJamKerja() - 7) * 7;
            bonusLibur = a * getJamKerja() * 20;
        }
        bonus = bonusLembur + bonusLibur;
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public int getJamKerja() {
        return jamKerja;
    }

    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }

    public int getHariKerja() {
        return hariKerja;
    }

    public void setHariKerja(int hariKerja) {
        this.hariKerja = hariKerja;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public String getStatus() {
        String kantorCabang = "";

        if(getNIP().charAt(0) == '1')
            kantorCabang = "Mondstadt";
        else if(getNIP().charAt(0) == '2')
            kantorCabang = "Liyue";
        else if(getNIP().charAt(0) == '3')
            kantorCabang = "Inazuma";
        else if(getNIP().charAt(0) == '4')
            kantorCabang = "Sumeru";
        else if(getNIP().charAt(0) == '5')
            kantorCabang = "Fontaine";
        else if(getNIP().charAt(0) == '6')
            kantorCabang = "Natlan";
        else if(getNIP().charAt(0) == '7')
            kantorCabang = "Snezhnaya";

        //-----------------------------------------
        String departemen = "";
        if(getNIP().charAt(6) == '1')
            departemen = "Pemasaran";
        else if(getNIP().charAt(6) == '2')
            departemen = "Humas";
        else if(getNIP().charAt(6) == '3')
            departemen = "Riset";
        else if(getNIP().charAt(6) == '4')
            departemen = "Teknologi";
        else if(getNIP().charAt(6) == '5')
            departemen = "Personalia";
        else if(getNIP().charAt(6) == '6')
            departemen = "Akademik";
        else if(getNIP().charAt(6) == '7')
            departemen = "Administrasi";
        else if(getNIP().charAt(6) == '8')
            departemen = "Operasional";
        else if(getNIP().charAt(6) == '9')
            departemen = "Pembangunan";

        return departemen + ", " + kantorCabang + " cabang ke-" + getNIP().charAt(2);
    }

    public String toString() {
        double a = (getPendapatan() + getGaji() + getBonus());
        System.out.println("-".repeat(50) +
                "\nNama              : " + getNama() +
                "\nNIK               : " + getNIK() +
                "\nJenis Kelamin     : " + JenisKelamin() +
                "\nPendapatan        : " + a + "$");
        return String.format("Bonus             : " + getBonus() + "$" +
                             "\nGaji              : " + getGaji() + "$" +
                             "\nStatus            : " + getStatus());
    }
}
