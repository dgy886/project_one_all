package com.newfile;

public class GenericMethod {
    public <M> void method01(M m){
        System.out.println(m);
    }
    public static <s> void method02(s S){
        System.out.println(S);
    }
}
