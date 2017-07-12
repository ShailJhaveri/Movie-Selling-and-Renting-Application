
public class StretegyImplForDiscount implements StrategyForDiscountAndFinalPoints {

	@Override
	public double calaculateFinalBillWithDiscount(double finalBill, Customer c) {
		
		double finalBillafterDiscount = 0;
		
		if(c.getAge() <= 20 && finalBill >= 50  ){
			finalBillafterDiscount = 0.9 * finalBill;
		}
		else if(c.getAge() > 20 && finalBill >= 50){
			finalBillafterDiscount = 0.95 * finalBill;
		}
		else{
			finalBillafterDiscount = finalBill;
		}
		
		return finalBillafterDiscount;
	}

	@Override
	public int calculateFinalMoviePoints(int finalPoints, Customer c) {
		int finalPointAfterStretegy = 0;
		
		if(c.getAge() <= 20 && finalPoints >= 4  ){
			finalPointAfterStretegy = finalPoints + 4;
		}
		else if(c.getAge() > 20 && finalPoints >= 4){
			finalPointAfterStretegy = finalPoints + 2;
		}
		else{
			finalPointAfterStretegy = finalPoints;
		}
		return finalPointAfterStretegy;
	}

}
