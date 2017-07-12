
public class Books extends Item{

	public Books()
	{
	super();
	}
	
	public Books(String name, int daysrented, double price, String rentorsell){
		super(name, daysrented, price, rentorsell);
	}
	
	public Books(String name, int daysrented,String rentorsell){
		super(name, daysrented,rentorsell);
	}
	
	
}
