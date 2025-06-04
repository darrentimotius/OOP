package UACPreparation.onlineFood.src.version4;

public class CashOnDelivery implements IPayment {

	@Override
	public boolean pay(double amount) {
		System.out.println("Payment of $" + amount + " will be collected upon delivery");
		return true;
	}

}
