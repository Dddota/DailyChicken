package Client.item;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Administrator on 2017/10/12.
 */
public class Weapon {
    private String name;//��������
    private int damage;//�����˺�
    private int Cd;//�����������.
    static ArrayList<Weapon> weapons = new ArrayList<Weapon>();
    public String getName() {
        return name;
    }
    public int getDamage() {
        return damage;
    }

    public Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }
    //���������뼯����
    public  static ArrayList weapons(){
        Weapon akm = new Weapon("AKM", 48);
        Weapon m16A4 = new Weapon("M16A4", 41);
        Weapon ump9 = new Weapon("UMP9", 35);
        Weapon sks = new Weapon("SKS", 55);
        weapons.add(akm);
        weapons.add(m16A4);
        weapons.add(ump9);
        weapons.add(sks);
        return weapons;
    }
    //��ȡ����
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

