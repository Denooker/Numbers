package HowMuchCoreNeed;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Core_Demo implements ActionListener{

    static int series = 0;
    static int depth = 0;
    static int zone = 0;
    JLabel info;

    Core_Demo(){

        JFrame pik = new JFrame("Core check");

        pik.setSize(500,500);

        pik.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        pik.setLayout(new FlowLayout());

        JButton jbpik2 = new JButton("PIK2.0");
        JButton jbpik3 = new JButton("PIK3.0");
        JButton jb180 = new JButton("180mm");
        JButton jb200 = new JButton("200mm");
        JButton jbz1 = new JButton("1");
        JButton jbz2 = new JButton("2");
        JButton jbz3 = new JButton("3");
        JButton inf = new JButton("Info: ");

        jbpik2.addActionListener(this);
        jbpik3.addActionListener(this);
        jb180.addActionListener(this);
        jb200.addActionListener(this);
        jbz1.addActionListener(this);
        jbz2.addActionListener(this);
        jbz3.addActionListener(this);
        inf.addActionListener(this);

        pik.add(jbpik2);
        pik.add(jbpik3);
        pik.add(jb180);
        pik.add(jb200);
        pik.add(jbz1);
        pik.add(jbz2);
        pik.add(jbz3);
        pik.add(inf);

        info = new JLabel();
        pik.add(info);

        pik.setVisible(true);
    }

    public void actionPerformed (ActionEvent ae){
        switch (ae.getActionCommand()){
            case "PIK2.0":
                series = 2;
                break;
            case "PIK3.0":
                series = 3;
                break;
            case "180mm":
                depth = 180;
                break;
            case "200mm":
                depth = 200;
                break;
            case "1":
                zone = 1;
                break;
            case "2":
                zone = 2;
                break;
            case "3":
                zone = 3;
                break;
            case "Info: ":
                info.setText(Integer.toString(series) + " " + Integer.toString(depth) + " " + Integer.toString(zone));
                break;
        }

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Core_Demo();
            }
        });
    }
}
