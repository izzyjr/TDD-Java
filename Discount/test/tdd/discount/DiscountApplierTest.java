package tdd.discount;

import java.util.Arrays;

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
		
		Item mac = new Item("MACBOOK", 1, 100);
		Item iPhone = new Item("IPHONE", 1, 50);
		
		Basket basket = new Basket(Arrays.asList(mac, iPhone));
		
		applier.apply(basket);
		
		Double expected  = (100 + 50) * 0.85;
		
		Assert.assertEquals(expected, basket.getAmount(), 0.0001);
		
	}
	
	@Test
	public void discountForNotebookAndWindowsPhoneTogether() {
		
		Item notebook = new Item("NOTEBOOK", 1, 100);
		Item wphone = new Item("WINDOWS PHONE", 1, 50);
		
		Basket basket = new Basket(Arrays.asList(notebook, wphone));
		
		applier.apply(basket);
		
		Double expected  = (100 + 50) * 0.88;
		
		Assert.assertEquals(expected, basket.getAmount(), 0.0001);
		
	}
	
	@Test
	public void discountForXbox() {
		
		Item xbox = new Item("XBOX", 1, 100);
		
		Basket basket = new Basket(Arrays.asList(xbox));
		
		applier.apply(basket);
		
		Double expected  = (100) * 0.30;
		
		Assert.assertEquals(expected, basket.getAmount(), 0.0001);
		
	}
	
	@Test
	public void discountForTwoItemsLesserThanAThousand() {
		
		Item refrigerator = new Item("REFRIGERATOR", 1, 100);
		
		Basket basket = new Basket(Arrays.asList(refrigerator));
		
		applier.apply(basket);
		
		Double expected  = (100) * 0.98;
		
		Assert.assertEquals(expected, basket.getAmount(), 0.0001);
		
	}
	
	@Test
	public void discountForThreeOrFourProducts() {
		
		Item refrigerator = new Item("REFRIGERATOR", 1, 2000);
		Item dishWasher = new Item("DISH WASHER", 1, 500);
		Item trashCan = new Item("TRASH CAN", 1, 2500);
		
		Basket basket = new Basket(Arrays.asList(refrigerator, dishWasher, trashCan));
		
		applier.apply(basket);
		
		Double expected  = (2000 + 500 + 2500) * (1 - 0.05);
		
		Assert.assertEquals(expected, basket.getAmount(), 0.0001);
		
	}
	
	@Test
	public void discountForMoreThanFiveItems() {
		
		Item refrigerator = new Item("REFRIGERATOR", 1, 2000);
		Item dishWasher = new Item("DISH WASHER", 1, 500);
		Item trashCan = new Item("TRASH CAN", 1, 2500);
		Item bed = new Item("BED", 1, 400);
		Item toilet = new Item("TOILET", 1, 200);
		
		Basket basket = new Basket(Arrays.asList(refrigerator, dishWasher, trashCan, bed, toilet));
		
		applier.apply(basket);
		
		Double expected  = (2000 + 500 + 2500 + 400 + 200) * 0.94;
		
		Assert.assertEquals(expected, basket.getAmount(), 0.0001);
		
	}
	
}
