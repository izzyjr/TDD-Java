package tdd.proposalGenerator;

import java.util.Calendar;

public class ProposalGenerator {
	
	public Double CalculateDiscount(Basket basket) {
		
		if(january()) return basket.getAmount() * 0.05;
		if(Christmas()) return basket.getAmount() * 0.15;
		
		return (double) 0;
	}
	
	private boolean Christmas() {
		
		Calendar today = Calendar.getInstance();
		return today.get(Calendar.MONTH) == Calendar.DECEMBER &&
				today.get(Calendar.DAY_OF_MONTH) == 25;
	}
	
	private boolean january() {
		
		Calendar today = Calendar.getInstance();
		return today.get(Calendar.MONTH) == Calendar.DECEMBER;
	}
	
	

}
