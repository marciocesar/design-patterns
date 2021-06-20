package patterns.structural.decorator;

import lombok.Getter;
import lombok.Setter;

/**
 * Abstract Decorator of product
 * */
@Getter
@Setter
abstract class ProductDecorator implements Product {
	
	private Product product;
	
	ProductDecorator(Product product) {
		this.setProduct(product);
	}
	
	@Override
	public void printName() {
		getProduct().printName();
	}
	
	@Override
	public void printValidate() {
		getProduct().printValidate();
	}
	
	@Override
	public void printPrice() {
		getProduct().printPrice();
	}
}
