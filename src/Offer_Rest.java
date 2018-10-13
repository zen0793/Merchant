import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import java.util.*;

@ApplicationPath("/")
public class Offer_Rest {

	@GET @Path("/offer")@Produces(MediaType.APPLICATION_JSON)
	public String getOffer() {
		String pattern = "{ \"Offer on\":\"%s\", \"Price\":\"%s\", \"Expires\": \"%s\"}";
		return String.format(pattern,  Offer.item, Offer.price, Offer.expiry );	
	}
	
	
	
	@PUT @Path("/offer")@Produces(MediaType.APPLICATION_JSON)
	public String update(@QueryParam("Offer on") 	String item, 
							  @QueryParam("Price")	int price, 
							  @QueryParam("Expires")Date expiry) {
		Offer.item   = item;
		Offer.price   = price;
		Offer.expiry = expiry;
		String pattern = "{ \"Offer on\":\"%s\", \"Price\":\"%s\", \"Expires\": \"%s\"}";
		return String.format(pattern,  Offer.item, Offer.price, Offer.expiry );
	
	}
	
	

	@POST @Path("/offer/Offer on")@Produces(MediaType.TEXT_PLAIN)
	public String increaseWins() {	return Offer.item; }
	
	@POST @Path("/score/price")@Produces(MediaType.TEXT_PLAIN)	
	public int increaseTies() {	return Offer.price;}
	
	@POST @Path("/score/expiry")@Produces(MediaType.TEXT_PLAIN)		
	public Date increaseLosses() {return Offer.expiry;}
	
	@GET @Path("/Offer/Offer on")@Produces(MediaType.TEXT_PLAIN)
	public String getItem() {return Offer.item;}
	
	@GET @Path("/offer/price")@Produces(MediaType.TEXT_PLAIN)
	public int getPrice() {return Offer.price;}
	
	@GET @Path("/offer/expiry")@Produces(MediaType.TEXT_PLAIN)
	public Date getExpiry() {return Offer.expiry;}
	
	
	
}
