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
    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;


        //���������뼯����

    }
    public static Weapon GetWeapon(){
        Weapon akm = new Weapon("AKM", 48);
        Weapon m16A4 = new Weapon("M16A4", 41);
        Weapon ump9 = new Weapon("UMP9", 35);
        Weapon sks = new Weapon("SKS", 55);
        ArrayList<Weapon> weapons = new ArrayList<Weapon>();
        weapons.add(akm);
        weapons.add(m16A4);
        weapons.add(ump9);
        weapons.add(sks);
        //�½�User����
        Random random=new Random();
        return weapons.get(random.nextInt(weapons.size()));
    }
}

