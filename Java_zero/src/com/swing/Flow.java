package com.swing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public final class Flow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
		
		// frame.setLayout(new FlowLayout(FlowLayout.LEADING));
		
		panel.setPreferredSize(new Dimension(250,250));
		panel.setBackground(Color.cyan);
		panel.setLayout(new FlowLayout());
		
		
		frame.add(new JButton("A"));
		frame.add(new JButton("B"));
		frame.add(new JButton("C"));
		frame.add(new JButton("D"));
		frame.add(new JButton("E"));
		frame.add(new JButton("F"));
		frame.add(new JButton("G"));
		frame.add(new JButton("H"));
		
		panel.add(new JButton("I"));
		panel.add(new JButton("J"));
		panel.add(new JButton("K"));
		panel.add(new JButton("L"));
		panel.add(new JButton("M"));
		
		frame.add(panel);
		
		frame.setVisible(true);
		
	}

}
