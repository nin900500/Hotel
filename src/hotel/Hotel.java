package hotel;

public class Hotel {
	
	private String name;
	private String address;
	private String phoneNumber;
	
	public Hotel(String name, String address, String phoneNumber) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
	
	public static void main(String [] args)
	{
		System.out.print("Welcome to our hotel");
	}
}
