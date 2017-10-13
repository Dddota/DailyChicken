package Client;

import Client.item.Weapon;

import java.util.Random;

import static Client.Test.weapons;

/**
 * Created by Administrator on 2017/10/12.
 */
public class User {
    private String name;//��ɫ����
    private int HP=100;//��ɫѪ��
    private int Skill;//��ɫ��������
    private int Lv;//���������������ﵽ�ļ���
    private int Hitrate;//���ݼ���ߵͻ�Ӱ�������ʵ�ƫ��ֵ.
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
        GetWeapon();    //���һ������
        //��Ҫ���һ��user��list������һ�����������tar.
        tar.HP=HP-weapon.getDamage();
        System.out.println(this.getName()+"������"+tar.getName()+",���"+weapon.getDamage()+"���˺�");
    }

    public boolean die(){
        if (this.HP<=0){
            this.HP = 0;
            System.out.println(this.getName()+"������");
            return true;
        }else {
            return false;
        }
    }
}
