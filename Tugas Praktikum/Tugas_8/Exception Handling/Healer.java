package lovre;
import java.util.Random;

public class Healer extends Character{
    @Override
    public boolean attack() {
        boolean hitChance = false;
        int min = 1;
        int max = 20;
        Random rd = new Random();
        int value = rd.nextInt(min + max) + min;
        //System.out.println(value);

        if(value <= 17 && value >= 1) {
            //System.out.println("bener");
            hitChance = true;
        }
        else if(value >= 18 && value <= 20) {
            System.out.println(" ".repeat(14) + "--miss hit--");
            hitChance = false;
        }
        return hitChance;
    }

    Healer() {
        setHP(70);
        setAttack(10);
        setDefense(10);
    }

    public void heal(){
        setHP(getHP() + 25);
    }

}
