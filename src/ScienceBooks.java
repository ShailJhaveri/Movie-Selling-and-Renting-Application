
public class ScienceBooks extends Books {

	public static final double SCIENCE_BOOKS_INITIAL_PRICE = 2;
	public static final double SCIENCE_BOOKS_PERDAY_VAL = 1.5;
	public static final int SCIENCE_BOOKS_MINIMUM_DAYS = 2;
	
	public ScienceBooks() {
		super();
	}

	public ScienceBooks(String name, int daysrented, double price, String rentorsell) {
		super(name, daysrented, price, rentorsell);
	}
	public ScienceBooks(String name, int daysrented,String rentorsell){
		super(name, daysrented,rentorsell);
	}
	public double calculateRent() {
		double totalAmount = 0;
		totalAmount = SCIENCE_BOOKS_INITIAL_PRICE;
		if(daysrented > SCIENCE_BOOKS_MINIMUM_DAYS ){
			totalAmount += ((daysrented-SCIENCE_BOOKS_MINIMUM_DAYS)*SCIENCE_BOOKS_PERDAY_VAL);
		}
		return totalAmount;
	}
	
	public int calculatePoints(int points,Customer c) {
		return ++points;
	}
}
