package in.ashokit.irctcservice;
import org.springframework.context.annotation.Bean;

import in.ashokit.irctcrequest.Passenger;
import in.ashokit.irctcresponse.Ticket;

public interface TicketService {
	@Bean
	public Ticket bookTicket(Passenger passenger);
	public Ticket getTicket(String TicketNum);
	
	

}
