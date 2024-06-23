package com.swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameButton extends JFrame implements ActionListener{

	JButton button;
	JLabel label;
	
		FrameButton()
		{
			ImageIcon icon = new ImageIcon("12008-thumbs-up-icon.png");
			ImageIcon icon2 = new ImageIcon("12008-thumbs-up-icon.png");
			
			label = new JLabel();
			label.setIcon(icon2);
			label.setBounds(150,250,150,150);
			label.setVisible(false);
			
		    button = new JButton();
			button.setBounds(0,0,220,220);
			button.addActionListener(this);
			button.setText("Button"); //  add text on button
			button.setFocusable(false); // erase border around text in button
			button.setIcon(icon);
			button.setHorizontalTextPosition(JButton.CENTER);
			button.setVerticalTextPosition(JButton.BOTTOM);
			button.setFont(new Font("Comic Sans",Font.BOLD,25));
			button.setForeground(Color.cyan);
			button.setBackground(Color.BLUE);
			button.setBorder(BorderFactory.createEtchedBorder());
			
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setLayout(null);
			this.setResizable(false);
			this.setSize(500, 500); 
			this.setVisible(true);
			this.add(button);
			this.add(label);
		}
		
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()==button)
			{
				//System.out.println("click");
				// button.setEnabled(false);
				label.setVisible(true);
			}
		}
	}

