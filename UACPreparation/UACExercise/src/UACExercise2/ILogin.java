package UACPreparation.UACExercise.src.UACExercise2;

public interface ILogin {
	public boolean authenticate(String username, String password);
}

// Sudah menerapkan Open/Close Principle karena terbuka untuk ekstensi, tetapi tertutup untuk modifikasi
// Sudah menerapkan Interface Segregation Principle karena interface ILogin hanya memiliki 1 tugas yaitu login