package lovre;
import java.util.Random;

public class Warrior extends Character{
    @Override
    public boolean attack() {
        boolean hitChance = false;
        int min = 1;
        int max = 20;
        Random rd = new Random();
        int value = rd.nextInt(min + max) + min;
        //System.out.println(value);

        if(value <= 12 && value >= 1) {
            //System.out.println("bener");
            hitChance = true;
        }
        else if(value >= 13 && value <= 20) {
            System.out.println(" ".repeat(14) + "--miss hit--");
            hitChance = false;
        }
        return hitChance;
    }

    Warrior() {
        setHP(80);
        setAttack(25);
        setDefense(30);
    }
}
