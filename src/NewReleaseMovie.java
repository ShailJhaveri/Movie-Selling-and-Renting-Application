
public class NewReleaseMovie extends Movie {
	
	public static final double NR_MOVIE_INITIAL_PRICE = 0;
	public static final double NR_MOVIE_INITIAL_PERDAY_VAL = 3;

	public NewReleaseMovie() {
		super();
	}

	public NewReleaseMovie(String name, int daysrented, double price, String rentorsell) {
		super(name, daysrented, price, rentorsell);
	}
	
	public NewReleaseMovie(String name, int daysrented,String rentorsell){
		super(name, daysrented,rentorsell);
	}
	
	public double calculateRent() {
		double totalAmount = 0;
		totalAmount = NR_MOVIE_INITIAL_PRICE;
		
			totalAmount += daysrented*NR_MOVIE_INITIAL_PERDAY_VAL;
		return totalAmount;
	}

	@Override
	public int calculatePoints(int frequentRenterPoint,Customer c){
		 frequentRenterPoint++;
		if(daysrented > 1){
			frequentRenterPoint++;
		}
		return frequentRenterPoint;
	}

}
