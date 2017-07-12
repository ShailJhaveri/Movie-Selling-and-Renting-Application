import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Main {

	
	/**
	 * @author Shail Jhaveri
	 * @param args
	 */
	public static void main(String args[]){
		
		
		//Calling Main Method For Calculating per person movie Rent and Points
		
		
		//Make Objects of Movie and Call Them 
		
		
		//Call methods to calculate Rentals
		ArrayList<Item> itemList = new ArrayList<Item>();
		
		itemList.add(new PopMusicCDs("aaa",4,"rent"));
		itemList.add(new RegularMovie("bbb",5,30,"sell"));
		itemList.add(new RacingVideoGames("ccc",8,"rent"));
		itemList.add(new ScienceBooks("ddd",3,15,"sell"));
		
		
		Customer c = new Customer("Shail",itemList,22);
		
		//Set Values of Movies in this customer object 
		
		//Call Calculation Method
		c.calculateRentForCustomer();
		
	}
}
