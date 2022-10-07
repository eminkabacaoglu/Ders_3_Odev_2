
public class Main {

	public static void main(String[] args) {

		ProductManager productManager = new ProductManager();
		
		Product product = new Product();
		product.name="Mouse";
		product.price=10;
		
		productManager.add(product);
		
		//inner classlar ve static yapı (fakat bu tip yapılar önerilmez)
		DatabaseHelper.Crud.delete();
		DatabaseHelper.Connection.createConnection();

	}

}
