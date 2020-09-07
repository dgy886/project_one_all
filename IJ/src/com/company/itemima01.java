package com.company;

public class itemima01 {
    public static void main(String[] args) {
        //获取一下当前系统的时间
        long time=System.currentTimeMillis();
        System.out.println(time);

        //arraycopy（int[] src,srcindex,int[] dest,int destindex,int count）复制数组
        int[] arr1={1,2,3,4,5,6,7,8,9};
        int[] arr2={9,8,7,6,5,4,3,2,1};
        System.arraycopy(arr1,0,arr2,0,4);
        for (int i: arr2) {
            System.out.print(i+" ");
        }

    }


}
