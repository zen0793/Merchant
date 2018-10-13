package merchant;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

@Path("/")
public class Offer_Rest {

	/* A class which initiates the Parser to get the required details of the
	 * offers. If the offer is expired then it is indicated. 
	 *  
	*/
	@GET @Path("/offer")@Produces(MediaType.APPLICATION_JSON)
	public String getOffer() throws ParseException {
		
		List<String> l = Parser.readFileInList();
		String str = "";
		String pattern = "Offer on: %s, Price: %s, Expires: %s";
		String pattern_expired = "Sorry, item %s expired on %s and is no longer on offer.";
		LocalDate today = java.time.LocalDate.now();
		
		//Loops over the items and checks expiration date to indicate if offer has expired
		for(int i = 0;i<l.size();i++) {
			
			String[] split = l.get(i).split(" ");
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
			String date = split[2];
			LocalDate localDate = LocalDate.parse(date, formatter);
			//Add offer to class
			new Offer(split[0],split[1],localDate);
			if(today.isAfter(localDate)) {
				str += String.format(pattern_expired,  split[0], split[2] )+"\n";
			}
			else {
				str += String.format(pattern,  split[0], split[1], split[2] )+"\n";	
			}
				
		}
		return str;
	}
	
}
