package Client;

/**
 * Created by Administrator on 2017/10/12.
 */
public class User {
    private String name;
    private int Skill;
    private int Lv;
    private int Hitrate;

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
}
