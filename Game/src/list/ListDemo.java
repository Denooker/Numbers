package list;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class ListDemo implements ListSelectionListener {

    JList<String> jlst;
    JLabel jlab;
    JScrollPane jscrlp;

    String names[] = {"Name1", "Name2", "Name3", "Name4", "Name5", "Name6", "Name7", "Name8", "Name9", "Name10"};

    ListDemo(){
        JFrame jfrm = new JFrame("List demonstration");

        jfrm.setLayout(new FlowLayout());

        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jfrm.setSize(200,160);

        jlst = new JList<>(names);

        jlst.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        jscrlp = new JScrollPane(jlst);

        jscrlp.setPreferredSize(new Dimension(150,120));

        jlab = new JLabel("Select name");

        jlst.addListSelectionListener(this);

        jfrm.add(jscrlp);
        jfrm.add(jlab);

        jfrm.setVisible(true);
    }

    public void valueChanged(ListSelectionEvent le){
        int idx = jlst.getSelectedIndex();

        if(idx != -1)
            jlab.setText("Current selection: " + names[idx]);
        else
            jlab.setText("Select name");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ListDemo();
            }
        });
    }
}
