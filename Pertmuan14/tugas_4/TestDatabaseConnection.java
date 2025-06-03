package Tugas_4;

public class TestDatabaseConnection {
    public static void main(String[] args) {
        // Mengakses variabel statis connectionString dari kelas DatabaseConnection
        // Saat ini kelas DatabaseConnection akan dimuat dan static block dijalankan sekali
        System.out.println("Nilai connectionString: " + DatabaseConnection.connectionString);
    }
}
