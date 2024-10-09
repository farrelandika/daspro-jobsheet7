import java.util.Scanner;

public class Tugas_Tiket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tiket, hargaTktperunit = 50000, totalHarga;
        String namaPlanggan;

        System.out.print("Jumlah tiket: ");
        tiket = sc.nextInt();


        while (true) {
            System.out.print("Masukkan nama pelanggan (ketik (exit) untuk keluar): ");
            namaPlanggan = sc.nextLine();

            if (namaPlanggan.equalsIgnoreCase("exit")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }
            if (tiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Silakan masukkan jumlah yang valid.");
                sc.nextLine(); 
                continue;
            }

           
        } 
        totalHarga = tiket * hargaTktperunit;
        System.out.println("Total yang harus dibayar: Rp " + totalHarga);

        sc.nextLine();
    
}
}