package YouTubeDemo;

public class CarCreditManager extends BaseCreditManager implements iCreditManager {

	@Override
	public void calculate() {
		System.out.println("Araba kredisi hesaplandı.");
	}

}
