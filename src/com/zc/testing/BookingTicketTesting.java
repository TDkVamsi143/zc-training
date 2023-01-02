package com.zc.testing;

import de.zerocode.BookingTicket;

public class BookingTicketTesting {

	public static void main(String[] args) {
		BookingTicket book = new BookingTicket();
		System.out.println(book
				.findTicketNumber("Dear customer, Your ticket number is : {{HYDTS123456}}. Happy Journey", "{{", "}}"));

	}

}
