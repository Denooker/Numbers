package fileComarasion;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class SwingFC implements ActionListener, ItemListener {

    JTextField jtfFirst;
    JTextField jtfSecond;

    JButton jbtnComp;

    JLabel jlabFirst, jlabSecond;

    JLabel jlabResult;

    JCheckBox jcbShowDiff;

    JLabel jlabshw;

    SwingFC (){
        JFrame jfrm = new JFrame("Compare files");

        jfrm.setLayout(new FlowLayout());

        jfrm.setSize(270, 200);

        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jtfFirst = new JTextField(14);
        jtfSecond = new JTextField(14);

        jtfFirst.setActionCommand("FileA");
        jtfSecond.setActionCommand("FileB");

        JButton jbtnComp = new JButton("Compare");

        jcbShowDiff = new JCheckBox("Show position of different");

        jbtnComp.addActionListener(this);
        jcbShowDiff.addItemListener(this);

        jlabFirst = new JLabel("First file: ");
        jlabSecond = new JLabel("Second file: ");
        jlabResult = new JLabel("");
        jlabshw = new JLabel("");

        jfrm.add(jlabFirst);
        jfrm.add(jtfFirst);
        jfrm.add(jlabSecond);
        jfrm.add(jtfSecond);
        jfrm.add(jbtnComp);
        jfrm.add(jlabResult);
        jfrm.add(jcbShowDiff);
        jfrm.add(jlabshw);

        jfrm.setVisible(true);
    }

    int i=0, j=0, c=0;

    public void actionPerformed(ActionEvent ae){

        if(jtfFirst.getText().equals("")){
            jlabResult.setText("First file name missing.");;
            return;
        }
        if(jtfSecond.getText().equals("")){
            jlabResult.setText("Second file name missing.");;
            return;
        }

        try (FileInputStream f1 = new
                FileInputStream(jtfFirst.getText());
             FileInputStream f2 = new
                     FileInputStream(jtfSecond.getText()))
        {
            do {
                i = f1.read();
                j = f2.read();
                c++;
                if(i != j) break;
            } while (i != -1 && j != -1);

            if(i!=j)
                jlabResult.setText("Files are different.");
            else
                jlabResult.setText("Files are the same.");
        } catch (IOException exc){
            jlabResult.setText("File error");
        }
    }

    public void itemStateChanged(ItemEvent ie){
        JCheckBox cb = (JCheckBox) ie.getItem();

        if(cb.isSelected()&(i!=j))
            jlabshw.setText("The difference starts with "+Integer.toString(c)+" characters.");
        else
            jlabshw.setText("Files are the same");
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new SwingFC();
            }
        });
    }
}
