package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JLabel;
import java.awt.Color;

public class Swing {

	private JFrame frame;
	private JTextField hotelName;
	private JTextField address;
	private JTextField phoneNumber;
	private JButton floor1_2;
	private JPanel roomInfo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Swing window = new Swing();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Swing() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 548, 672);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		hotelName = new JTextField();
		hotelName.setEditable(false);
		hotelName.setHorizontalAlignment(SwingConstants.CENTER);
		hotelName.setFont(new Font("Tahoma", Font.BOLD, 20));
		hotelName.setText("HOTEL NAME");
		hotelName.setBounds(0, 0, 531, 60);
		frame.getContentPane().add(hotelName);
		hotelName.setColumns(10);
		
		address = new JTextField();
		address.setEditable(false);
		address.setText("ADDRESS");
		address.setHorizontalAlignment(SwingConstants.CENTER);
		address.setFont(new Font("Tahoma", Font.PLAIN, 16));
		address.setColumns(10);
		address.setBounds(0, 59, 531, 42);
		frame.getContentPane().add(address);
		
		phoneNumber = new JTextField();
		phoneNumber.setEditable(false);
		phoneNumber.setText("ADDRESS");
		phoneNumber.setHorizontalAlignment(SwingConstants.CENTER);
		phoneNumber.setFont(new Font("Tahoma", Font.PLAIN, 12));
		phoneNumber.setColumns(10);
		phoneNumber.setBounds(0, 99, 531, 32);
		frame.getContentPane().add(phoneNumber);
		
		JButton floor1 = new JButton("Floor 1");
		floor1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		floor1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		floor1.setBounds(0, 129, 319, 32);
		frame.getContentPane().add(floor1);
		
		JButton floor1_1 = new JButton("Floor 1");
		floor1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		floor1_1.setBounds(0, 160, 319, 32);
		frame.getContentPane().add(floor1_1);
		
		JButton floor1_1_1 = new JButton("Floor 1");
		floor1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		floor1_1_1.setBounds(0, 191, 319, 32);
		frame.getContentPane().add(floor1_1_1);
		
		floor1_2 = new JButton("Floor 1");
		floor1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		floor1_2.setBounds(318, 129, 214, 32);
		frame.getContentPane().add(floor1_2);
		
		roomInfo = new JPanel();
		roomInfo.setBounds(0, 465, 275, 168);
		frame.getContentPane().add(roomInfo);
		roomInfo.setLayout(null);
		
		JLabel priceLabel = new JLabel("Price: $50");
		priceLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		priceLabel.setBounds(10, 38, 265, 29);
		roomInfo.add(priceLabel);
		
		JLabel capacityLabel = new JLabel("Capacity: 4");
		capacityLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		capacityLabel.setBounds(10, 66, 265, 29);
		roomInfo.add(capacityLabel);
		
		JButton reserveButton = new JButton("Reserve");
		
		reserveButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		reserveButton.setBounds(10, 118, 255, 39);
		roomInfo.add(reserveButton);
		
		JLabel roomLabel = new JLabel("Room: 102");
		roomLabel.setBackground(Color.LIGHT_GRAY);
		roomLabel.setHorizontalAlignment(SwingConstants.CENTER);
		roomLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		roomLabel.setBounds(0, 0, 275, 39);
		roomInfo.add(roomLabel);
	}
}
