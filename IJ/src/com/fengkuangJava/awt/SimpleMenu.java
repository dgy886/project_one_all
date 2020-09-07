package com.fengkuangJava.awt;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SimpleMenu {
    private Frame f=new Frame("测试");
    private MenuBar mb=new MenuBar();
    Menu file=new Menu("file");
    Menu edit=new Menu("edit");
    MenuItem newItem=new MenuItem("new");
    MenuItem saveItem=new MenuItem("save");
    //创建exitItem菜单项，指定使用“Ctrl+X”快捷键
    MenuItem exitItem=new MenuItem("exit",new MenuShortcut(KeyEvent.VK_X));
    CheckboxMenuItem autoWrap=new CheckboxMenuItem("autoWrap");
    MenuItem copyItem=new MenuItem("copy");
    MenuItem pasteItem=new MenuItem("paste");
    Menu format=new Menu("format");
    //创建commentItem菜单项，指定使用“Ctrl+Shift+/”快捷键
    MenuItem commentItem=new MenuItem("comment",new MenuShortcut(KeyEvent.VK_SLASH,true));
    MenuItem cancelItem=new MenuItem("cancel");
    private TextArea ta=new TextArea(6,40);
    public void init(){
        //以Lambda表达式创建菜单事件监听器
        ActionListener menuListener=e -> {
            var cmd=e.getActionCommand();
            ta.append("单击“"+cmd+"”菜单"+"\n");
            if (cmd.equals("退出")){
                System.exit(0);
            }
        };
        //为CommentItem菜单项添加事件监听器
        commentItem.addActionListener(menuListener);
        exitItem.addActionListener(menuListener);
        //为file菜单添加菜单项
        file.add(newItem);
        file.add(saveItem);
        file.add(exitItem);
        //为edit菜单添加菜单项
        edit.add(autoWrap);
        //使用addSeparator方法来添加菜单分隔线
        edit.addSeparator();
        edit.add(copyItem);
        edit.add(pasteItem);
        //为format菜单添加菜单项
        format.add(commentItem);
        format.add(cancelItem);
        //使用添加new MenuItem（"-"）的方式添加菜单分隔线
        edit.add(new MenuItem("-"));
        //将format菜单组合到edit菜单中，从而形成二级菜单
        edit.add(format);
        //将file、edit菜单添加到mb菜单条中
        mb.add(file);
        mb.add(edit);
        //为f窗口设置菜单条
        f.setMenuBar(mb);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        f.add(ta);
        f.pack();
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new SimpleMenu().init();
    }
}
