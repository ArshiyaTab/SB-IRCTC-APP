package in.ashokit.irctcrest;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.irctcrequest.Passenger;
import in.ashokit.irctcresponse.Ticket;
import in.ashokit.irctcservice.TicketService;
import io.swagger.annotations.Api;

@RestController
@RequestMapping("/bookTicketApplication")
@Api(value = "bookTicketApplication" , tags= "Ticket")


public class TicketRestController {
	
	
	


	@Autowired
    private TicketService service;
	
	@PostMapping(value="/ticket",consumes={"application/json"},produces= {"application/json"})
	public ResponseEntity<Ticket>bookTicket(Passenger passenger){
		Ticket ticket=service.bookTicket(passenger);
		return new ResponseEntity<>(ticket,HttpStatus.CREATED);
	}



	@GetMapping(value="/ticket /{ticketNumber}",produces= {"application/json"})
	public ResponseEntity<Ticket>getTicket(@PathVariable("ticketNumber") String ticketNum){
		Ticket ticket=service.getTicket(ticketNum);
		return new ResponseEntity<>(ticket,HttpStatus.OK);
		
		

	}
	}


		
		
	


