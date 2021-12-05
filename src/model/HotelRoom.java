package model;

import view.View;


/**
 * 
 * @author Jimmy Phan
 * @author Byron Voung
 * @author Aadit Dubey
 *
 */
public class HotelRoom 
{
	private int price, roomNumber, capacity;
	private boolean availibility;
	
	/**
	 * 
	 * @param roomNumber room number
	 * @param price price for room
	 * @param capacity capacity for room
	 */
	public HotelRoom(int roomNumber, int price, int capacity) 
	{
		
		this.roomNumber = roomNumber;
		this.price = price;
		this.capacity = capacity;
		this.availibility = true;
	}
	
	/**
	 * This passes in the view class and checks the availability of the hotel room 
	 * @param view view object
	 */
	public void reserve(View view) {
		this.availibility = false;
		view.UpdateRoomAvaibility(this);
	}
	/**
	 * Gets the availability of the hotel room 
	 * @return if the hotel room is available 
	 */
	public boolean available() {
		return this.availibility;
	}
	
	/**
	 * Gets the capacity for the hotel room
	 * @return the capacity of the hotel room
	 */
	public int getCapacity ()
	{
		return this.capacity;
	}
	
	/**
	 * Gets the room number of the hotel
	 * @return the room number of the hotel 
	 */
	public int getRoomNumber()
	{
		return roomNumber;
	}
	
	/**
	 * Gets the price of the hotel room
	 * @return the price of the hotel room 
	 */
	public int getPrice()
	{
		return price;
	}

}
