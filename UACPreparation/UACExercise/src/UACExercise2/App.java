package UACPreparation.UACExercise.src.UACExercise2;

public class App {
    public static void main(String[] args) {
    	// Sudah menerapkan Liskov Subtitution Principle karena ILogin bisa diisi oleh BasicLogin atau OAuthLogin
        ILogin emailLogin = new BasicLogin("alice", "password123");
        ILogin smsLogin = new OAuthLogin("token-abc-123");
        // Sudah menerapkan Depency Inversion Principle karena ILogin menggantikan BasicLogin dan OAuthLogin. BasicLogin dan OAuthLogin bergantung dengan ILogin

        Message email = new EmailMessage(emailLogin, "alice@example.com", "bob@example.com", "Hello Bob!");
        Message sms = new SMSMessage(smsLogin, "Alice", "Bob", "Hi Bob, this is Alice.");

        email.send("alice", "password123");
        sms.send("anyuser", "token-abc-123");

        email.send("alice", "wrongpass");
        sms.send("anyuser", "wrongtoken");
    }
}