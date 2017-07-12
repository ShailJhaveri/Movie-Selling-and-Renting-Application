
public class ChildrenMovie extends Movie {

	public static final double CHILD_MOVIE_INITIAL_PRICE = 0;
	public static final double CHILD_MOVIE_INITIAL_PERDAY_VAL = 3;
	public static final int CHILD_MOVIE_MINIMUM_DAYS = 3;
	
	public ChildrenMovie() {
		super();
	}

	public ChildrenMovie(String name, int daysrented, double price, String rentorsell) {
		super(name, daysrented, price,rentorsell);
	}
	
	public ChildrenMovie(String name, int daysrented,String rentorsell){
		super(name, daysrented,rentorsell);
	}
	
	public double calculateRent() {
		double totalAmount = 0;
		totalAmount = CHILD_MOVIE_INITIAL_PRICE;
		if(daysrented > CHILD_MOVIE_MINIMUM_DAYS ){
			totalAmount += ((daysrented-CHILD_MOVIE_MINIMUM_DAYS)*CHILD_MOVIE_INITIAL_PERDAY_VAL);
		}
		return totalAmount;
	}
	
	public int calculatePoints(int points,Customer c) {
		return ++points;
	}

}