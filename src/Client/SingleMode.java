package Client;

import Client.item.Weapon;

import java.util.ArrayList;
public class SingleMode {
    ; //�����ļ���
    static int userNum = 5;
    static User []users = new User[userNum];//��ɫ�ļ���
    static Thread threads[] = new Thread[userNum];//�̵߳ļ���
    public static final String []NAMES = {"Smith", "Johnson", "Williams", "Jones",
            "Brown", "Davis", "Miller", "Wilson", "Moore","Taylor", "Anderson", "Thomas", "Jackson"};
    public static String getName(){
        int a =(int)Math.abs(NAMES.length*Math.random());
        return NAMES[a];
    }
    public static void fight(){}

    public static void main(String[] args) {
        Weapon.weapons();//�������ʼ��
                for (int i = 0; i <users.length ; i++) {
                    users[i]=new User();
                    threads[i]=new Thread(users[i]);
                    threads[i].setName(getName());
                    threads[0].setName("Dd");
                    users[i].setName(threads[i].getName());
                    users[i].setWeapon();
                    threads[i].start();
                }

    }
}
