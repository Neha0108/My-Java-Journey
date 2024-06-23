package com.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panels {

	public static void main(String[] args) {
		
		// JPanel = a GUI component that function as a container to hold other components
		
		JLabel label = new JLabel();
		label.setText("GOOODDD");
		label.setVerticalAlignment(JLabel.BOTTOM);
		
		JPanel blackpanel = new JPanel();
		blackpanel.setBackground(Color.black);
		blackpanel.setBounds(0,0,250,250);
		
		JPanel cyanpanel = new JPanel();
		cyanpanel.setBackground(Color.cyan);
		cyanpanel.setBounds(0,250,250,250);
		
		JPanel redpanel = new JPanel();
		redpanel.setBackground(Color.red);
		redpanel.setBounds(250,0,250,250);
		redpanel.setLayout(new BorderLayout());
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(750,750);
		frame.setVisible(true);
		redpanel.add(label);
		frame.add(blackpanel);
		frame.add(redpanel);
		frame.add(cyanpanel);

}

}
