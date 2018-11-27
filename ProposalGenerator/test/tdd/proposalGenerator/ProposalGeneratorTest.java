package tdd.proposalGenerator;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ProposalGeneratorTest {
	
	@Test
	public void discountWhenChristmas() {
		
		Basket basket = new BasketBuilder().w("MACBOOK", 1000).build();
		
		ProposalGenerator generator = new ProposalGenerator();
		double finalAmount = generator.CalculateDiscount(basket);
		
		Assert.assertEquals(1000*0.85, finalAmount, 0.0001);
		
	}

}
