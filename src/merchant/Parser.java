package merchant;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.Collections;
import java.util.List;

/* This class parses the document and returns a List<String> with the size
 * highlighting the number of items
 * 
 */

public class Parser {

	public static List<String> readFileInList() 
	  { 
		//For now I am using the local file's path which can be changed
		String fileName = "/Users/zainchaudhry/eclipse-workspace/Merchant/src/merchant/Offer_List";
	    List<String> lines = Collections.emptyList(); 
	    try
	    { 
	      lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8); 
	    } 
	  
	    catch (IOException e) 
	    { 
	      e.printStackTrace(); 
	    } 
	    return lines; 
	  } 

}
