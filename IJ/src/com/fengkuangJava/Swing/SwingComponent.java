package com.fengkuangJava.Swing;

import javax.swing.*;

public class SwingComponent {
    JFrame f=new JFrame("测试");
    //定义一个按钮，并为之指定图标
    Icon okIcon=new ImageIcon("ico/ok.png");
    JButton ok=new JButton("确认",okIcon);
    //定义一个单选按钮，初始状态为选中
    JRadioButton male=new JRadioButton("男",true);
    JRadioButton female=new JRadioButton("女",false);
    //定义一个ButtonGroup用于组合上面的两个按钮
    ButtonGroup bg=new ButtonGroup();
    //定义一个复选框，初始处于没有选中状态
    JCheckBox married=new JCheckBox("是否已婚？",false);
    String[] colors=new String[]{"红色","绿色","蓝色"};
    //定义一个下拉选项框
    JComboBox<String> colorChooser=new JComboBox<>(colors);
    //定义一个列表选择框
    JList<String> colorList=new JList<>(colors);
    //定义一个8行20列的多文本域
    JTextArea ta=new JTextArea(8,20);
    //定义一个40列的单行文本域
    JTextField name=new JTextField(40);
    JMenuBar mb=new JMenuBar();
    JMenu file=new JMenu("文件");
    JMenu edit=new JMenu("编辑");
    //创建“新建”菜单选项，并为之指定图标
    Icon newIcon=new ImageIcon("ico/new.png");
    JMenuItem newItem=new JMenuItem("新建",newIcon);
    //创建“保存”菜单项，并为之指定图标
    Icon saveIcon=new ImageIcon("ico/save.png");
    JMenuItem saveItem=new JMenuItem("保存",saveIcon);
    //创建“退出”菜单项，并为之指定图标
    Icon exitIcon=new ImageIcon("ico/exit.png");

}
