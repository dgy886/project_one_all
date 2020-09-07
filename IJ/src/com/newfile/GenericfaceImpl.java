package com.newfile;
/*
含有泛型的接口，第一种使用方式：定义接口的实现类，实现接口，指定接口的泛型
public interface Interator<E>{

}
 */
public class GenericfaceImpl implements GenericInterface<String>{
    @Override
    public void method(String o) {
        System.out.println(o);
    }
}
