/**
 * Created by jkx on 2018/9/16.
 */
public class TestMethod {
    public static void main(String[] args){
        boolean a=true;
        boolean b=false;
        if (!(a&&b)) {
            System.out.print("!(a&&b)");
        }else if (!(a||b)) {
            System.out.println("!(a||b)");
        }else {
            System.out.println("ab");
        }


        int sum = 0;
        for(int i=1; i<10; i++){
            do {
                i++;
                if (i % 2 != 0)
                    sum += i;
            }while(i<6);

            System.out.println(sum);   //输出结果 8。 do 和 while 可以理解为：while XX时，do XX。
        }


        System.out.println("************");

        int add = 0;
        int x = 0;
        int add1 = 0;
        while( x <=100){
            x++;
            add += x;
            add1 += add;
        }
        System.out.println(add1);


    }




}
