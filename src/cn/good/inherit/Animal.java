package cn.good.inherit;

/**
 * Created by jkx on 2018/9/21.
 */
public class Animal {
    String eye; //属性

    public void run(){    //方法
        System.out.println("run like wind");

    }

    public void eat(){
        System.out.println("eat food");
    }


}

class Mammal extends Animal{  //哺乳动物
    String eye;

    public void run(){
        System.out.println("我的跑法不一样");

    }

    public void eat(){
        System.out.println("我的吃饭");
    }
    public void taisheng(){
        System.out.println("胎生动物");
    }


    public static void main(String[] args){
        Paxing pa = new Paxing();
        pa.eat();
        pa.eye = "hah";
        pa.run();
        pa.nuansheng();
        pa.eye.toString();
        System.out.println(pa.toString());

    }

}


class Paxing extends Animal{
    String eye;

    public void run(){
        System.out.println("paxing run");
    }


    public void nuansheng(){
        System.out.println("wo shi nuan sheng");
    }
}

