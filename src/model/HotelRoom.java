package model;

import view.View;

public class HotelRoom 
{
	private int price, roomNumber, capacity;
	private boolean availibility;
	
	public HotelRoom(int roomNumber, int price, int capacity) 
	{
		
		this.roomNumber = roomNumber;
		this.price = price;
		this.capacity = capacity;
		this.availibility = true;
	}
	
	public void reserve(View view) {
		this.availibility = false;
		view.UpdateRoomAvaibility(this);
	}
	
	public boolean available() {
		return this.availibility;
	}

	public int getCapacity ()
	{
		return this.capacity;
	}
	
	public int getRoomNumber()
	{
		return roomNumber;
	}
	
	public int getPrice()
	{
		return price;
	}

}
