package Client;

import Client.item.Weapon;

import java.util.Random;

/**
 * Created by Administrator on 2017/10/12.
 */
public class User {
    private String name;//角色名称
    private int HP=100;//角色血量
    private int Skill;//角色的熟练度
    private int Lv;//根据熟练度上升达到的级别
    private int Hitrate;//根据级别高低会影响命中率的偏差值.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSkill() {
        return Skill;
    }

    public void setSkill(int skill) {
        Skill = skill;
    }

    public int getLv() {
        return Lv;
    }

    public void setLv(int lv) {
        Lv = lv;
    }

    public int getHitrate() {
        return Hitrate;
    }

    public void setHitrate(int hitrate) {
        Hitrate = hitrate;
    }
    public User(){
    }
    public Weapon GetWeapon(){
        Weapon weapon=null;
        Random random=new Random();
        switch (random.nextInt(4)){
            case 1:
                weapon=new Weapon("AKM",48);
                break;
            case 2:
                weapon=new Weapon("M16A4",41);
                break;
            case 3:
                weapon=new Weapon("UMP9",35);
                break;
            case 4:
                weapon=new Weapon("SKS",55);
                break;
        }
        return weapon;
    }
    public void attack(User tar){
        Weapon weapon=GetWeapon();
        //需要获得一个user的list来产生一个随机攻击的tar.
        tar.HP=HP-weapon.getDamage();
        System.out.println(this.getName()+"攻击了"+tar.getName()+",造成"+weapon.getDamage()+"点伤害");
    }
    public void die(){
        if (this.HP<=0){
            System.out.println(this.getName()+"已阵亡");
        }
    }
}
