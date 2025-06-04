package UACPreparation.UACExercise.src.UACExercise2;

public class BasicLogin implements ILogin {
	private String username;
	private String password;

	public BasicLogin(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public boolean authenticate(String username, String password) {
		return this.username.equals(username) && this.password.equals(password);
	}
	
//	Sudah menerapkan SOLID principle : Single Responsibility Principle karena class BasicLogin hanya melakukan satu tugas yaitu login
}
