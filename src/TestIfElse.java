/**
 * Created by jkx on 2018/9/16.
 */
public class TestIfElse {
    public static void main(String[] args){
        //随机产生一个[0.0,4.0)区间的半径，并计算面积和周长
        double r = 4 * Math.random();
        //Math.pow(r,2)求半径r的平方
        double area = Math.PI * Math.pow(r,2);
        double circle = 2 * Math.PI * r;

        System.out.println("半径为：" + r);
        System.out.println("面积为：" + area);
        System.out.println("周长为：" + circle);
        //如果面积>=周长，则输出"面积大于等于周长"，反之亦然
        if(area>=circle){
            System.out.println("面积大于周长");
        }else{
            System.out.println("周长大于面积啊！！！");
        }

    }
}
