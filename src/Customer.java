import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Customer {
	private String name;
	private int age;
	ArrayList<Item> listOfItems = new ArrayList<Item>();
	private int frequentRenterPoint;
	
	//Added Class variable for calculating strategy on Movie Point 
	//private int totalMoviePoints = 0;
	
	//Added Class Variable for calculating strategy for discount
	double finalBillAfterDiscount = 0;
	int finalPointsAfterStretegy = 0;
	
	
	public Customer(String name,ArrayList<Item> listOfItems,int age){
		this.name = name;
		this.age = age;
		this.listOfItems = listOfItems;
		this.frequentRenterPoint=0;
	}
	
	public Customer(String name,ArrayList<Item> listOfItems,int frequentRenterPoint,int age){
		this.name = name;
		this.age = age;
		this.listOfItems = listOfItems;
		this.frequentRenterPoint=frequentRenterPoint;
	}
	public int getAge(){
		return age;
	}
	
	public String getName(){
		return name;
	}

	public ArrayList<Item> getListOfItems() {
		return listOfItems;
	}
	
public int calculateRentForCustomer() {
		double finalBill=0;
		double finalMovieRent=0;
		double finalMoviePrice=0;
		int finalMoviePoints=0;
		double itemRent = 0;
		double itemPrice = 0;
		
		try
		{
			if(listOfItems.size() > 0)
			{
				for(Item lItem : listOfItems)
				{
					itemRent = 0;
					itemPrice = 0;
					
					if(lItem.getRentorsell().equals("rent"))
					{
						itemRent = lItem.calculateRent();
						finalMovieRent+=itemRent;
					}
					itemPrice=lItem.getPrice();
					finalMoviePrice+=itemPrice;
					finalBill +=  (itemRent + itemPrice);
					
					finalMoviePoints+=lItem.calculatePoints(frequentRenterPoint,this);
				}
				
				System.out.println("Final Bill For Customer : "+finalBill);
				
				System.out.println("Final points For Customer : "+finalMoviePoints);
				
				StrategyForDiscountAndFinalPoints s1 = new StretegyImplForDiscount();
				finalBillAfterDiscount = s1.calaculateFinalBillWithDiscount(finalBill, this);
				finalPointsAfterStretegy = s1.calculateFinalMoviePoinnts(finalMoviePoints, this);
				System.out.println("\n");
				System.out.println("Final Bill For Customer After Discount : "+ finalBillAfterDiscount);
				System.out.println("Final Points After Stretegy : "+ finalPointsAfterStretegy);
				try
				{
					
					ResultBean rr = new ResultBean();
					rr.setName(this.name);
					rr.setAge(this.age);
					rr.setTotalAmount(String.valueOf(finalMovieRent));
					rr.setListOfItems(listOfItems);
					
					
					File file = new File("D:\\file.xml");
					JAXBContext jaxbContext = JAXBContext.newInstance(ResultBean.class);
					Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
					jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
					jaxbMarshaller.marshal(rr, file);
				
				}catch(JAXBException e){
					e.printStackTrace();
				} 
				
				
			}
			else
			{
				throw new Exception("Empty Array of Movies.");
			}
		}
		catch(Exception e )
		{
			System.err.println("Problem in Calculating Rent For Customer "+this.name);
			e.printStackTrace();
		}
		
		return 0;
	}
}
