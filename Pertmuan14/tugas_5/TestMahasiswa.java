package Tugas_5;

public class TestMahasiswa {
    public static void main(String[] args) {
        // Membuat tiga objek Mahasiswa dengan NIM dan nama berbeda
        Mahasiswa m1 = new Mahasiswa("230001", "Andi");
        Mahasiswa m2 = new Mahasiswa("230002", "Budi");
        Mahasiswa m3 = new Mahasiswa("230003", "Citra");

        // Memanggil method untuk menampilkan data masing-masing mahasiswa
        m1.displayInfo();
        m2.displayInfo();
        m3.displayInfo();

        // Menampilkan jumlah total objek Mahasiswa yang telah dibuat,
        // menggunakan method statis dari kelas Mahasiswa
        System.out.println("Total mahasiswa terdaftar: " + Mahasiswa.getTotalMahasiswa());
    }
}
