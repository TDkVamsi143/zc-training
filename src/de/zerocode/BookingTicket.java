package de.zerocode;

public class BookingTicket {

	public String findTicketNumber(String data, String start, String end) throws NullPointerException {
		return data.substring(data.indexOf(start) + 2, data.indexOf(end));
	}
}
