package com.eldar.gui;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Gui {

	public static void main(String[] args) {
		JFrame fr = new JFrame("My Application");
		fr.setBounds(100, 100, 600, 400);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setLayout(null);

		// subject
		JButton bt = new JButton("click");
		// observable
		ActionListener listener = new MyButtonActionListener();
		// registration 1
		bt.addActionListener(listener);
		// registration 2 - lambda
		bt.addActionListener(e -> {
			int r = (int) (Math.random() * 256);
			int g = (int) (Math.random() * 256);
			int b = (int) (Math.random() * 256);
			Color color = new Color(r, g, b);
			fr.getContentPane().setBackground(color);
		});

		bt.setBounds(50, 50, 125, 25);
		fr.add(bt);

		fr.setVisible(true);
	}

}
