package tdd.proposalGenerator;

import java.util.Calendar;

public class ProposalGenerator {
	
	private Clock clock;
	
	public ProposalGenerator(Clock clock) {
		this.clock = clock;
	}

	public Double CalculateDiscount(Basket basket) {
		
		if(january()) return basket.getAmount() * 0.05;
		if(Christmas()) return basket.getAmount() * 0.15;
		
		return basket.getAmount();
	}
	
	private boolean Christmas() {
		
		Calendar today = clock.now();
		return today.get(Calendar.MONTH) == Calendar.DECEMBER &&
				today.get(Calendar.DAY_OF_MONTH) == 25;
	}
	
	private boolean january() {
		
		Calendar today = clock.now();
		return today.get(Calendar.MONTH) == Calendar.JANUARY;
	}
	
	

}
