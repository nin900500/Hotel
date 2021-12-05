package model;

import java.util.ArrayList;
import java.util.Random;

import view.View;

/**
 * 
 * @author Jimmy Phan
 * @author Byron Voung
 * @author Aadit Dubey
 *
 */
public class Hotel 
{
	
	private String name;
	private String address;
	private String phoneNumber;
	private ArrayList<ArrayList<HotelRoom>> floorsToRooms = new ArrayList<ArrayList<HotelRoom>>();
	
	
    /**
     * The information of everything about the hotel that is taken in and generates the floors for the hotel. 
     * @param name
     * @param address
     * @param phoneNumber
     * @param floors
     * @param roomsPerFloor
     * @param pricePerRoom
     */
	public Hotel(String name, String address, String phoneNumber, int floors, int roomsPerFloor, int pricePerRoom) {
		//information
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		//populate hotel
		for (int floor = 1; floor <= floors; floor++) {
			floorsToRooms.add(new ArrayList<HotelRoom>());
			for (int room = 1; room <= roomsPerFloor; room++) {
				int roomNumber = (floor * 100) + (room);
				floorsToRooms.get(floor - 1).add(new HotelRoom(roomNumber, new Random().nextInt(200 - 100 + 1) + 100, new Random().nextInt(6 - 2 + 1) + 2));
			}
		}
		//view
		View view = new View(this);
	}
	
	/**
	 * An arraylist to get the rooms to each floor 
	 * @return
	 */
	
	public ArrayList<ArrayList<HotelRoom>> getFloorToRooms() {
		return this.floorsToRooms;
	}
	
	/**
	 * Gets the name of the hotel 
	 * @return the name of the hotel
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Gets the address of the hotel
	 * @return the address of the hotel 
	 */
	public String getAddress() {
		return this.address;
	}
	/**
	 * Gets the phone number of the hotel 
	 * @return the phone number of the hotel 
	 */
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String [] args) {
		Hotel motel = new Hotel("5 Star Motel", "1234 Kings St, San Diego, CA, 92137", "(525) 231 - 1387", 5, 16, 100);
	}
}
