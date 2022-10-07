
public class ProductManager {
	public void add(Product product) {
		
		// isValid static olduğu için new lemeden direk erişebiliyoruz
		if(ProductValidator.isValid(product)) {
			System.out.println("Eklendi");
		}else {
			System.out.println("Urun bilgileri gecersizdir");
		}
		
		
	}
}
