/**
 * Created by jkx on 2018/9/20.
 */
public class Stu02 {

    String name;
    int id;


    public Stu02(String name, int id){
        this.name = name;
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public static void main(String[] args){
        Stu02 sss = new Stu02("lily", 888);
        System.out.println(sss.name);
    }

}
