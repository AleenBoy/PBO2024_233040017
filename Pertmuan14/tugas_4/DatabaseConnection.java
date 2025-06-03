package Tugas_4;

public class DatabaseConnection {
    // Properti statis untuk menyimpan alamat koneksi database
    public static String connectionString;

    // Blok statis yang otomatis dieksekusi saat kelas pertama kali dimuat
    static {
        // Inisialisasi nilai connectionString dengan URL database
        connectionString = "jdbc:mysql://localhost:3306/mydb";
        System.out.println("Static block: connectionString sudah di-set.");
    }

    // Konstruktor default tanpa isi, bisa digunakan untuk membuat objek
    public DatabaseConnection() {
    }
}
