//子类和父类在同一个包里面，子类自然继承父类中的public成员和方法
public class Main {
    public static void main(String[] args) {
        Student zhang = new Student();
        //不用构造函数？怎么可以直接调用赋值？
        zhang.age = 17;                 //访问继承的成员变量
        zhang.number = 100101;          //调用继承的方法
        zhang.showPeopleMess();
        zhang.tellNumber();
        int x = 9, y = 29;
        System.out.print("会做加法：");
        int result = zhang.add(x, y);
        System.out.printf("%d+%d=%d\n",x,y,result);

        UniverStudent geng = new UniverStudent();
        geng.age = 21;                  //访问继承的成员变量
        geng.number = 6609;             //访问继承的成员变量
        geng.showPeopleMess();          //调用继承的方法
        geng.tellNumber();              //调用继承的方法
        System.out.print("会做加法：");
        result = geng.add(x,y);         //调用继承的方法
        System.out.printf("%d+%d=%d\t",x,y,result);
        System.out.print("会做乘法：");
        result = geng.multi(x,y);
        System.out.printf("%d*%d=%d\n",x,y,result);

    }
}