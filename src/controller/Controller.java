package controller;

import model.Hotel;
import model.HotelRoom;
import view.View;

/**
 * 
 * @author Jimmy Phan
 * @author Byron Voung
 * @author Aadit Dubey
 *
 */
public class Controller {
	
	private Hotel hotel;
	
	public Controller(Hotel hotel) {
		this.hotel = hotel;
	}
	
	public static void reserveRoom(View vw, HotelRoom room) {
		room.reserve(vw);
	}
	
}