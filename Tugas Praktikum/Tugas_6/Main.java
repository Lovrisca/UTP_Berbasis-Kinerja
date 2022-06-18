package lovre;

public class Main {
    public static void main(String[] args) {
        Manusia man1 = new Manusia("Aku", "3923842934", true, true);
        Manusia man2 = new Manusia("Lovrisca", "357982012", false, false);
        Manusia man3 = new Manusia("Luna", "3541234456", false, true);
        Manusia man4 = new Manusia("Furik", "356789098", true, false);

        System.out.println("-".repeat(50));
        System.out.println(" ".repeat(21) + "Manusia");
        System.out.println(man1.toString());
        System.out.println(man2.toString());
        System.out.println(man3.toString());
        System.out.println(man4.toString());

        MahasiswaFilkom mhs1 = new MahasiswaFilkom("I Putu Yoga", "351923848239", false, false, "205150601111018", 3.70);
        MahasiswaFilkom mhs2 = new MahasiswaFilkom("Jennie Kim", "3560981923", false, false, "2150502227899", 3.90);
        MahasiswaFilkom mhs3 = new MahasiswaFilkom("Felix", "3109390292", true, false, "23455443267", 2.9);
        MahasiswaFilkom mhs4 = new MahasiswaFilkom("Hanbin", "35050192890", true, true, "21345676567675", 3.0);

        System.out.println();
        System.out.println("-".repeat(50));
        System.out.println(" ".repeat(17) + "Mahasiswa FILKOM");
        System.out.println(mhs1.toString());
        System.out.println(mhs2.toString());
        System.out.println(mhs3.toString());
        System.out.println(mhs4.toString());

        Pekerja pekerja1 = new Pekerja("Iqbal Biondy", "351717969", true, true,7, 22, "195102439283");
        Pekerja pekerja2 = new Pekerja("Bobby", "3456787653", true, true, 9, 30, "18987635672819827");
        Pekerja pekerja3 = new Pekerja("Zayn Malik", "345676256345", true, true, 8, 20, "19827647351726");
        Pekerja pekerja4 = new Pekerja("Gigi Hadid", "345263524316524", false, true, 7, 22, "19237347265410");


        System.out.println();
        System.out.println("-".repeat(50));
        System.out.println(" ".repeat(21) + "Pekerja");
        System.out.println(pekerja1.toString());
        System.out.println(pekerja2.toString());
        System.out.println(pekerja3.toString());
        System.out.println(pekerja4.toString());

        Manajer manajer1 = new Manajer("Lyra Hertin", "351707384392", false, false, 9, 20, "204837283728", 1500);
        Manajer manajer2 = new Manajer("IU", "34565443456", false, false, 10, 31, "230946382374518", 14500);
        Manajer manajer3 = new Manajer("Kylie Jenner", "324567563235", false, true, 8, 20, "2222314235221", 1390);
        Manajer manajer4 = new Manajer("Lilac", "3456543423", false, false, 9, 28, "24546543456789", 1340);

        System.out.println();
        System.out.println("-".repeat(50));
        System.out.println(" ".repeat(21) + "Manager");
        System.out.println(manajer1.toString());
        System.out.println(manajer2.toString());
        System.out.println(manajer3.toString());
        System.out.println(manajer4.toString());
    }
}
