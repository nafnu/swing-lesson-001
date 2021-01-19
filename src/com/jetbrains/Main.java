
package com.jetbrains;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                JFrame frame = new JFrame("Hello World");

                frame.setSize(600,500);

                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                frame.setVisible(true);
            }
        });
    }
}
