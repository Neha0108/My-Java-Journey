package com.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.LayoutManager;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Border{

	public static void main(String[] args) {
		
		// Layout Manager = Defines the natural layout  for components within a container
		
		// 3 common managers
		// border layout = places components in five areas: North, South, West, East, Center
		//  			   all extra space is placed in the center area
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600,600);
		frame.setLayout(new BorderLayout(10,10));
		frame.setVisible(true);
	
		
		JPanel pan1 = new JPanel();
		JPanel pan2 = new JPanel();
		JPanel pan3 = new JPanel();
		JPanel pan4 = new JPanel();
		JPanel pan5 = new JPanel();
		
		pan1.setBackground(Color.yellow);
		pan2.setBackground(Color.BLUE);
		pan3.setBackground(Color.red);
		pan4.setBackground(Color.green);
		pan5.setBackground(Color.cyan);
	
		pan1.setPreferredSize(new Dimension(100,100));
		pan2.setPreferredSize(new Dimension(100,100));
		pan3.setPreferredSize(new Dimension(100,100));
		pan4.setPreferredSize(new Dimension(100,100));
		pan5.setPreferredSize(new Dimension(100,100));
		
		frame.add(pan1,BorderLayout.NORTH);
		frame.add(pan2,BorderLayout.SOUTH);
		frame.add(pan3,BorderLayout.EAST);
		frame.add(pan4,BorderLayout.WEST);
		frame.add(pan5,BorderLayout.CENTER);
		
		
	}

}
