package view;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Spring;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;

import model.Hotel;

public class View {
	
	 private static void setPercentage(SpringLayout.Constraints c, Spring pw, Spring ph, float sx, float sy, float sw, float sh) {
		 c.setX(Spring.scale(pw, sx));
		 c.setY(Spring.scale(ph, sy));
		 c.setWidth(Spring.scale(pw,  sw));
		 c.setHeight(Spring.scale(ph, sh));
	 }


	public View(Hotel hotel) {
		
		JFrame baseFrame = new JFrame();
		baseFrame.setTitle("Hotel App");
		baseFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		baseFrame.setSize(1000, 1000);
		baseFrame.setLayout(new GridBagLayout());
		baseFrame.getContentPane().setBackground(Color.GREEN);
				
		//Box box = Box.createVerticalBox();
		//box.setBackground(Color.GRAY);
		//box.setOpaque(true);
		//baseFrame.add(box, BorderLayout.CENTER);
		
        GridBagConstraints cns = new GridBagConstraints(); //creating constraint
		
		JPanel basePanel = new JPanel();
		basePanel.setBackground(Color.GRAY);
		//cns.gridx = 0;
		//cns.gridy = 0;
	    cns.weighty = 1;
        cns.anchor = GridBagConstraints.FIRST_LINE_START;;
		baseFrame.add(basePanel, cns);
		
		JLabel hotelName = new JLabel(hotel.getName());
		hotelName.setFont(new Font("Serif", Font.BOLD, 50));
		hotelName.setForeground(Color.WHITE);
		
		JLabel address = new JLabel(hotel.getAddress());
		address.setFont(new Font("Serif", Font.PLAIN, 45));
		address.setForeground(Color.WHITE);
		address.setAlignmentY(100);
		
		JLabel number = new JLabel(hotel.getPhoneNumber());
		number.setFont(new Font("Serif", Font.PLAIN, 35));
		number.setForeground(Color.WHITE);
		number.setAlignmentY(100);
		
		basePanel.add(hotelName);
		basePanel.add(address);
		basePanel.add(number);
		
		JPanel floorsPanel = new JPanel(new GridLayout(3, 0));
		floorsPanel.setBackground(Color.BLUE);
		//box.setOpaque(true);
		baseFrame.add(floorsPanel);
		
		JButton button = new JButton();
		button.setPreferredSize(new Dimension(1, 1));
		button.setFocusable(false);
		
		//baseFrame.add(button);
		
		JButton button2 = new JButton();
		button2.setPreferredSize(new Dimension(1, 1));
		button2.setFocusable(false);
		
		//baseFrame.add(button2);
		//setupFrame(hotel);
		baseFrame.setVisible(true);	

	}
	
}
