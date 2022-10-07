package interfaceDemo;

//bizim çalısanımız
public class Worker implements IWorkable,IEatable,IPayable{

	@Override
	public void work() {
		// TODO Auto-generated method stub
		
	}

	// sadece kendi calısanımıza ekledik. outsource personele yemek verilmiyor gibi
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pay() {
		// TODO Auto-generated method stub
		
	}

}
