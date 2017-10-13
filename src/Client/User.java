package Client;

import Client.item.Weapon;

import java.util.Random;

import static Client.Test.weapons;

/**
 * Created by Administrator on 2017/10/12.
 */
public class User {
    private String name;//角色名称
    private int HP=100;//角色血量
    private int Skill;//角色的熟练度
    private int Lv;//根据熟练度上升达到的级别
    private int Hitrate;//根据级别高低会影响命中率的偏差值.
    private Weapon weapon;

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

    public User(String name){
        this.name = name;
    }

    public Weapon GetWeapon(){
        Random random=new Random();
        weapon = weapons.get(random.nextInt(weapons.size()));
        return weapon;
    }

    public void attack(User tar){
        GetWeapon();    //获得一把武器
        //需要获得一个user的list来产生一个随机攻击的tar.
        tar.HP=HP-weapon.getDamage();
        System.out.println(this.getName()+"攻击了"+tar.getName()+",造成"+weapon.getDamage()+"点伤害");
    }

    public boolean die(){
        if (this.HP<=0){
            this.HP = 0;
            System.out.println(this.getName()+"已阵亡");
            return true;
        }else {
            return false;
        }
    }
}
