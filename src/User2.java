/** 测试static关键字用法
 * Created by jkx on 2018/9/17.
 */
public class User2 {
    int id;
    String name; //账户名
    String pwd; //密码

    static String company = "apple";

    public User2(int id, String name){

        this.id = id;
        this.name = name;
    }

    public void login(){
        printCompany();
        System.out.println(company);
        System.out.println("登陆"+ name);

    }

    public static void printCompany(){
     //   login(); //调用非静态成员，编译就会报错
        System.out.println(company);

    }

    public static void main(String[] args){
        User2 u = new User2(101, "jack");
        User2.printCompany();
        User2.company = "apply google";
        User2.printCompany();
        System.out.println(u.id);
        System.out.println(User2.company);
    }

}
