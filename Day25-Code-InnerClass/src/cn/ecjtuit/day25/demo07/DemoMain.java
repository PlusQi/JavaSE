package cn.ecjtuit.day25.demo07;

public class DemoMain {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("马坤");//设置英雄名称

        //设置英雄技能
//        hero.setSkill(new SkillImpl());//使用单独定义的实现类

        /*//还可以使用匿名内部类
        Skill skill = new Skill() {
            @Override
            public void use() {
                System.out.println("叮叮叮");
            }
        };

        hero.setSkill(skill);*/

        //进一步简化，同时使用匿名内部类和匿名对象
        hero.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("嗷嗷嗷");
            }
        });
        hero.attack();


    }
}
