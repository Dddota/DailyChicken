package Client.item;

/**
 * Created by Administrator on 2017/10/12.
 */
public class Weapon {
    private String name;
    private int damage;
    private int Cd;

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }
    public Weapon(String name,int damage){
        this.name=name;
        this.damage=damage;
    }
}
