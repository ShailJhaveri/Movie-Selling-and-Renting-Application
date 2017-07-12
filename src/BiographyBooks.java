
public class BiographyBooks extends Books {

	public static final double BIOGRAPHY_BOOKS_INITIAL_PRICE = 2;
	public static final double BIOGRAPHY_BOOKS_PERDAY_VAL = 1.5;
	public static final int BIOGRAPHY_BOOKS_MINIMUM_DAYS = 2;
	
	public BiographyBooks() {
		super();
	}

	public BiographyBooks(String name, int daysrented, double price, String rentorsell) {
		super(name, daysrented, price, rentorsell);
	}
	
	public BiographyBooks(String name, int daysrented,String rentorsell){
		super(name, daysrented,rentorsell);
	}
	public double calculateRent() {
		double totalAmount = 0;
		totalAmount = BIOGRAPHY_BOOKS_INITIAL_PRICE;
		if(daysrented > BIOGRAPHY_BOOKS_MINIMUM_DAYS ){
			totalAmount += ((daysrented-BIOGRAPHY_BOOKS_MINIMUM_DAYS)*BIOGRAPHY_BOOKS_PERDAY_VAL);
		}
		return totalAmount;
	}
	
	public int calculatePoints(int points,Customer c) {
		return ++points;
	}
}
