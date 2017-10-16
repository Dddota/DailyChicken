package Client.item;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Administrator on 2017/10/12.
 */
public class Weapon {
    private String name;//武器名称
    private int damage;//武器伤害
    private int cd;//武器攻击间隔.
    static ArrayList<Weapon> weapons = new ArrayList<Weapon>();
    public String getName() {
        return name;
    }
    public int getDamage() {
        return damage;
    }

    public int getCd() {
        return cd;
    }

    public void setCd(int cd) {
        this.cd = cd;
    }

    public Weapon(String name, int damage, int cd) {
        this.name = name;
        this.damage = damage;
        this.cd=cd;
    }
    //将武器加入集合中
    public  static ArrayList weapons(){
        Weapon akm = new Weapon("AKM", 48,100);
        Weapon m16A4 = new Weapon("M16A4", 41,75);
        Weapon ump9 = new Weapon("UMP9", 35,92);
        Weapon sks = new Weapon("SKS", 55,90);
        weapons.add(akm);
        weapons.add(m16A4);
        weapons.add(ump9);
        weapons.add(sks);
        return weapons;
    }
    //获取武器
    public static Weapon GetWeapon(){
        Random random=new Random();
        return weapons.get(random.nextInt(weapons.size()));
    }

/*    public static void main(String[] args) {
        weapons();
        Weapon test=GetWeapon();
        Weapon t2=GetWeapon();
        System.out.println(test.getName());
        System.out.println(t2.getName());
    }*/
}

