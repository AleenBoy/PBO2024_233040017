package Tugas_3;

public class Counter {
    // Variabel statis yang menyimpan jumlah objek yang sudah dibuat
    private static int instanceCount = 0;

    // Konstruktor yang dijalankan setiap kali objek baru dibuat,
    // menambah nilai penghitung instanceCount
    public Counter() {
        instanceCount++;
    }

    // Method statis yang mengembalikan total objek Counter yang sudah dibuat,
    // bisa dipanggil langsung lewat nama kelas tanpa perlu instansiasi objek
    public static int getInstanceCount() {
        return instanceCount;
    }
}
