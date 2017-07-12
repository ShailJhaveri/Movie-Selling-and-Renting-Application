
public class PoetryBooks extends Books{
	
	public static final double POETRY_BOOKS_INITIAL_PRICE = 2;
	public static final double POETRY_BOOKS_PERDAY_VAL = 1.5;
	public static final int POETRY_BOOKS_MINIMUM_DAYS = 2;
	
	public PoetryBooks() {
		super();
	}

	public PoetryBooks(String name, int daysrented, double price, String rentorsell) {
		super(name, daysrented, price, rentorsell);
	}
	
	public PoetryBooks(String name, int daysrented,String rentorsell){
		super(name, daysrented,rentorsell);
	}
	public double calculateRent() {
		double totalAmount = 0;
		totalAmount = POETRY_BOOKS_INITIAL_PRICE;
		if(daysrented >POETRY_BOOKS_MINIMUM_DAYS ){
			totalAmount += (daysrented-POETRY_BOOKS_MINIMUM_DAYS)*POETRY_BOOKS_PERDAY_VAL;
		}
		
		return totalAmount;
	}
	
	public int calculatePoints(int points,Customer c) {
		return ++points;
	}
}
