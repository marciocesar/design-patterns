package patterns.structural.decorator;

/**
 * Concrete Decorator
 * */
public class DiscountProduct extends ProductDecorator {
	
	DiscountProduct(final Product product) {
		super(product);
	}
	
	@Override
	public void printPrice() {
		super.printPrice();
		System.out.println("Super Discount");
	}
}
