package Tugas_5;

public class Mahasiswa {
    // NIM bersifat tetap dan tidak bisa diganti setelah objek dibuat
    private final String nim;
    
    // Nama mahasiswa yang bisa diubah jika diperlukan
    private String nama;
    
    // Variabel statis untuk melacak jumlah objek Mahasiswa yang telah dibuat
    private static int totalMahasiswa = 0;
    
    // Konstanta publik yang menyatakan batas maksimum SKS yang diperbolehkan
    public static final int MAX_SKS = 24;

    // Konstruktor untuk membuat objek Mahasiswa baru dengan NIM dan nama tertentu
    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        totalMahasiswa++;  // Setiap kali objek baru dibuat, penghitung bertambah
    }

    // Method untuk menampilkan detail informasi mahasiswa ke konsol
    public void displayInfo() {
        System.out.println("NIM  : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Maksimum SKS: " + MAX_SKS);
        System.out.println("------------------------");
    }

    // Method statis untuk mengambil jumlah total mahasiswa yang sudah dibuat
    public static int getTotalMahasiswa() {
        return totalMahasiswa;
    }
}
