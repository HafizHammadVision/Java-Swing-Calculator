//My 1st Mini Project (Calculator)

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorApp {
    public static void main (String args[]){
        JFrame frame=new JFrame("My First Mini Project (Simple Calculator)");
        frame.setLayout(new GridLayout(5,2,10,10));

        JLabel l1= new JLabel("Enter first number : ");
        JLabel l2=new JLabel("Enter second number : ");
        JLabel result=new JLabel("Result : ");

        JTextField t1=new JTextField();
        JTextField t2=new JTextField();

        JButton b1=new JButton("Addition");
        JButton b2=new JButton("Subtraction");
        JButton b3=new JButton("Multiplication");
        JButton b4=new JButton("Division");

        b1.addActionListener( e -> {
            try {
                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());
                int sum = num1 + num2;
                result.setText(" Result : " + sum);
            }
            catch (Exception ex){
                result.setText("Please enter valid numbers");
            }
        });

        b2.addActionListener( e -> {
            try {
                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());
                int sub = num1 - num2;
                result.setText(" Result : " + sub);
            }
            catch (Exception ex){
                result.setText("Please enter valid numbers");
            }
        });

        b3.addActionListener( e -> {
            try {
                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());
                int mult = num1 * num2;
                result.setText(" Result : " + mult);
            }
            catch (Exception ex){
                result.setText("Please enter valid numbers");
            }
        });

        b4.addActionListener( e -> {
            try {
                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());
                if (num2 == 0) {
                    result.setText("Cannot divide by zero");
                } else {
                    int div = num1 / num2;
                    result.setText("Result : " + div);
                }
            }
            catch (Exception ex){
                result.setText("Please enter valid numbers");
            }
        });

        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(l1);
        frame.add(t1);

        frame.add(l2);
        frame.add(t2);

        frame.add(b1);
        frame.add(b2);

        frame.add(b3);
        frame.add(b4);

        frame.add(result);
    }
}
