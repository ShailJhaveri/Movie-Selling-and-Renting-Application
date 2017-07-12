
public class Movie extends Item {

	public Movie()
	{
	super();
	}
	
	public Movie(String name, int daysrented, double price,String rentorsell){
		super(name, daysrented, price,rentorsell);
	}
	
	public Movie(String name, int daysrented,String rentorsell){
		super(name, daysrented,rentorsell);
	}
	
	

}
