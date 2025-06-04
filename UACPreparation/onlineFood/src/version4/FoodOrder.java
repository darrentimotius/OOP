package UACPreparation.onlineFood.src.version4;

public class FoodOrder extends Order {

	public FoodOrder(IPayment paymentMethod, INotification notification, String customerName, double amount) {
		super(paymentMethod, notification, customerName, amount);
	}

	@Override
	public void processOrder() {
		boolean checkPayment = paymentMethod.pay(amount);
		if (checkPayment) {
			String message = "Dear " + customerName + ", your order of $" + amount + " has been placed.";
			notification.notifyUser(message);
		}
	}
}

// Menerapkan Liskov Subtitution Principle : pembayaran dapat dilakukan dengan metode apapun tanpa mengganggu logika processOrder.