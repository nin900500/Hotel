package view;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import javax.swing.Spring;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;

import model.Hotel;
import model.HotelRoom;

public class View {
	
	private JFrame frame;
	private JTextField hotelName;
	private JTextField address;
	private JTextField phoneNumber;
	
	private ArrayList<ArrayList<JButton>> floorToRoomButtons;
	
	public View(Hotel hotel) {
		
		this.floorToRoomButtons = new ArrayList<ArrayList<JButton>>();
				
		frame = new JFrame();
		frame.setBounds(100, 100, 548, 672);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		hotelName = new JTextField();
		hotelName.setHorizontalAlignment(SwingConstants.CENTER);
		hotelName.setFont(new Font("Tahoma", Font.BOLD, 20));
		hotelName.setText(hotel.getName());
		hotelName.setBounds(0, 0, 531, 60);
		frame.getContentPane().add(hotelName);
		hotelName.setColumns(10);
		
		address = new JTextField();
		address.setText(hotel.getAddress());
		address.setHorizontalAlignment(SwingConstants.CENTER);
		address.setFont(new Font("Tahoma", Font.PLAIN, 16));
		address.setColumns(10);
		address.setBounds(0, 59, 531, 42);
		frame.getContentPane().add(address);
		
		phoneNumber = new JTextField();
		phoneNumber.setText(hotel.getPhoneNumber());
		phoneNumber.setHorizontalAlignment(SwingConstants.CENTER);
		phoneNumber.setFont(new Font("Tahoma", Font.PLAIN, 12));
		phoneNumber.setColumns(10);
		phoneNumber.setBounds(0, 99, 531, 32);
		frame.getContentPane().add(phoneNumber);
		
		frame.addComponentListener(new ComponentAdapter(){
            public void componentResized(ComponentEvent e){
            	
            }
        });
		
		ArrayList<ArrayList<JButton>> savedFloorToRooms = this.floorToRoomButtons;
		
		int floorNum = 0;
		for (ArrayList<HotelRoom> rooms : hotel.getFloorToRooms()) {
			floorNum = floorNum + 1;
			int savedFloorNum = floorNum;
			JButton floorButton = new JButton("Floor " + floorNum);
			floorButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
			floorButton.setBounds(0, 129 + (31 * (floorNum - 1)), 319, 32);
			floorButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					for (ArrayList<JButton> roomButtons : savedFloorToRooms) {
						for (JButton roomButton : roomButtons) {
							roomButton.setVisible(false);
						}
					}
					for (JButton roomButton : savedFloorToRooms.get(savedFloorNum - 1)) {
						roomButton.setVisible(true);
					}
				}
			});
			frame.getContentPane().add(floorButton);
			int roomInc = 0;
			this.floorToRoomButtons.add(new ArrayList<JButton>());
			for (HotelRoom room : rooms) {
				roomInc = roomInc + 1;
				JButton roomButton = new JButton("Room: " + room.getRoomNumber());
				roomButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
				roomButton.setBounds(318, 129 + (31 * (roomInc - 1)), 214, 32);
				roomButton.setVisible(false);
				roomButton.setBackground(room.available() == true ? Color.GREEN : Color.RED);
				frame.getContentPane().add(roomButton);
				this.floorToRoomButtons.get(savedFloorNum - 1).add(roomButton);
			}

		}
		
		
		frame.setVisible(true);

	}
	
}
