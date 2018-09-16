/**
 * Created by jkx on 2018/9/16.
 */
public class TestSwitch {
    public static void main(String[] args){
        int month = (int)(1 + 12 * Math.random());
        System.out.println("现在是" + month + "月份");
        System.out.println("###########");

        switch(month){
            case 1:
                System.out.println("一月份，过年咯");
                break;   //没有break，程序会继续往下执行
            case 2:
                System.out.println("二月份，春天咯");
                break;
            case 3:
                System.out.println("三月份，清明咯");
                break;
            default:
                System.out.println("我是其他月份");
                break;
        }

    }

}
