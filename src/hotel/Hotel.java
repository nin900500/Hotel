package hotel;

import java.util.Hashtable;

public class Hotel 
{
	
	private String name;
	private String address;
	private String phoneNumber;
	
	public Hotel(String name, String address, String phoneNumber) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
	
	String getName() {
		return this.name;
	}
	
	String getAddress() {
		return this.address;
	}
	
	String getPhoneNumber() {
		return this.phoneNumber;
	}
	
	public static void main(String [] args) {
		System.out.print("Welcome to our hotel");
	}
}
