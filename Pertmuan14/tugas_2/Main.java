package Tugas_2;

public class SavingsAccount extends BankAccount {
    private double interestRate;

    // Konstruktor, nomor rekening dan suku bunga
    public SavingsAccount(String accountNumber) {
        super(accountNumber); // Panggil konstruktor BankAccount
        this.interestRate = 0.05; // Misal bunga 5%
    }

    // Method menampilkan info rekening plus bunga
    public void showDetailedInfo() {
        displayAccountInfo(); // Panggil method dari BankAccount
        System.out.println("Suku Bunga: " + (interestRate * 100) + "%");
    }
}
