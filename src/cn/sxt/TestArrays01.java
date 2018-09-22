package cn.sxt;

/**
 * Created by jkx on 2018/9/22.
 */
public class TestArrays01 {
    public static void main(String[] args){
        int[] a = new int[4];

        for(int i=0; i<a.length; i++){
            a[i] = 100*i;
        }

        for(int i = 0; i<a.length; i++){
            System.out.println(a[i]);
        }
    }

}
