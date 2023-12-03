import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class gui extends JFrame {
    private JButton button = new JButton("Press");
    private JTextField input = new JTextField("", 5);
    private JLabel label = new JLabel("Input");
    private JRadioButton radioButton = new JRadioButton("Select");
    private JRadioButton radioButton1 = new JRadioButton("Select");
    private JCheckBox checkBox = new JCheckBox("Check", false);
    public gui (){
        super("My App");
        this.setBounds(100, 100, 250,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3,2, 2,2));
        container.add(label);
        container.add(input);

        ButtonGroup group = new ButtonGroup();
        group.add(radioButton);
        group.add(radioButton1);
        container.add(radioButton);
        radioButton.setSelected(true);
        container.add(radioButton1);
        container.add(checkBox);
        button.addActionListener(new ButtonEventListener());
        container.add(button);
    }

    class ButtonEventListener implements ActionListener{
        public void actionPerformed (ActionEvent e){
            String msg ="";
            msg += "Button was pressed\n";
            msg+= "Text is " +input.getText() + "\n";
            msg +=(radioButton.isSelected() ? "Radio 1 " : "Radio 2 ") +"is selected!\n";
            msg += "Checkbox is "+((checkBox.isSelected()) ? "yes" : "no");
            JOptionPane.showMessageDialog(null, msg, "Output", JOptionPane.PLAIN_MESSAGE);

        }
    }
}
