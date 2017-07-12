
public class RacingVideoGames extends VideoGames {

	public static final double RACING_VIDEOGAMES_INITIAL_PRICE = 2;
	public static final double RACING_VIDEOGAMES_PERDAY_VAL = 1.5;
	public static final int RACING_VIDEOGAMES_MINIMUM_DAYS = 2;
	
	public RacingVideoGames() {
		super();
	}

	public RacingVideoGames(String name, int daysrented, double price, String rentorsell) {
		super(name, daysrented, price, rentorsell);
	}
	public RacingVideoGames(String name, int daysrented,String rentorsell){
		super(name, daysrented,rentorsell);
	}
	public double calculateRent() {
		double totalAmount = 0;
		totalAmount = RACING_VIDEOGAMES_INITIAL_PRICE;
		if(daysrented > RACING_VIDEOGAMES_MINIMUM_DAYS ){
			totalAmount += ((daysrented-RACING_VIDEOGAMES_MINIMUM_DAYS)*RACING_VIDEOGAMES_PERDAY_VAL);
		}
		return totalAmount;
	}
	public int calculatePoints(int points,Customer c) {
		return ++points;
	}
}
