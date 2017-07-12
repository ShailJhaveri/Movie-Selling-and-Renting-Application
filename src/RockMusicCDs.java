
public class RockMusicCDs extends MusicCDs {
	
	public static final double ROCK_MUSICCD_INITIAL_PRICE = 2;
	public static final double ROCK_MUSICCD_PERDAY_VAL = 1.5;
	public static final int ROCK_MUSICCD_MINIMUM_DAYS = 2;

	public RockMusicCDs() {
		super();
	}

	public RockMusicCDs(String name, int daysrented, double price, String rentorsell) {
		super(name, daysrented, price, rentorsell);
	}
	public RockMusicCDs(String name, int daysrented,String rentorsell){
		super(name, daysrented,rentorsell);
	}
	public double calculateRent() {
		double totalAmount = 0;
		totalAmount = ROCK_MUSICCD_INITIAL_PRICE;
		if(daysrented > ROCK_MUSICCD_MINIMUM_DAYS ){
			totalAmount += ((daysrented-ROCK_MUSICCD_MINIMUM_DAYS)*ROCK_MUSICCD_PERDAY_VAL);
		}
		return totalAmount;
	}
	
	
	public int calculatePoints(int points,Customer c) {
		return ++points;
	}
}
