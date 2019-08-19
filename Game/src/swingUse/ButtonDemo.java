package swingUse;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class ButtonDemo implements ActionListener {

    JLabel jlab;

    ButtonDemo(){
        JFrame jfrm = new JFrame("Button example");

        jfrm.setLayout(new FlowLayout(FlowLayout.CENTER));

        jfrm.setSize(220, 90);

        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton jbtnUp = new JButton("Droped");
        JButton jbtnDown = new JButton("Pushed");

        jbtnUp.addActionListener(this);
        jbtnDown.addActionListener(this);

        jfrm.add(jbtnUp);
        jfrm.add(jbtnDown);

        jlab = new JLabel("Push the button");

        jfrm.add(jlab);

        jfrm.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand().equals("Droped"))
            jlab.setText("The button droped");
        else
            jlab.setText("The button pushed");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ButtonDemo();
            }
        });
    }
}
