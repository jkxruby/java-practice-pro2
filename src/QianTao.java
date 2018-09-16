/**
 * Created by jkx on 2018/9/16.
 */
public class QianTao {
    //用嵌套实现9 9 乘法表
    public static void main(String[] args){

        for(int m=1; m<=9; m++ ){

            for(int n=1; n<=m; n++){
                System.out.print(n + "*" + m + "=" + (m*n) + "\t");

            }
            System.out.println();  //起到换行的作用

        }

        System.out.println("__________________-");
        //用while循环或其他方式输出1-1000之间被5整除的数，且每行5个
        //用while循环计算100内的奇数和偶数的和，并输出

        int sum01 = 0;
        int sum02 = 0;
        for(int i=1; i<=100; i++){
            if(i%2==0){
                sum01 += i;
            }else{
                sum02 += i;
            }
        }
        System.out.println("奇数和:"+sum01);
        System.out.println("偶数和："+sum02);

        System.out.println("****************");


        for (int j=1; j<=1000;j++){
            if(j%5==0 && j%25 != 0){
                System.out.print(j + "\t");
            }else if(j%25==0){
                System.out.println(j + "\t");

            }
        }

    }

}
