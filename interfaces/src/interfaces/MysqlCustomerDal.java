package interfaces;

public class MysqlCustomerDal implements ICustomerDal{

	@Override
	public void add() {
		System.out.println("Veritabanina Eklendi: MySql");
		
	}


}
