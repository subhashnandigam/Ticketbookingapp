package com.nareshit.ticketbooking;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nareshit.ticketbooking.model.Ticket;
import com.nareshit.ticketbooking.service.TicketService;

@SpringBootApplication
public class TicketBookingApplication implements CommandLineRunner{

	//CommandLineRunner ===>When ever you run/start spring boot application by default it will call run method
	//only once


	@Autowired
	private TicketService ticketService;

	public static void main(String[] args) {
		SpringApplication.run(TicketBookingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Ticket ticketObj=new Ticket();
		ticketObj.setPassengerName("RAMU");
		ticketObj.setSourceStation("HYDERABAD");
		ticketObj.setDestinationStation("DELHI");
		ticketObj.setTravelDate(new Date());
		ticketObj.setEmail("ramu@gmail.com");

		ticketService.createTicket(ticketObj);

	}

}
