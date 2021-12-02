package model;

import java.util.ArrayList;

import view.View;

public class Hotel 
{
	
	private String name;
	private String address;
	private String phoneNumber;
	private ArrayList<ArrayList<HotelRoom>> floorsToRooms = new ArrayList<ArrayList<HotelRoom>>();
	
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
				floorsToRooms.get(floor - 1).add(new HotelRoom(roomNumber, pricePerRoom));
			}
		}
		//view
		View view = new View(this);
	}
	
	public ArrayList<ArrayList<HotelRoom>> getFloorToRooms() {
		return this.floorsToRooms;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	
	public static void main(String [] args) {
		Hotel motel = new Hotel("5 Star Motel", "1234 Kings St, San Diego, CA, 92137", "(525) 231 - 1387", 5, 16, 100);
	}
}
