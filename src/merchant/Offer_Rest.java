package merchant;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import java.util.*;

@Path("/")
public class Offer_Rest {

	@GET @Path("/offer")@Produces(MediaType.APPLICATION_JSON)
	public String getOffer() {
		List<String> l = Parser.readFileInList();
		String str = "";
		String pattern = "Offer on: %s, Price: %s, Expires: %s";
		for(int i = 0;i<l.size();i++) {
			String[] split = l.get(i).split(" ");
			str += String.format(pattern,  split[0], split[1], split[2] )+"\n";	
		}
		return str;
	}
	
	
	
	@PUT @Path("/offer")@Produces(MediaType.APPLICATION_JSON)
	public String update(@QueryParam("OfferOn") 	String item, 
							  @QueryParam("Price")	int price, 
							  @QueryParam("Expires")Date expiry) {
		Offer.item   = item;
		Offer.price   = price;
		Offer.expiry = expiry;
		String pattern = "\"Offer on\":\"%s\", \"Price\":\"%s\", \"Expires\": \"%s\"";
		return String.format(pattern,  Offer.item, Offer.price, Offer.expiry );
	
	}
	
	@GET @Path("/Offer/OfferOn")@Produces(MediaType.TEXT_PLAIN)
	public String getItem() {return Offer.item;}
	
	@GET @Path("/offer/price")@Produces(MediaType.TEXT_PLAIN)
	public int getPrice() {return Offer.price;}
	
	@GET @Path("/offer/expiry")@Produces(MediaType.TEXT_PLAIN)
	public Date getExpiry() {return Offer.expiry;}
	
	
	
}
