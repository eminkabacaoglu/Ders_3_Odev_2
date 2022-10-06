package overriding;

public class BaseKrediManager {
	// public final double hesapla (...)  şeklinde yazılsaydı override edilemezdi
	public double hesapla(double tutar) {
		return tutar * 1.18;
	}
}
