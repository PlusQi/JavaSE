package cn.ecjtuit.day25.demo06;

public class DemoMain {
    public static void main(String[] args) {
        //创建角色
        Hero hero = new Hero();
        //起名字，设置年龄
        hero.setName("马坤");
        hero.setAge(21);

        //创建武器对象
        Weapon weapon = new Weapon("没用大棒");
        //为英雄配备武器
        hero.setWeapon(weapon);

        hero.attack();

    }
}
