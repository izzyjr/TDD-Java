package tdd.proposalGenerator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DiscountApplierTest {
	
	private DiscountApplier applier;
	
	@Before
	public void setUp() {
		applier = new DiscountApplier();
	}

	@Test
	public void discountForMacAndIphoneTogether() {
		
		Basket basket = new BasketBuilder()
				.w("MACBOOK", 100)
				.w("IPHONE", 50)
				.build();
		
		applier.apply(basket);
		
		Double expected  = (100 + 50) * 0.85;
		
		Assert.assertEquals(expected, basket.getAmount(), 0.0001);
		
	}
	
	@Test
	public void discountForNotebookAndWindowsPhoneTogether() {
		
		Basket basket = new BasketBuilder()
				.w("NOTEBOOK", 100)
				.w("WINDOWS PHONE", 50)
				.build();
		
		applier.apply(basket);
		
		Double expected  = (100 + 50) * 0.88;
		
		Assert.assertEquals(expected, basket.getAmount(), 0.0001);
		
	}
	
	@Test
	public void discountForXbox() {
		
		Basket basket = new BasketBuilder()
				.w("XBOX", 100)
				.build();
		
		applier.apply(basket);
		
		Double expected  = (100) * 0.30;
		
		Assert.assertEquals(expected, basket.getAmount(), 0.0001);
		
	}
	
	@Test
	public void discountForTwoItemsLesserThanAThousand() {
		
		Basket basket = new BasketBuilder()
				.w("REFRIGERATOR", 100)
				.build();
		
		applier.apply(basket);
		
		Double expected  = (100) * 0.98;
		
		Assert.assertEquals(expected, basket.getAmount(), 0.0001);
		
	}
	
	@Test
	public void discountForThreeOrFourProducts() {
		
		Basket basket = new BasketBuilder()
				.w("REFRIGERATOR", 2000)
				.w("DISH WASHER", 500)
				.w("TRASH CAN", 2500)
				.build();
		
		applier.apply(basket);
		
		Double expected  = (2000 + 500 + 2500) * (1 - 0.05);
		
		Assert.assertEquals(expected, basket.getAmount(), 0.0001);
		
	}
	
	@Test
	public void discountForMoreThanFiveItems() {
		
		Basket basket = new BasketBuilder()
			.w("REFRIGERATOR", 2000)
			.w("DISH WASHER", 500)
			.w("TRASH CAN", 2500)
			.w("BED", 400)
			.w("TOILET", 200)
			.build();
				
		applier.apply(basket);
		
		Double expected  = (2000 + 500 + 2500 + 400 + 200) * 0.94;
		
		Assert.assertEquals(expected, basket.getAmount(), 0.0001);
		
	}
	
}
