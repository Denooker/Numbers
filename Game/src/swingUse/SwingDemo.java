package swingUse;
import javax.swing.*;
import java.awt.*;

public class SwingDemo {

    SwingDemo(){
        JFrame jfrm = new JFrame("It is simple application Swing");

        jfrm.setLayout(new FlowLayout(FlowLayout.CENTER));

        jfrm.setSize(500, 100);

        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel jlab = new JLabel("Programming interface with Swing.");

        jfrm.add(jlab);

        jfrm.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingDemo();
            }
        });
    }
}
