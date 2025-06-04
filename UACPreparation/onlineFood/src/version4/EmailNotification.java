package UACPreparation.onlineFood.src.version4;

public class EmailNotification implements INotification {
	private String email;
	
	public EmailNotification(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public void notifyUser(String message) {
		System.out.println("Email sent to " + email + ": " + message);
	}

}
