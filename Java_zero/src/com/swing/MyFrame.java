package com.swing;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {

	MyFrame()
	{
		this.setTitle("JFrame titile goes to here");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setSize(420, 420); // setting dimensions
		this.setVisible(true);
		ImageIcon image = new ImageIcon("IMG20221010010745.jpg");
		this.setIconImage(image.getImage());
		this.getContentPane().setBackground(new Color (0,0,140));
	}

}
