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
import java.util.HashMap;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import javax.swing.Spring;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;

import controller.Controller;
import model.Hotel;
import model.HotelRoom;

/**
 * 
 * @author Jimmy Phan
 * @author Byron Voung
 * @author Aadit Dubey
 *
 */
public class View {
	
	private JFrame frame;
	private JTextField hotelName;
	private JTextField address;
	private JTextField phoneNumber;
	
	private HotelRoom selectedRoom;
	private JPanel roomInfo;
	private JLabel priceLabel;
	private JLabel capacityLabel;
	private JLabel roomLabel;
	
	private ArrayList<ArrayList<JButton>> floorToRoomButtons;
	private HashMap<HotelRoom, JButton> roomToRoomButton;
	/**
	 * This displays all the information about the room like price, capacity, the room number and if it is available. 
	 * @param room
	 */
	private void SelectRoom(HotelRoom room) {
		roomInfo.setVisible(true);
		this.selectedRoom = room;
		priceLabel.setText("Price: $" + room.getPrice());
		capacityLabel.setText("Capacity: " + room.getCapacity());
		roomLabel.setText("Room: " + room.getRoomNumber());
	}
	
	private void ReserveRoom() {
		roomInfo.setVisible(false);
		Controller.reserveRoom(this, selectedRoom);
	}
	/**
	 * Updates the availability of the to red if reserved.
	 * @param room
	 */
	public void UpdateRoomAvaibility(HotelRoom room) {
		roomToRoomButton.get(room).setBackground(Color.RED);
	}
	/**
	 * This creates the whole gui for our project 
	 * @param hotel
	 */
	public View(Hotel hotel) 
	{
		
		this.floorToRoomButtons = new ArrayList<ArrayList<JButton>>();
		this.roomToRoomButton = new HashMap<>(){};
		//When running this is the size of the frame 		
		frame = new JFrame();
		frame.setBounds(100, 100, 548, 672);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		//This displays the hotel name on the frame
		hotelName = new JTextField();
		hotelName.setEditable(false);
		hotelName.setHorizontalAlignment(SwingConstants.CENTER);
		hotelName.setFont(new Font("Tahoma", Font.BOLD, 20));
		hotelName.setText(hotel.getName());
		hotelName.setBounds(0, 0, 531, 60);
		frame.getContentPane().add(hotelName);
		hotelName.setColumns(10);
		//This displays the address of the hotel on the frame
		address = new JTextField();
		address.setEditable(false);
		address.setText(hotel.getAddress());
		address.setHorizontalAlignment(SwingConstants.CENTER);
		address.setFont(new Font("Tahoma", Font.PLAIN, 16));
		address.setColumns(10);
		address.setBounds(0, 59, 531, 42);
		frame.getContentPane().add(address);
		//This displays the phone number of the hotel on the frame
		phoneNumber = new JTextField();
		phoneNumber.setEditable(false);
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
		//The floors are button you can click on to change to each floor
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
			//Once clicked on the floor button then the rooms will be displayed
			//the rooms are also button which will then display the information about it.
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
				roomToRoomButton.put(room, roomButton);
				frame.getContentPane().add(roomButton);
				this.floorToRoomButtons.get(savedFloorNum - 1).add(roomButton);
				roomButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (room.available()) {
							SelectRoom(room);
						}
					}	
				});
			}

		}
		/*
		 * Shows the info of the room once the room is clicked on 
		 */
		roomInfo = new JPanel();
		roomInfo.setBounds(0, 465, 275, 168);
		frame.getContentPane().add(roomInfo);
		roomInfo.setLayout(null);
		
		priceLabel = new JLabel("Price: $50");
		priceLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		priceLabel.setBounds(10, 38, 265, 29);
		roomInfo.add(priceLabel);
		
		capacityLabel = new JLabel("Capacity: 4");
		capacityLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		capacityLabel.setBounds(10, 66, 265, 29);
		roomInfo.add(capacityLabel);
		
		//Reserve button to reserve the room 
		JButton reserveButton = new JButton("Reserve");
		reserveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "The room has been sucessfully booked");
			}
		});
		reserveButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		reserveButton.setBounds(10, 118, 255, 39);
		roomInfo.add(reserveButton);
		
		roomLabel = new JLabel("Room: 102");
		roomLabel.setBackground(Color.LIGHT_GRAY);
		roomLabel.setHorizontalAlignment(SwingConstants.CENTER);
		roomLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		roomLabel.setBounds(0, 0, 275, 39);
		roomInfo.add(roomLabel);
		roomInfo.setVisible(false);
		
		reserveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ReserveRoom();
			}	
		});
			

	}
	
}
