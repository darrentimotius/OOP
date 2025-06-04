package UACPreparation.onlineFood.src.version4;

public interface IPayment {
	public boolean pay(double amount);
}

// Menerapkan Interface Segregation Principle : hanya berisi method pay sehingga tidak memaksa subclass melakukan ,ethod yang tidak diperlukan.