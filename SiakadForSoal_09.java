import java.util.Scanner;
public class SiakadForSoal_09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lulus =0, tidakLulus = 0;
        double nilai, tertinggi = 0, terendah = 100;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan Nilai Mahasiswa Ke-" + i + ": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
                
            }
            if (nilai < terendah) {
                terendah = nilai;
                
            } 
            if (nilai > 60) {
                lulus++;
                
            } else {
                tidakLulus++;
            }
        }
        
        System.out.println("Nilai Tertinggi: " + tertinggi);
        System.out.println("Nilai Terendah: " + terendah);
        System.out.println("Siswa yang lulus berjumlah: " + lulus + " anak");
        System.out.println("Siswa yang tidak lulus berjumlah: " + tidakLulus + " anak");

        
    }
}

