package com.company;

import java.util.Arrays;

/*
java.lang.System类中提供了大量的静态方法，可以获取与系统相关的信息和系统级操作，在System类的API文档中，常用的方法有：
-public static long currentTimeMills():返回以毫秒为单位的当前时间
-public static void arraycopy(Object src,int srcPos,Object dest,int destPos,int length);
将数组中指定的数据拷贝到另一个数组中
 */
public class Demo01System {
    public static void main(String[] args) {
        demo02();
    }
    private static void demo01(){
        long s=System.currentTimeMillis();
        for (int i = 1; i <9999 ; i++) {
            System.out.println(i);
        }
        long e=System.currentTimeMillis();
        System.out.println("我们的程序共耗时："+(e-s)+"毫秒");
    }
    /*
    public static void arraycopy(Object src,int srcpos,Object dest,int destpos,int length):
        src:原数组
        srcpos：源数组中的起始位置
        dest：目标数组
        destpos：目标数据中的起始位置
        length：要复制的数组元素的数量
     */
    private static void demo02(){
        int[] src={1,2,3,4,5,6};
        int[] dest={7,8,9,10,11,12};
        System.out.println("复制前"+ Arrays.toString(dest));
        //使用System类中的方法arraycopy将src数组中前3个元素，复制到dest数组的前3个位置上
        System.arraycopy(src,0,dest,0,3);
        System.out.println("复制后："+Arrays.toString(dest));
    }
}
