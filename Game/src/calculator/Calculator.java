package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {

    JLabel history;
    JLabel answ;

    JButton seven, eight, nine, plus, division;
    JButton four, five, six, minus, multiplication;
    JButton one, two, three, sin, radical;
    JButton clear, zero, comma, answer, degree;

    Calculator (){
        JFrame jfrm = new JFrame("Calculator");
        jfrm.setLayout(new GridLayout(5,7,3,3));
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setSize(700,500);

        history = new JLabel("history here");
        answ = new JLabel("0");

        seven = new JButton("7");
        eight = new JButton("8");
        nine = new JButton("9");
        plus = new JButton("+");
        division = new JButton("/");

        seven.addActionListener(this);
        eight.addActionListener(this);
        nine.addActionListener(this);
        plus.addActionListener(this);
        division.addActionListener(this);

        four = new JButton("4");
        five = new JButton("5");
        six = new JButton("6");
        minus = new JButton("-");
        multiplication = new JButton("x");

        four.addActionListener(this);
        five.addActionListener(this);
        six.addActionListener(this);
        minus.addActionListener(this);
        multiplication.addActionListener(this);

        one = new JButton("1");
        two = new JButton("2");
        three = new JButton("3");
        sin = new JButton("sin");
        radical = new JButton("<html>&#8730;</html>");

        one.addActionListener(this);
        two.addActionListener(this);
        three.addActionListener(this);
        sin.addActionListener(this);
        radical.addActionListener(this);

        clear = new JButton("C");
        zero = new JButton("0");
        comma = new JButton(",");
        answer = new JButton("=");
        degree = new JButton("<html>x<sup>y</sup></html>");

        clear.addActionListener(this);
        zero.addActionListener(this);
        comma.addActionListener(this);
        answer.addActionListener(this);
        degree.addActionListener(this);

        jfrm.add(seven);
        jfrm.add(eight);
        jfrm.add(nine);
        jfrm.add(plus);
        jfrm.add(division);

        jfrm.add(four);
        jfrm.add(five);
        jfrm.add(six);
        jfrm.add(minus);
        jfrm.add(multiplication);

        jfrm.add(one);
        jfrm.add(two);
        jfrm.add(three);
        jfrm.add(sin);
        jfrm.add(radical);

        jfrm.add(clear);
        jfrm.add(zero);
        jfrm.add(comma);
        jfrm.add(answer);
        jfrm.add(degree);

        jfrm.add(history);
        jfrm.add(answ);

        jfrm.setVisible(true);
    }

    String st = "";
    double firstNumber = 0.0, secondNumber = 0.0, ravno = 0.0;
    char operation = ' ';
    String mod = "";

    public void actionPerformed(ActionEvent ae){

        switch(ae.getActionCommand()) {
            case "C":
                mod = "";
                st = "";
                history.setText(st);
                answ.setText(mod);
                break;

            case "7":
                mod += "7";
                st += "7";
                history.setText(st);
                break;

            case "8":
                mod += "8";
                st += "8";
                history.setText(st);
                break;

            case "9":
                mod += "9";
                st += "9";
                history.setText(st);
                break;

            case "4":
                mod += "4";
                st += "4";
                history.setText(st);
                break;

            case "5":
                mod += "5";
                st += "5";
                history.setText(st);
                break;

            case "6":
                mod += "6";
                st += "6";
                history.setText(st);
                break;

            case "1":
                mod += "1";
                st += "1";
                history.setText(st);
                break;

            case "2":
                mod += "2";
                st += "2";
                history.setText(st);
                break;

            case "3":
                mod += "3";
                st += "3";
                history.setText(st);
                break;

            case "0":
                mod += "0";
                st += "0";
                history.setText(st);
                break;

            case ",":
                mod += ".";
                st += ".";
                history.setText(st);
                break;

            case "+":
                firstNumber = Double.parseDouble(mod);
                mod = "";
                st += " + ";
                history.setText(st);
                operation = '+';
                break;

            case "-":
                firstNumber = Double.parseDouble(mod);
                mod = "";
                st += " - ";
                history.setText(st);
                operation = '-';
                break;

            case "/":
                firstNumber = Double.parseDouble(mod);
                mod = "";
                st += " / ";
                history.setText(st);
                operation = '/';
                break;

            case "x":
                firstNumber = Double.parseDouble(mod);
                mod = "";
                st += " x ";
                history.setText(st);
                operation = 'x';
                break;

            case "<html>&#8730;</html>":
                firstNumber = Double.parseDouble(mod);
                mod = "";
                st += " под корнем ";
                history.setText(st);
                operation = 'r';
                break;

            case "sin":
                firstNumber = Double.parseDouble(mod);
                mod = "";
                st += " синус ";
                history.setText(st);
                operation = 's';
                break;

            case "<html>x<sup>y</sup></html>":
                firstNumber = Double.parseDouble(mod);
                mod = "";
                st += " в степени ";
                history.setText(st);
                operation = '^';
                break;

            case "=":
                if(!mod.equals(""))
                secondNumber = Double.parseDouble(mod);

                mod = "";
                switch (operation){
                    case '+':
                        ravno = firstNumber + secondNumber;
                        break;
                    case '/':
                        ravno = firstNumber / secondNumber;
                        break;
                    case '-':
                        ravno = firstNumber - secondNumber;
                        break;
                    case 'x':
                        ravno = firstNumber * secondNumber;
                        break;
                    case '^':
                        ravno = Math.pow(firstNumber,secondNumber);
                        break;
                    case 'r':
                        ravno = Math.sqrt(firstNumber);
                        break;
                    case 's':
                        ravno = Math.sin(Math.toRadians(firstNumber));
                        break;
                }
                st += " = ";
                st += ravno;
                history.setText(st);
                answ.setText(Double.toString(ravno));
                st = "";
                break;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Calculator();
            }
        });
    }

}
