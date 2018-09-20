/**
 * Created by jkx on 2018/9/16.
 */
public class TestStu {

    //属性fields
    int id;
    String sname;
    int age;

    Computer comp; //电脑

    //方法
    void study(){
        System.out.println("i am study hard!" + comp.brand );

    }

    void play(){
        System.out.println("i am play game!");

    }

    //构造方法，用于创造这个类的对象，无参构造可以由系统自动创建
    TestStu(){

    }


    //程序执行的入口，必须要由
    public static void main(String[] args) {
        TestStu stu = new TestStu();
        stu.play();
        stu.id = 888;
        stu.sname = "jack";
        stu.age = 18;

        Computer c1 = new Computer();
        c1.brand = "apple";

        stu.comp = c1;
        stu.study();
        System.out.println(stu);

    }

}

class Computer {
    String brand;
}

