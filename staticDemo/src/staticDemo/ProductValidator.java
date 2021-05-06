package staticDemo;

public class ProductValidator {
	
	public ProductValidator() {
		System.out.println("Yapýcý blok çalýþtý");
	}
	
	static{
		System.out.println("Static yapýcý blok çalýþtý");
	}
	
	public static boolean isValid(Product product) {
		if(product.price>0 && !product.name.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void bisey() {
		
	}
}
