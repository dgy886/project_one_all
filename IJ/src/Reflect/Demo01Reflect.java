package Reflect;

import java.lang.reflect.Method;
/*
    反射：框架设计的灵魂
        框架：半成品软件.可以在框架的基础上进行软件开发，简化编码
        反射：将类的各个组成部分分装为其他对象，这就是反射机制
            好处：
                1.可以在程序运行过程中，操作这些对象
                2.可以解耦，提高程序的可拓展性

          获取Class对象的方式：
            1.Class.forName（“全类名”）：将字节码文件加载进内存，返回Class对象
            2.类名.class:通过类名的属性class获取
            3.对象.getclass：getclass（）发放在Object类中定义着
 */

public class Demo01Reflect {
    public static void main(String[] args) throws Exception {
        /*
            获取成员方法：
                *Method[] getMethods()
                *
         */

        //获取Person的class对象
        Class personClass=Person.class;

        //获取指定名称的方法
        Method eat_method=personClass.getMethod("eat");
        Person person=new Person();
        //执行方法
        eat_method.invoke(person);

        Method eat_Method1=personClass.getMethod("eat", String.class);
        eat_Method1.invoke(person,"fan");
        System.out.println("----------------------------");
        //获取所有public修饰的方法
        Method[] methods=personClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
            String name = method.getName();
            System.out.println(name);

        }
    }
}
