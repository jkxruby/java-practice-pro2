/**
 * Created by jkx on 2018/9/16.
 */
public class TestElseIf {
    public static void main(String[] args){
        int age = (int)(100 * Math.random()); //第二个(int)为什么有括号？ 因为这就是Java强制类型转换的格式
        System.out.println("年龄是" + age +",属于");

        if(age<15){
            System.out.println("还是孩子嘛，乖乖的");
        } else if(age<30){
            System.out.println("年轻人，要努力的年纪");
        } else if(age < 60){
            System.out.println("上有老下有小啊");
        } else{
            System.out.println("等着入土咯");
        }

    }

}
