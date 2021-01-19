package com.jetbrains;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    private JTextArea textArea;
    private JButton btn,btn2;

    public MainFrame(){
        //we move all the methods from Main to here

        super( "Border Layout Demonstration");

        setSize(600,500);

        setLayout(new BorderLayout());

        textArea = new JTextArea("This is sentence One.");

        btn = new JButton("Click ME ** REPEAT **");
        btn2 = new JButton("Click ME ** CLEAR **");

        btn.addActionListener(

                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        textArea.append("This is sentence Two.");

                    }
                }
        );

        btn2.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        textArea.setText(null); //clean text
                    }
                }

        );

        add(textArea,BorderLayout.WEST); //depend coordinates to position

        textArea.append("This is sentence Two.");



        add(btn,BorderLayout.SOUTH);
        add(btn2,BorderLayout.EAST);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
    }



}
