package com.newfile;

import java.util.ArrayList;
import java.util.Collections;

/*
    斗地主综合案例：
    1.准备牌
    2.洗牌
    3.发牌
    4.看牌
 */
public class Demo03Generic {
    public static void main(String[] args) {
        //1.准备牌
        //定义一个存储54牌的ArrayList集合，泛型使用String
        ArrayList<String> poker=new ArrayList<>();
        //定义两个数组，用于存储牌的花色和序号
        String[] colors={"♣","♦","♥","♠"};
        String[] nums={"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        //先把大王和小王存储到poker集合中
        poker.add("大王");
        poker.add("小王");
        //循环嵌套遍历两个数组，组装52张牌
        for (String color:colors){
            for (String num:nums){
                // System.out.println(color+num);
                //把组装好的牌放入集合中
                poker.add(color+num);
            }
        }
        //2.洗牌
        //使用集合的工具类Collection中的方法
        //static void shuffle(List<?> list)使用默认随机源对指定列表进行置换
        Collections.shuffle(poker);
        System.out.println(poker);

        /*
        3.发牌
         */
        //定义4个集合，存储玩家的牌和底牌
        ArrayList<String> player01=new ArrayList<>();
        ArrayList<String> player02=new ArrayList<>();
        ArrayList<String> player03=new ArrayList<>();
        ArrayList<String> dipai=new ArrayList<>();
        /*
        遍历poker集合，获取每一张牌
        使用poker集合的索引%3给3个玩家轮流发牌
        剩余3张牌给底牌
        注意：
            先判断底牌（i>=51）,否则牌就发没了

         */
        for (int i = 0; i <poker.size() ; i++) {
            String p=poker.get(i);
            if(i>=51){
                //给底牌发牌
                dipai.add(p);
            }
            else if(i%3==0){
                player01.add(p);
            }
            else if (i%3==1){
                player02.add(p);
            }
            else if(i%3==2){
                player03.add(p);
            }

        }
        System.out.println("刘德华"+player01);
        System.out.println("周星驰"+player02);
        System.out.println("周润发"+player03);
        System.out.println("底牌"+dipai);
    }
}
