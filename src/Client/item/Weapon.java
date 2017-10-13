package Client.item;

/**
 * Created by Administrator on 2017/10/12.
 */
public class Weapon {
    private String name;//ÎäÆ÷Ãû³Æ
    private int damage;//ÎäÆ÷ÉËº¦
    private int Cd;//ÎäÆ÷¹¥»÷¼ä¸ô.

    public String getName() {
        return name;
    }
    public int getDamage() {
        return damage;
    }

    public Weapon(){}

    public Weapon(String name,int damage){
        this.name=name;
        this.damage=damage;
    }
}
