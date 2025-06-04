package UACPreparation.onlineFood.src.version4;

public abstract class Order {
	protected IPayment paymentMethod;
	protected INotification notification;
	protected String customerName;
	protected double amount;

	public Order(IPayment paymentMethod, INotification notification, String customerName, double amount) {
		this.paymentMethod = paymentMethod;
		this.notification = notification;
		this.customerName = customerName;
		this.amount = amount;
	}
	
	public abstract void processOrder();
}
