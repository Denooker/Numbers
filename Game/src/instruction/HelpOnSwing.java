package instruction;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class HelpOnSwing implements ListSelectionListener {

    JList<String> instructions;
    JLabel bodyOfInstruction;
    JScrollPane jscr;

    String[] names = {"1. if", "2. switch", "3. for", "4. while", "5. do-while", "6. break", "7. continue"};

    HelpOnSwing(){
        JFrame jfrm = new JFrame("Java Instruction");
        jfrm.setLayout(new FlowLayout());
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setSize(250,300);

        instructions = new JList<>(names);
        instructions.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        jscr = new JScrollPane(instructions);
        jscr.setPreferredSize(new Dimension(150,100));

        bodyOfInstruction = new JLabel("Place for instruction");

        instructions.addListSelectionListener(this);

        jfrm.add(jscr);
        jfrm.add(bodyOfInstruction);

        jfrm.setVisible(true);
    }

    public void valueChanged(ListSelectionEvent lse){
        int idx = instructions.getSelectedIndex();

        switch (idx){
            case 0:
                bodyOfInstruction.setText("<html>Инструкция if:<br>if(условие) инструкция;<br>else инструкция;</html>");
                break;
            case 1:
                bodyOfInstruction.setText("<html>Инструкция switch:<br>switch(выражение) {<br> case константа:<br>  последовательность инструкций<br>  break;<br> // ...<br>}</html>");
                break;
            case 2:
                bodyOfInstruction.setText("<html>Цикл for:<br>for(инициализация; условие; итерация)<br> инструкция;</html>");
                break;
            case 3:
                bodyOfInstruction.setText("<html>Цикл while:<br>while(условие) инструкция;</html>");
                break;
            case 4:
                bodyOfInstruction.setText("<html>Цикл do-while:<br>do {<br> инструкция;<br>} while(условие);</html>");
                break;
            case 5:
                bodyOfInstruction.setText("<html>Инструкция break:<br>break; или break метка</html>");
                break;
            case 6:
                bodyOfInstruction.setText("<html>Инструкция continue:<br>continue; или continue метка;</html>");
                break;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new HelpOnSwing();
            }
        });
    }
}
