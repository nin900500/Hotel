package test;

import static org.junit.jupiter.api.Assertions.*;

import model.Hotel;

class Test {

	@org.junit.jupiter.api.Test
	void test() {
		String name = "5 Star Hotel";
		String address = "1234 Gray St, San Jose, CA 95155";
		String phoneNumber = "(408) 134 - 5678";
		Hotel hotel = new Hotel(name, address, phoneNumber, 1, 1, 1);
		assertEquals(hotel.getName(), name);
		assertEquals(hotel.getAddress(), address);
		assertEquals(hotel.getPhoneNumber(), phoneNumber);
	}

}