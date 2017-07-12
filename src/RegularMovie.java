
public class RegularMovie extends Movie {
	
	public static final double REG_MOVIE_INITIAL_PRICE = 2;
	public static final double REG_MOVIE_INITIAL_PERDAY_VAL = 1.5;
	public static final int REG_MOVIE_MINIMUM_DAYS = 2;
	
	public RegularMovie() {
		super();
	}

	public RegularMovie(String name, int daysrented, double price, String rentorsell) {
		super(name, daysrented, price, rentorsell);
		
	}
	public RegularMovie(String name, int daysrented,String rentorsell){
		super(name, daysrented,rentorsell);
	}
	public double calculateRent() {
		double totalAmount = 0;
		totalAmount = REG_MOVIE_INITIAL_PRICE;
		if(daysrented >REG_MOVIE_MINIMUM_DAYS ){
			totalAmount += (daysrented-REG_MOVIE_MINIMUM_DAYS)*REG_MOVIE_INITIAL_PERDAY_VAL;
		}
		
		return totalAmount;
	}

	public int calculatePoints(int points,Customer c) {
		return ++points;
	}
	
	
}
