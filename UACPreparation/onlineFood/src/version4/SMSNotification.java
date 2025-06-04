package UACPreparation.onlineFood.src.version4;

public class SMSNotification implements INotification {
	private String number;
	
	public SMSNotification(String number) {
		this.number = number;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public void notifyUser(String message) {
		System.out.println("SMS sent to " + number + ": " + message);
	}

}
