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
    private String name;//��ɫ����
    private int HP=100;//��ɫѪ��
    private double Exp=0;//��ɫ��������
    private int Lv;//���������������ﵽ�ļ���
    private int Hitrate;//���ݼ���ߵͻ�Ӱ�������ʵ�ƫ��ֵ.
    private Weapon weapon;
    private int kill;//��ɫ�Ļ�ɱ��
    boolean Death = false;//��ɫ�Ƿ�����
    //static ArrayList<Weapon> weapons = new ArrayList<Weapon>();//�������б�


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
                    System.out.println(this.getName() + "������" + tar.getName()+",���" + weapon.getDamage() + "���˺�");
                    this.setExp(weapon.getDamage()*1.0/10);
                    System.out.println(this.getName()+"�ľ���Ϊ��"+this.getExp());
                }
                else {
                    System.out.println(this.getName() + "������" + tar.getName() + ",���" + tar.HP + "���˺�");
                    this.setExp(tar.HP*1.0/10);
                    System.out.println(this.getName()+"�ľ���Ϊ��"+this.getExp());
                }
                tar.setHP(tar.getHP()-weapon.getDamage());
            }
            tar.die();
            this.kill++;
            this.setExp(10.0);
            System.out.println(this.getName()+"ʹ��"+weapon.getName()+",��ɱ��"+tar.getName());
            System.out.println(this.getName()+"�ľ���Ϊ��"+this.getExp());
        }
    public void die(){
            SingleMode.userNum--;
            this.Death=true;
        System.out.println("��ǰ���ʣ�ࣺ"+userNum+"��");
        }
    @Override
    public void run() {
        System.out.println(this.getName() + "�����" + weapon.getName());
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

