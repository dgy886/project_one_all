package com.newfile;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;

public class RuntimeTest {
    public static void main(String[] args) throws Exception {
//        var rt=Runtime.getRuntime();
//        System.out.println("处理器数量："+rt.availableProcessors());
//        System.out.println("空闲内存数："+rt.freeMemory());
//        System.out.println("总内存数："+rt.totalMemory());
//        System.out.println("可用最大内存数"+rt.maxMemory());

        var rt=Runtime.getRuntime();
          //运行记事本程序
        Process p= rt.exec("notepad.exe");
        ProcessHandle ph=p.toHandle();
        System.out.println("进程是否运行："+ph.isAlive());
        System.out.println("进程ID："+ph.pid());
        System.out.println("父进程："+ph.parent());
        //获取ProcessHandle.Info info信息
        ProcessHandle.Info info=ph.info();
        System.out.println("进程命令："+info.command());
        System.out.println("进程参数："+info.arguments());
        System.out.println("进程启动时间："+info.startInstant());
        System.out.println("进程累计运行时间："+info.totalCpuDuration());
        CompletableFuture<ProcessHandle> cf=ph.onExit();

    }
}
