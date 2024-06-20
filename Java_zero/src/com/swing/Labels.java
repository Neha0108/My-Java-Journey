package com.swing;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Labels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// JLabel =  a GUI display area for a string of text, an image, or both
		
		ImageIcon image = new ImageIcon("821.jpg");
		Border border = BorderFactory.createLineBorder(Color.green,3);
		
		JLabel label = new JLabel();
		label.setText("hello guyz !!!!"); //  set text for label
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER); // set label position
		label.setVerticalTextPosition(JLabel.TOP);
		label.setForeground(new Color(0x00FF00)); // set font color
		label.setFont(new Font("MV Boli", Font.PLAIN,40)); // set font of text
		label.setIconTextGap(3);
		label.setBackground(Color.black);
		label.setOpaque(true); // display  background color
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.TOP); // set vertical position of icon + text within the label
		label.setHorizontalAlignment(JLabel.CENTER); 
		// set x,y position within frame as well as dimensions
		// label.setBounds(100,100,550,550); 

		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,700); // setting dimensions
		// frame.setLayout(null);
		frame.setVisible(true);
		frame.add(label);
		frame.pack(); // Automatically adjust width and breadth of frame
		
	}

}
