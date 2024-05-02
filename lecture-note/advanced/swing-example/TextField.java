import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Swing添加文本输入框
 */
public class TextField {

    public static void main(String[] args) {
        TextComponent obj = new TextComponent();
    }

}

class TextComponent extends JFrame implements ActionListener {

    public JTextField t1;
    public JButton button;
    public JLabel result;

    public TextComponent() {

        t1 = new JTextField(20); // 新建文本输入框t1 参数是显示textField的宽度
        button = new JButton("OK"); // Button显示的内容
        // 需要给button添加Listener来监听用户输入的内容(是一个interface)
        result = new JLabel("result");

        add(t1);
        add(button);
        add(result);
        button.addActionListener(this);

        setLayout(new FlowLayout());
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // 获取用户输入
        int num1 = Integer.parseInt(t1.getText());
        result.setText(num1 + "");
        // result label会更新为用户输入的int值
    }
}
