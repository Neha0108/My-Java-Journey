package com.swing;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Grid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame frame = new JFrame();
		JButton button = new JButton();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		// frame.setLayout(new GridLayout(3,4));
		frame.setLayout(new GridLayout(3,4,3,3));

		frame.add(new JButton("A"));
		frame.add(new JButton("B"));
		frame.add(new JButton("C"));
		frame.add(new JButton("D"));
		frame.add(new JButton("E"));
		frame.add(new JButton("F"));
		frame.add(new JButton("G"));
		frame.add(new JButton("H"));
		
		frame.setVisible(true);
	}

}
