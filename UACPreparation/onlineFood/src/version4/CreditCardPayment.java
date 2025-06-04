package UACPreparation.onlineFood.src.version4;

public class CreditCardPayment implements IPayment {
	private String ccNumber;
	private String ccv;
	
	public CreditCardPayment(String ccNumber, String ccv) {
		this.ccNumber = ccNumber;
		this.ccv = ccv;
	}

	public String getCcNumber() {
		return ccNumber;
	}

	public void setCcNumber(String ccNumber) {
		this.ccNumber = ccNumber;
	}

	public String getCcv() {
		return ccv;
	}

	public void setCcv(String ccv) {
		this.ccv = ccv;
	}

	@Override
	public boolean pay(double amount) {
		String last4Digit = ccNumber.length() > 4 ? ccNumber.substring(ccNumber.length() - 4) : ccNumber;
		System.out.println("Payment of $" + amount + " made using Credit Card ending in " + last4Digit);
		return true;
	}
	
	// Menerapkan Single Responsibility Principle : creditCardPayment class hanya melakukan pembayaran dengan kartu kredit
}
