package Tugas_2;

public class BankAccount {
    // Nomor rekening yang unik dan tidak bisa diubah setelah dibuat
    private final String accountNumber;
    
    // Saldo rekening, bisa diakses oleh subclass dan kelas dalam package yang sama
    protected double balance;

    // Konstruktor untuk membuat rekening baru dengan nomor rekening tertentu
    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber; // Set nomor rekening
        this.balance = 0.0; // Saldo awal diinisialisasi 0
    }

    // Method untuk menambah saldo jika jumlahnya lebih dari 0
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount; // Tambahkan saldo
        }
    }

    // Method untuk menampilkan info rekening dan saldo, tidak bisa dioverride
    public final void displayAccountInfo() {
        System.out.println("Nomor Rekening: " + accountNumber);
        System.out.println("Saldo: Rp " + balance);
    }
}



