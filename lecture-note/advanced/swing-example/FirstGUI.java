import javax.swing.*;
import java.awt.*;

import javax.swing.*;
import java.awt.*;

public class FirstGUI {
    public static void main(String[] args) {
        FirstGUIExample obj = new FirstGUIExample();
    }
}


class FirstGUIExample extends JFrame {

    public FirstGUIExample() {
        super("Main Menu"); // 程序名

        setLayout(new FlowLayout()); // 切换到FlowLayout
        // FlowLayout按照组件的添加顺序排序

        JLabel label = new JLabel("Enter topic here");
        JLabel label2 = new JLabel("Enter second topic here");
        add(label);
        // JFrame默认使用BorderLayout, 当使用add(Component)时, 如果没有指定位置
        // 每个默认都会被添加到中心区域, (中心区域只能设置一个组件), 第一次添加的会被覆盖
        add(label2);

        setSize(400, 400);
        setVisible(true);

        // 关闭application程序仍然运行 需要显式调用
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
