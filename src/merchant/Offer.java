package merchant;
import java.time.LocalDate;
public class Offer {

	public static String item;
	public static String price;
	public static LocalDate expiry;
	
	public Offer(String item, String price, LocalDate expiry) {
		Offer.item = item;
		Offer.price = price;
		Offer.expiry = expiry;
		
	}
	public static String getItem() {
		return item;
	}
	public static void setItem(String item) {
		Offer.item = item;
	}
	public static String getPrice() {
		return price;
	}
	public static void setPrice(String price) {
		Offer.price = price;
	}
	public static LocalDate getExpiry() {
		return expiry;
	}
	public static void setExpiry(LocalDate expiry) {
		Offer.expiry = expiry;
	}
	

}

