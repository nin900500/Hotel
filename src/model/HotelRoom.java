package model;

public class HotelRoom 
{
	private int price, roomCapacity, roomNumber;
	private boolean availibility;
	
	public HotelRoom(int roomNumber, int price) 
	{
		
		this.roomNumber = roomNumber;
		this.price = price;
		this.availibility = true;
	}
	
	public void changeAvailibility(boolean newAvail)
	{
		this.availibility = newAvail;
	}
	
	public void updateCapacity(int roomCapacity)
	{
		this.roomCapacity = roomCapacity;
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
