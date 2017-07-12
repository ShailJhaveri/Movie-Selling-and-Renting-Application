
public class Item {
	
	private String name;
	protected int daysrented;
	private double price;
	private String rentorsell;
	
	public Item(){
		
	}
	
	public String getRentorsell() {
		return rentorsell;
	}

	public void setRentorsell(String rentorsell) {
		this.rentorsell = rentorsell;
	}

	public Item(String name, int daysrented, double price, String rentorsell ){
		this.name=name;
		this.daysrented=daysrented;
		this.price=price;
		this.rentorsell=rentorsell;
	}
	public Item(String name, int daysrented, String rentorsell ){
		this.name=name;
		this.daysrented=daysrented;
		this.price=0;
		this.rentorsell=rentorsell;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDaysrented() {
		return daysrented;
	}

	public void setDaysrented(int daysrented) {
		this.daysrented = daysrented;
	}

	public double getPrice() {
		
		if(this.rentorsell.equals("sell"))
		{
			return price;	
		}
		return 0;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public double calculateRent(){
		return 0;
	}
	
	public double calculatePrice(){
		return 0;
	}
    public int calculatePoints(int frequentrentarpoints,Customer c){
    	return 0;
    }
}
