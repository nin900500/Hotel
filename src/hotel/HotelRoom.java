package hotel;

public class HotelRoom
{
	
	private int price, roomCapacity, roomNumber;
	private boolean availability;
	private String roomType;
	
	private String [] types = {"Regular", "Suite", "Deluxe Suite"};
	
	public HotelRoom(int roomNumber, int price, int indexForType) 
	{
		this.roomNumber = roomNumber;
		this.price = price; 
		if(indexForType >= 0 && indexForType <= 3)
			roomType = types[indexForType];
		else 
			roomType = types[indexForType&3];
	}
	
	public void changeAvailability(boolean availability)
	{
		this.availability = availability; 
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
	
	public String getRoomType()
	{
		return roomType;
	}

}
