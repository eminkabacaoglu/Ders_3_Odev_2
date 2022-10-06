package interfaces;

public class CustomerManager {
	
	private ICustomerDal customerDal;
	
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}
	
	public void add() {
		//iş kodları yazılır, veriler dogru mu vs..
		customerDal.add();
	}
	
}
