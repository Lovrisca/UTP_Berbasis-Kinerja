package lovre;
import java.util.*;

public class Main {
    static void info(Character karakter1){
        Class hero = karakter1.getClass();
        System.out.println("Role                : " + hero.getSimpleName());
        karakter1.info();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int karakter = 0;

        System.out.println("=".repeat(50));
        System.out.println("Selamat datang di game Defend FILKOM !");
        System.out.println("=".repeat(50));
        System.out.print("Silahkan masukkan nama player   : ");
        String player = sc.nextLine();
        System.out.println("Silahkan pilih karakter yang anda inginkan : ");
        System.out.println("1. Magician");
        System.out.println("2. Healer");
        System.out.println("3. Warrior");

        do {
            try {
                karakter = sc.nextInt();
                if (karakter != 1 && karakter != 2 && karakter !=3){
                    throw new NullPointerException();
                }
            } catch (InputMismatchException e) {
                System.out.println("-".repeat(50));
                System.out.println("Inputan Anda Salah!!");
                System.out.println("Masukin yang bener ya, jangan buat aku frustasi (1-3)!!!");
                System.out.println("Silahkan pilih karakter yang anda inginkan : ");
                System.out.println("1. Magician");
                System.out.println("2. Healer");
                System.out.println("3. Warrior");
                sc.nextLine();
            }
            catch (NullPointerException e) {
                System.out.println("-".repeat(50));
                System.out.println("Inputan Anda Salah!!");
                System.out.println("Masukin yang bener ya, jangan buat aku frustasi (1-3)!!!");
                System.out.println("Silahkan pilih karakter yang anda inginkan : ");
                System.out.println("1. Magician");
                System.out.println("2. Healer");
                System.out.println("3. Warrior");
                sc.nextLine();
            }
            catch (IllegalArgumentException e){
                System.out.println("-".repeat(50));
                System.out.println("Inputan Anda Salah!!");
                System.out.println("Masukin yang bener ya, jangan buat aku frustasi (1-3)!!!");
                System.out.println("Silahkan pilih karakter yang anda inginkan : ");
                System.out.println("1. Magician");
                System.out.println("2. Healer");
                System.out.println("3. Warrior");
                sc.nextLine();
            } catch (Exception e){
                System.out.println("-".repeat(50));
                System.out.println("Inputan Anda Salah!!");
                System.out.println("Masukin yang bener ya, jangan buat aku frustasi (1-3)!!!");
                System.out.println("Silahkan pilih karakter yang anda inginkan : ");
                System.out.println("1. Magician");
                System.out.println("2. Healer");
                System.out.println("3. Warrior");
                sc.nextLine();
            }
        } while (karakter != 1 && karakter != 2 && karakter !=3);

        ArrayList<Character> karakter1 = new ArrayList<>();
        switch (karakter) {
            case 1:
                karakter1.add(new Magician());
                break;
            case 2:
                karakter1.add(new Healer());
                break;
            case 3:
                karakter1.add(new Warrior());
                break;
            default:
                System.out.println("Masukkan Inputan 1-3!");
                break;
        }

        karakter1.add(new Titan());

        System.out.println("Selamat datang, " + player + " !");
        System.out.println("-".repeat(15) + " STATUS " + "-".repeat(15));
        info(karakter1.get(0));

        for (int i = 1; ; i++) {
            System.out.println("=".repeat(16) + " TURN " + i + "=".repeat(16));
            if (karakter1.get(0).attack()) {
                karakter1.get(1).receiveDamage(karakter1.get(0).getAttack());
            }

            System.out.printf("%-20s: %d", player + "'s HP", karakter1.get(0).getHP());
            System.out.println();
            System.out.printf("%-20s: %d", "Enemy's HP", karakter1.get(1).getHP());
            System.out.println();

            if (karakter1.get(1).getHP() == 0 || karakter1.get(0).getHP() == 0)
                break;

            System.out.println("=".repeat(16) + " TURN " + i + "=".repeat(16));
            if (karakter1.get(0) instanceof Healer) {
                System.out.println("Yess skill Heal aktif>.<");
                ((Healer) karakter1.get(0)).heal();
            }
            if (karakter1.get(1).attack()) {
                karakter1.get(0).receiveDamage(karakter1.get(1).getAttack());
            }

            System.out.printf("%-20s: %d", player + "'s HP", karakter1.get(0).getHP());
            System.out.println();
            System.out.printf("%-20s: %d", "Enemy's HP", karakter1.get(1).getHP());
            System.out.println();
        }

        System.out.println("-".repeat(39));
        if (karakter1.get(0).getHP() == 0)
            System.out.println("Yahh " + player + " Kalah:(");
        else
            System.out.println("Yayyy " + player + " Menang:)");

        System.out.println();
        System.out.println("=".repeat(15) + " PLAYER " + "=".repeat(15));
        System.out.println("-".repeat(15) + " STATUS " + "-".repeat(15));
        info(karakter1.get(0));
        System.out.println("=".repeat(15) + " MUSUH  " + "=".repeat(15));
        System.out.println("-".repeat(15) + " STATUS " + "-".repeat(15));
        info(karakter1.get(1));
    }
}
