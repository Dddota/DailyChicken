package Client;

import Client.item.Weapon;

import java.util.ArrayList;

public class Test {
    static ArrayList<Weapon> weapons = new ArrayList<Weapon>(); //�����ļ���

    public static void main(String[] args) {
        //�������������
        Weapon akm = new Weapon("AKM",48);
        Weapon m16A4 = new Weapon("M16A4",41);
        Weapon ump9 = new Weapon("UMP9",35);
        Weapon sks = new Weapon("SKS",55);

        //���������뼯����
        weapons.add(akm);
        weapons.add(m16A4);
        weapons.add(ump9);
        weapons.add(sks);

        //�½�User����
        User user01 = new User("Tom");
        User user02 = new User("Jack");
        while(!user01.die() && !user02.die()){
            if(!user02.die()){
                user01.attack(user02);
            }
            if(!user01.die()) {
                user02.attack(user01);
            }
        }
    }
}
