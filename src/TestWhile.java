/**
 * Created by jkx on 2018/9/16.
 */
public class TestWhile {
    public static void main(String[] args){
        //计算 1+2+3...+100
        int i = 1;
        int sum = 0;
        while(i <= 100){
            sum = sum + i;
            i ++;
        }
        System.out.println(sum + "," + i);

    }


}   //结果是 5050，101
