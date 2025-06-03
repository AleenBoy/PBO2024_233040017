package Tugas_2;

public class SavingsAccount extends BankAccount {
    // Konstruktor: panggil konstruktor BankAccount untuk set nomor rekening
    public SavingsAccount(String accountNumber) {
        super(accountNumber);
    }

    // Method untuk menampilkan info rekening + jenis rekening
    public void showDetailedInfo() {
        super.displayAccountInfo();  // Panggil method displayAccountInfo dari BankAccount
        System.out.println("Jenis Rekening: Tabungan");  // Tambah info jenis rekening
    }
}





