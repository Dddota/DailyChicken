package Client;

import Client.item.Weapon;

import java.util.ArrayList;

public class Test {
    static ArrayList<Weapon> weapons = new ArrayList<Weapon>(); //武器的集合

    public static void main(String[] args) {
        //定义给类型武器
        Weapon akm = new Weapon("AKM",48);
        Weapon m16A4 = new Weapon("M16A4",41);
        Weapon ump9 = new Weapon("UMP9",35);
        Weapon sks = new Weapon("SKS",55);

        //将武器加入集合中
        weapons.add(akm);
        weapons.add(m16A4);
        weapons.add(ump9);
        weapons.add(sks);

        //新建User对象
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
