import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserInput {
    public static void main(String[] args) {

        UserInputDemo obj = new UserInputDemo();
    }
}

class UserInputDemo extends JFrame {

    JTextField text; // TextField for userName
    JLabel label; // show output
    JButton button; // For creating event
    JRadioButton radioButtonFemale, getRadioButtonMale;

    public UserInputDemo() {

        text = new JTextField(15);
        label = new JLabel("Greeting");
        JButton button = new JButton("OK");
        radioButtonFemale = new JRadioButton("Female");
        getRadioButtonMale = new JRadioButton("Male");

        add(text);
        add(button);
        add(radioButtonFemale);
        add(getRadioButtonMale);
        add(label);
        // add的顺序matters 界面会按add的顺序进行展示
        // 匿名函数
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = text.getText();
                if (radioButtonFemale.isSelected()) {
                    name = "Mrs " + name;
                } else {
                    name = "Mr " + name;
                }
                label.setText(name);
            }
        });


        setLayout(new FlowLayout());
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
