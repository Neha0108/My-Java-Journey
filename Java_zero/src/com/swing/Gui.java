package com.swing;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Gui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// JFrame = a GUI window to add components to
		
		/*
		JFrame frame = new JFrame();
		frame.setTitle("JFrame titile goes to here");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setSize(420, 420); // setting dimensions
		frame.setVisible(true);
		ImageIcon image = new ImageIcon("IMG20221010010745.jpg");
		frame.setIconImage(image.getImage());
		frame.getContentPane().setBackground(new Color (0,0,140));
		*/
		// frame.getContentPane().setBackground(new Color.GRAY);
		// frame.getContent().setBackground(new Color(0,0,255));
		
		MyFrame myFrame = new MyFrame();
		// new MyFrame();
	}

}
