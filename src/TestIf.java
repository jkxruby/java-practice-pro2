/**
 * Created by jkx on 2018/9/16.
 */
public class TestIf {
    public static void main(String[] args){
        double d = Math.random(); //返回0-1之间的随机数
        System.out.println(d);
        System.out.println("#########");

        int i = (int)(6*Math.random()+1); //Math.random生成的数小于1，所以乘6后，再整数化结果就是0-5，所以要加一
        System.out.println(i);
        System.out.println("%%%%%%%%%");

        if(i<=3){
            System.out.println("小");
        }else{
            System.out.println("大");
        }


    }
}
