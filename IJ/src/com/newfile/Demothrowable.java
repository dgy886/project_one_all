package com.newfile;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    java.lang.Throwable:类是Java语言中所有错误或异常的超类
        Exception:编译期异常，进行编译（写代码）java程序出现的问题
            RuntimeException：运行期异常，java程序运行过程中出现的问题
            异常就相当于程序得了一个小毛病，把异常处理掉，程序就可以继续·执行了
    Error：错误
        错误就就相当于程序得了无法治愈的毛病
 */



/*
    throw关键字：
    作用：
        可以使用throw关键字在指定的方法中抛出指定的异常
    使用格式：
        throw new xxxException("异常产生放入原因");
    注意：
        1.throw关键字必须写在方法的内部
        2.throw关键字后面new的对象必须是Expection或者Expection的子类对象
        3.throw关键字抛出指定的异常对象，我们就必须处理这个异常对象
            throw关键字后面创建的是RuntimeExpection或者是RuntimeExpection的子类对象，我们可以不处理，默认交给jvm处理
            throw关键字后面创建的是编译异常（写代码的时候就报错），我们必须处理掉这个异常，要么throw，要么try。。。。catch

 */



/*
    try... catch能执行后续的代码
    throw不能执行后续的代码

 */


/*
    Throwable类中定义了3个异常处理的方法
    String getMessage（）返回此throwable的简短描述
    String toString（）返回此throwable的详细消息字符串
    void printStackTrace（） JVM打印异常对象，默认此方法，打印的异常信息最全面
 */



/*
    一个try多个catch注意事项：
        catch里面定义的异常变量，如果有子父类关系，那么子类的异常变量必须写在上面，否则就会报错
        ArrayIndexOutOfBoundsException extends IndexOutOfBoundsExpection
 */
public class Demothrowable {
    public static void main(String[] args) /*throws ParseException*/ {
        //Exception:编译期异常，进行编译（写代码）java程序出现的问题
      /*  SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd");
        Date date= null;
        try {
            date = sdf.parse("1999-1227");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date);*/
       /* int[] arr={1,2,3};

        try{  //try抛出什么异常对象，catch就定义什么异常变量，用来接收这个异常对象
            System.out.println(arr[3]);
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("后续代码");*/
       // System.out.println("--------------");
/*        int[] arr=null;
        if (arr==null){
            throw new NullPointerException("空指针异常");
        }*/
/*        System.out.println("********************");
        try {
            readfile("c://a.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            System.out.println("资源释放");
        }*/
        int a=getA();
        System.out.println(a);
        System.out.println("******************");
        method();
    }
    public static void readfile(String filename) throws FileNotFoundException {
        if (!filename.equals("C:\\a.txt")){
            throw new FileNotFoundException("此路径下不存在");
        }
    }

    public static int getA(){
        //如果finally有return语句，永远返回finally中的结果，所以要尽可能避免在finally中写1return语句
        int a=10;
        try {
            return a;
        }catch (Exception e){
            System.out.println(e);
        }finally {
            a=100;
            //System.out.println(a);
            return a;
        }
    }
    public static void method(){
        int a=0;
        int b=1;
        try{
            int c=b/a;
            return;
        }catch (Exception e){
            System.out.println("出错!!!");
        }finally {
            a=100;
            System.out.println(a);
        }
    }

}
class RegisterException extends Exception{
    //添加一个空参数的构造方法
    public RegisterException(){
        super();
    }
    public RegisterException(String s){
        super(s);
    }
}
