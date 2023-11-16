package org.example;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class ButtonPanel extends JPanel {
    public ButtonPanel(){
        GridLayout gl = new GridLayout(2,2);
        setLayout(gl);
        JButton but1=new JButton("Press me");
        JButton but2=new JButton("Press me 2");
        JButton but3=new JButton("Press me 3");
        ActionListener but1AL = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button 1 pressed");
            }
        };


        but1.addActionListener(but1AL);
        but2.addActionListener(but1AL);
        but3.addActionListener(but1AL);
        add(but1);
        add(but2);
        add(but3);

    }

}
