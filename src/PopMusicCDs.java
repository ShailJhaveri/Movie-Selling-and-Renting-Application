
public class PopMusicCDs extends MusicCDs {

	public static final double POP_MUSICCD_INITIAL_PRICE = 2;
	public static final double POP_MUSICCD_PERDAY_VAL = 1.5;
	public static final int POP_MUSICCD_MINIMUM_DAYS = 2;

	public PopMusicCDs() {
		super();
	}

	public PopMusicCDs(String name, int daysrented, double price, String rentorsell) {
		super(name, daysrented, price, rentorsell);
	}
	public PopMusicCDs(String name, int daysrented,String rentorsell){
		super(name, daysrented,rentorsell);
	}
	public double calculateRent() {
		double totalAmount = 0;
		totalAmount = POP_MUSICCD_INITIAL_PRICE;
		if(daysrented > POP_MUSICCD_MINIMUM_DAYS ){
			totalAmount += ((daysrented-POP_MUSICCD_MINIMUM_DAYS)*POP_MUSICCD_PERDAY_VAL);
		}
		return totalAmount;
	}
	
	public int calculatePoints(int points,Customer c) {
		return ++points;
	}
}
