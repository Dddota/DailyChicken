package Client.item;

/**
 * Created by Administrator on 2017/10/12.
 */
public class Weapon {
    private String name;//武器名称
    private int damage;//武器伤害
    private int Cd;//武器攻击间隔.

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
