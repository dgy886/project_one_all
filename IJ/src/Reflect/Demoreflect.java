package Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Demoreflect {
    public static void main(String[] args) throws Exception {
        //0.获取Person的Class对象
        Class personClass=Person.class;

        //1.Field[] getField()获取所有public修饰的成员变量
        Field[] field=personClass.getFields();
        for (Field field1 : field) {
            System.out.println(field1);
        }
        System.out.println("***************");
        Field a=personClass.getField("a");
        //获取变量a的值
        Person person=new Person();
        Object value=a.get(person);
        System.out.println(value);
        a.set(person,"zhangsan");
        System.out.println(person);
        System.out.println("*******************");
        //Field[] getDeclaredField():获取所有的成员变量，不考虑修饰符
        Field[] declaredField=personClass.getDeclaredFields();
        for (Field field1 : declaredField) {
            System.out.println(field1);
        }
        Field d=personClass.getDeclaredField("name");
        //忽略访问权限修饰符的安全检查
        d.setAccessible(true);//暴力反射
        Object value2=d.get(person);
        System.out.println(value2);
        //构造方法
        Constructor constructor=personClass.getConstructor(String.class,int.class);
        //创建对象
        Object person1=constructor.newInstance("zhangsan",29);
        System.out.println(person1);

    }
}
