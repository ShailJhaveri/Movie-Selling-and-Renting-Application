
public class ActionVideoGames extends VideoGames {

	public static final double ACTION_VIDEOGAMES_INITIAL_PRICE = 2;
	public static final double ACTION_VIDEOGAMES_PERDAY_VAL = 1.5;
	public static final int ACTION_VIDEOGAMES_MINIMUM_DAYS = 2;
	
	public ActionVideoGames() {
		super();
	}

	public ActionVideoGames(String name, int daysrented, double price, String rentorsell) {
		super(name, daysrented, price, rentorsell);
	}	
	
	public ActionVideoGames(String name, int daysrented,String rentorsell){
		super(name, daysrented,rentorsell);
	}
	public double calculateRent() {
		double totalAmount = 0;
		totalAmount = ACTION_VIDEOGAMES_INITIAL_PRICE;
		if(daysrented > ACTION_VIDEOGAMES_MINIMUM_DAYS ){
			totalAmount += ((daysrented-ACTION_VIDEOGAMES_MINIMUM_DAYS)*ACTION_VIDEOGAMES_PERDAY_VAL);
		}
		return totalAmount;
	}
	
	
	public int calculatePoints(int points,Customer c) {
		return ++points;
	}
	

}
