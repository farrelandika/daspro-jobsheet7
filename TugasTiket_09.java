import java.util.Scanner;

public class TugasTiket_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaTiket = 50000;
        int totalTiketTerjual = 0;
        double totalPenjualan = 0;
        char i;
        
        do {
            int jumlahTiket;
            do {
                System.out.print("Masukkan jumlah tiket yang dibeli oleh pelanggan: ");
                jumlahTiket = sc.nextInt();
                
                if (jumlahTiket < 0) {
                    System.out.println("Input tidak valid! Silakan masukkan ulang");
                }
                
            } while (jumlahTiket < 0);  
            
            totalTiketTerjual = totalTiketTerjual + jumlahTiket;
            double totalHarga = jumlahTiket * hargaTiket;           
        
            double diskon = 0;
            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            }

            double totalHargaSetelahDiskon = totalHarga - (totalHarga * diskon);
            totalPenjualan = totalPenjualan + totalHargaSetelahDiskon;

            System.out.println("Total harga sebelum diskon: Rp " + totalHarga);
            if (diskon > 0) {
                System.out.println("Anda mendapat diskon sebesar " + (diskon * 100) + "%.");
            } else {
                System.out.println("pilihan anda tidak valid");
            }
            System.out.println("Total harga setelah diskon: Rp " + totalHargaSetelahDiskon);
            System.out.print("Apakah ada pelanggan lain yang ingin membeli tiket? (y/n): ");
            i = sc.next().charAt(0);
            
        } while (i == 'y' || i == 'Y');
        
        System.out.println("Total tiket terjual: " + totalTiketTerjual + " tiket.");
        System.out.println("Total penjualan hari ini: Rp " + totalPenjualan);

    }
}
        