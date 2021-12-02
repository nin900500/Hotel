package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import model.Hotel;

public class View {

	public View(Hotel hotel) {
		
		JFrame baseFrame = new JFrame();
		baseFrame.setTitle("Hotel App");
		baseFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		baseFrame.setSize(1000, 1000);
		baseFrame.setVisible(true);	
				
		Box box = Box.createVerticalBox();
		box.setBackground(Color.GRAY);
		box.setOpaque(true);
		baseFrame.add(box, BorderLayout.NORTH);
		
		//JPanel basePanel = new JPanel();
		//basePanel.setBackground(Color.GRAY);
		//box.setOpaque(true);
		//baseFrame.add(basePanel, BorderLayout.NORTH);

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
		
		box.add(hotelName);
		box.add(address);
		box.add(number);
		
		JButton button = new JButton();
		button.setBounds(0, 0, 0, 0);
		button.setFocusable(false);
		
		//basePanel.add(button);
		//setupFrame(hotel);
	}
	
}
