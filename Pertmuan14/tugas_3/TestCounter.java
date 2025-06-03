package Tugas_3;

public class TestCounter {
    public static void main(String[] args) {
        // Membuat empat objek baru dari kelas Counter
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        Counter c4 = new Counter();

        // Menampilkan total objek Counter yang sudah tercipta,
        // dengan memanggil method statis tanpa perlu objek
        System.out.println("Jumlah objek Counter yang telah dibuat: " + Counter.getInstanceCount());
    }
}
