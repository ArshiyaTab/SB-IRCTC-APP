package in.ashokit.irctcservice;

import java.util.HashMap;

import java.util.Map;
import java.util.Random;
import java.util.UUID;

import org.springframework.stereotype.Service;

import in.ashokit.irctcrequest.Passenger;
import in.ashokit.irctcresponse.Ticket;

@Service
public abstract class TicketServiceImpl implements TicketService {



	private static final String TicketNum = null;
	private Map<String, Ticket> ticketsMap = new HashMap<>();

	@Override
	public Ticket bookTicket(Passenger passenger) {
		
		// logic to book the ticket

		// generating random ticket id
		String ticketNum = UUID.randomUUID().toString().replace("-", "-");

		Ticket tinfo = new Ticket();
		tinfo.setTicketStatus(TicketNum);
		tinfo.setTicketStatus("CONFIRMED");
		tinfo.setPrice(450.00);
		tinfo.setFrom(passenger.getFrom());
		tinfo.setTo(passenger.getTo());
		tinfo.setName(passenger.getName());
		tinfo.setName(passenger.getJdate());
		tinfo.setTrainNum(passenger.getTrainNum());

		ticketsMap.put(ticketNum, tinfo);

		return tinfo;
	}
	Random random = new Random();
	
	 
	

	@Override
	public Ticket getTicket(String ticketNum) {
		if (ticketsMap.containsKey(ticketNum)) {
			return ticketsMap.get(ticketNum);
		}
		return null;
	}
}
