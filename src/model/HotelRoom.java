package model;

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
	
	public boolean available() {
		return this.availibility;
	}

	public void changeAvailibility(boolean newAvail)
	{
		this.availibility = newAvail;
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
