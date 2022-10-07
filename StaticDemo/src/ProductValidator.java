
public class ProductValidator {
	
	public ProductValidator() {
		System.out.println("Yapici blok");// newlenmeden çalışmaz
	}
	
	static {
		System.out.println("Staticte calisan yapici blok");
	}
	
	
	public static boolean isValid(Product product) {
		if(product.price > 0 && !product.name.isEmpty()) {
			return true;
		}
		return false;
	}
	
	
	// bu methodun cagırılması için ProductValidator un new lenmesi gerek çünküstatic değil
	public void bisey() {
		
	}
	
	public static class BaskaBirSey{ //inner class
		public static void sil() {
			
		}
	}
}
