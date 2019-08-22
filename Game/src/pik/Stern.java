package pik;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;

public class Stern implements ActionListener {

    JLabel jlSeria;
    JRadioButton jrbPik2, jrbPik3;

    JLabel jlDepth;
    JRadioButton jrb180, jrb200;

    JLabel jlZone;
    JRadioButton jrbFirst, jrbSecond, jrbThird;

    JLabel jlLength;
    JTextField jtfLength;

    JButton jbAnswer;

    JLabel jlAnswer;

    ButtonGroup bg;

    Stern(){

        JFrame jfrm = new JFrame("Необходимое количество стержней");
        jfrm.setLayout(new FlowLayout());
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setSize(300,300);

        bg = new ButtonGroup();
        jlSeria = new JLabel("Выберите серию:");
        jrbPik2 = new JRadioButton("ПИК2.0");
        jrbPik3 = new JRadioButton("ПИК3.0");
        bg.add(jrbPik2);
        bg.add(jrbPik3);
        jrbPik2.addActionListener(this);
        jrbPik3.addActionListener(this);

        bg = new ButtonGroup();
        jlDepth = new JLabel("Выберите толщину:");
        jrb180 = new JRadioButton("180");
        jrb200 = new JRadioButton("200");
        bg.add(jrb180);
        bg.add(jrb200);
        jrb180.addActionListener(this);
        jrb200.addActionListener(this);

        bg = new ButtonGroup();
        jlZone = new JLabel("Выберите зону:");
        jrbFirst = new JRadioButton("I");
        jrbSecond = new JRadioButton("II");
        jrbThird = new JRadioButton("III");
        bg.add(jrbFirst);
        bg.add(jrbSecond);
        bg.add(jrbThird);
        jrbFirst.addActionListener(this);
        jrbSecond.addActionListener(this);
        jrbThird.addActionListener(this);

        jlLength = new JLabel("Введите длину простенка(в мм):");
        jtfLength = new JTextField(20);
        jtfLength.setActionCommand("length");

        jbAnswer = new JButton("Рассчитать");
        jbAnswer.addActionListener(this);

        jlAnswer = new JLabel("");

        jfrm.add(jlLength);
        jfrm.add(jtfLength);
        jfrm.add(jlSeria);
        jfrm.add(jrbPik2);
        jfrm.add(jrbPik3);
        jfrm.add(jlDepth);
        jfrm.add(jrb180);
        jfrm.add(jrb200);
        jfrm.add(jlZone);
        jfrm.add(jrbFirst);
        jfrm.add(jrbSecond);
        jfrm.add(jrbThird);
        jfrm.add(jbAnswer);
        jfrm.add(jlAnswer);

        jfrm.setVisible(true);
    }

    String v;
    double length;
    double cores;
    public void actionPerformed(ActionEvent ae){

        if(jrbPik2.isSelected()&
                jrb180.isSelected()&
                jrbFirst.isSelected()){
            length = Double.parseDouble(jtfLength.getText())/1000;
            cores = Math.ceil((length*5.24)/0.785);
            jlAnswer.setText(Double.toString(cores));
        }
        else if(jrbPik2.isSelected()&
                jrb180.isSelected()&
                jrbSecond.isSelected()){
            length = Double.parseDouble(jtfLength.getText())/1000;
            cores = Math.ceil((length*3.93)/0.785);
            jlAnswer.setText(Double.toString(cores));
        }
        else if(jrbPik2.isSelected()&
                jrb180.isSelected()&
                jrbThird.isSelected()){
            length = Double.parseDouble(jtfLength.getText())/1000;
            cores = Math.ceil((length*2.52)/0.503);
            jlAnswer.setText(Double.toString(cores));
        }

        else if(jrbPik2.isSelected()&
                jrb200.isSelected()&
                jrbFirst.isSelected()){
            length = Double.parseDouble(jtfLength.getText())/1000;
            cores = Math.ceil((length*3.93)/0.785);
            jlAnswer.setText(Double.toString(cores));
        }
        else if(jrbPik2.isSelected()&
                jrb200.isSelected()&
                jrbSecond.isSelected()){
            length = Double.parseDouble(jtfLength.getText())/1000;
            cores = Math.ceil((length*2.52)/0.503);
            jlAnswer.setText(Double.toString(cores));
        }
        else if(jrbPik2.isSelected()&
                jrb200.isSelected()&
                jrbThird.isSelected()){
            length = Double.parseDouble(jtfLength.getText())/1000;
            cores = Math.ceil((length*1.13)/0.283);
            jlAnswer.setText(Double.toString(cores));
        }

        else if(jrbPik3.isSelected()&
                jrb180.isSelected()&
                jrbFirst.isSelected()){
            length = Double.parseDouble(jtfLength.getText())/1000;
            cores = Math.ceil((length*5.65)/1.131);
            jlAnswer.setText(Double.toString(cores));
        }
        else if(jrbPik3.isSelected()&
                jrb180.isSelected()&
                jrbSecond.isSelected()){
            length = Double.parseDouble(jtfLength.getText())/1000;
            cores = Math.ceil((length*3.93)/0.785);
            jlAnswer.setText(Double.toString(cores));
        }
        else if(jrbPik3.isSelected()&
                jrb180.isSelected()&
                jrbThird.isSelected()){
            length = Double.parseDouble(jtfLength.getText())/1000;
            cores = Math.ceil((length*2.52)/0.503);
            jlAnswer.setText(Double.toString(cores));
        }

        else if(jrbPik3.isSelected()&
                jrb200.isSelected()&
                jrbFirst.isSelected()){
            length = Double.parseDouble(jtfLength.getText())/1000;
            cores = Math.ceil((length*3.14)/0.785);
            jlAnswer.setText(Double.toString(cores));
        }
        else if(jrbPik3.isSelected()&
                jrb200.isSelected()&
                jrbSecond.isSelected()){length = Double.parseDouble(jtfLength.getText())/1000;
            cores = Math.ceil((length*2.10)/0.503);
            jlAnswer.setText(Double.toString(cores));
        }
        else if(jrbPik3.isSelected()&
                jrb200.isSelected()&
                jrbThird.isSelected()){
            length = Double.parseDouble(jtfLength.getText())/1000;
            cores = Math.ceil((length*1.13)/0.283);
            jlAnswer.setText(Double.toString(cores));
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Stern();
            }
        });
    }

}
