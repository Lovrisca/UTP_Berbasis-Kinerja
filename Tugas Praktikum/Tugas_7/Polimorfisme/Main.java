package lovre;

public class Main {
    public static void main(String[] args) {
        //Pegawai pegawai = new Pegawai("nama", "noKTP");

        //pegawai = new PegawaiTetap("Lovrisca", "3500987638120987", 4_100_00);
        //pegawai1 = new PegawaiHarian("Chihun", "3216789090019283", 50_000, 8);
        //pegawai2 = new Sales("Boki", "3456448900928712", 150, 30_000);

        tampilData(new PegawaiTetap("Bayu", "350728490327424892342", 2_000_00));
        tampilData(new PegawaiTetap("Lovrisca", "3500987638120987", 4_100_00));
        tampilData(new PegawaiTetap("Min Yoongi", "3452341234112343", 4_150_00));
        tampilData(new PegawaiTetap("Na Jaemin", "35211223876576876", 3_000_00));

        tampilData(new PegawaiHarian("Edo", "350728490327424892343", 8_500, 40));
        tampilData(new PegawaiHarian("Chihun", "3216789090019283", 50_000, 8));
        tampilData(new PegawaiHarian("Chaeryoung", "3454344123009809", 30_000, 41));
        tampilData(new PegawaiHarian("Daniel Kang", "3452134321009183", 30_000, 40));

        tampilData(new Sales("Tika", "350728490327424892344", 50, 50_000));
        tampilData(new Sales("Boki", "3456448900928712", 150, 30_000));
        tampilData(new Sales("Lacibolala", "3565450098712788", 100, 75_000));
        tampilData(new Sales("Ladida", "3245989838940098", 90, 40_000));

    }

    static void tampilData(Pegawai pegawai) {
        System.out.println(pegawai.toString());
    }
}
