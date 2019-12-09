package cn.ecjtuit.day93.demo08.ThisMethodReference;

/*
* 通过this引用本类的成员方法
* */
public class Husband {
    //定义一个buyHouse方法
    public void buyHouse() {
        System.out.println("buyHouse");
    }

    //定义一个marry的方法，参数传递Richable接口
    public void marry(Ricahable r){
        r.buy();
    }

    public void happy(){
        //调用marry方法，方法的参数Richable是一个函数式接口，传递Lambda表达式
        /*marry(() -> {
            //使用this.成员方法，调用本类buyHouse方法
            this.buyHouse();
        });*/

        /*
        * 使用方法引用优化Lambda表达式
        * this是已经存在的
        * 本类的成员方法buyHouse也是已经存在的
        * 所以可以直接使用this引用本类的成员方法buyHouse
        * */
        marry(this::buyHouse);
    }

    public static void main(String[] args) {
        new Husband().happy();
    }
}
