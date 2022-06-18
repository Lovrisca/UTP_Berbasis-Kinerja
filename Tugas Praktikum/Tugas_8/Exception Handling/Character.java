package lovre;
import java.lang.*;
public abstract class Character {
    private int defense;
    private int attack;
    private int HP;

    public abstract boolean attack();

    public void receiveDamage(int damage) {
        if(getAttack() > getDefense()) {
            damage = (getAttack() - getDefense());
        }
        else if(getAttack() < getDefense()) {
            damage = 0;
        }
        setHP(HP - damage);

        if(HP <= 0) {
            setHP(0);
        }
    }

    public void info() {
        System.out.println("HP                  : " + getHP());
        System.out.println("Attack              : " + getAttack());
        System.out.println("Defense             : " + getDefense());
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }
}
