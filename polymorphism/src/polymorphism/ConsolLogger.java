package polymorphism;

public class ConsolLogger extends BaseLogger{
	public void log(String message) {
		System.out.println("Console logger: "+message);
	}
}
