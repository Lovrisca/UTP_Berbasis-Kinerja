package lovre;
import java.util.Random;

public class Titan extends Character{
    @Override
    public boolean attack() {
        boolean hitChance = false;
        int min = 1;
        int max = 20;
        Random rd = new Random();
        int value = rd.nextInt(min + max) + min;
        //System.out.println(value);

        if(value <= 8 && value >= 1) {
            //System.out.println("bener");
            hitChance = true;
        }
        else if(value >= 9 && value <= 20) {
            System.out.println(" ".repeat(14) + "--miss hit--");
            hitChance = false;
        }
        return hitChance;
    }

    Titan() {
        setHP(200);
        setAttack(45);
        setDefense(0);
    }
}
