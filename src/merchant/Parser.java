package merchant;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.Collections;

import java.util.List;

public class Parser {

	public static List<String> readFileInList() 
	  { 
		String fileName = "/Users/zainchaudhry/eclipse-workspace/Merchant/src/merchant/Offer_List";
	    List<String> lines = Collections.emptyList(); 
	    try
	    { 
	      lines = 
	       Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8); 
	    } 
	  
	    catch (IOException e) 
	    { 
	      e.printStackTrace(); 
	    } 
	    return lines; 
	  } 
	  public static void main(String[] args) 
	  { 
	    List<String> l = readFileInList(); 
	    for(int i = 0;i<l.size();i++) {
	    	String[] split = l.get(i).split(" ");
	    	System.out.println("Item "+split[0]);
	    }
	   
	     
	  } 
}
