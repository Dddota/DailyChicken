package Client;

import Client.item.Weapon;

import java.util.ArrayList;
import java.util.Random;
import static Client.SingleMode.userNum;
import static Client.SingleMode.users;

/**
 * Created by Administrator on 2017/10/12.
 */
public class User implements Runnable{
    private String name;//角色名称
    private int HP=100;//角色血量
    private double Exp=0;//角色的熟练度
    private int Lv;//根据熟练度上升达到的级别
    private int Hitrate;//根据级别高低会影响命中率的偏差值.
    private Weapon weapon;
    private int kill;//角色的击杀数
    boolean Death = false;//角色是否生还
    //static ArrayList<Weapon> weapons = new ArrayList<Weapon>();//武器库列表


    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon() {
        this.weapon = Weapon.GetWeapon();
    }

    public int getKill() {
        return kill;
    }

    public void setKill(int kill) {
        this.kill += kill;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getExp() {
        return Exp;
    }
    public void setExp(double Exp) {
        this.Exp += Exp;
    }
    public int getLv() {
        return Lv;
    }
    public void setLv(int lv) {
        this.Lv = lv;
    }
    public int getHitrate() {
        return Hitrate;
    }
    public void setHitrate(int hitrate) {
        this.Hitrate = hitrate;
    }

    public User(){
    }

    public User(String name){
        this.name = name;
    }

    public void attack(User tar){
            while (tar.HP > 0){
                if (weapon.getDamage() < tar.HP){
                    System.out.println(this.getName() + "攻击了" + tar.getName()+",造成" + weapon.getDamage() + "点伤害");
                    this.setExp(weapon.getDamage()*1.0/10);
                    System.out.println(this.getName()+"的经验为："+this.getExp());
                }
                else {
                    System.out.println(this.getName() + "攻击了" + tar.getName() + ",造成" + tar.HP + "点伤害");
                    this.setExp(tar.HP*1.0/10);
                    System.out.println(this.getName()+"的经验为："+this.getExp());
                }
                tar.setHP(tar.getHP()-weapon.getDamage());
            }
            tar.die();
            this.kill++;
            this.setExp(10.0);
            System.out.println(this.getName()+"使用"+weapon.getName()+",击杀了"+tar.getName());
            System.out.println(this.getName()+"的经验为："+this.getExp());
        }
    public void die(){
            SingleMode.userNum--;
            this.Death=true;
        System.out.println("当前玩家剩余："+userNum+"名");
        }
    @Override
    public void run() {
        System.out.println(this.getName() + "获得了" + weapon.getName());
        int cd=(int) (1000+Math.random() * 4000);
        try {
            Thread.currentThread().sleep(cd);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        while (!Death){
        for (int i = 0; i <users.length; i++) {
            if (users[i] != null && users[i] != this&& !users[i].Death) {
                this.attack(users[i]);
            }
        }
        }
    }
}

