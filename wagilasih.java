import java.util.Scanner;
public class wagilasih {
    Scanner sc = new Scanner(System.in);
    int i = 0, nilai, jml;

    System.out.print("Masukkan Jumlah Mahasiswa: ");
    jml = sc.nextInt();

    while (i < jml) {  // Continue until all students have been processed

        // Increment the counter for display purposes
        i++;
        System.out.print("Masukkan nilai mahasiswa ke- " + i + ": ");
        nilai = sc.nextInt();

        // Validate if the score is between 0 and 100
        if (nilai < 0 || nilai > 100) {
            System.out.println("Nilai tidak valid. Masukkan lagi nilai yang valid!");
            i--; // Decrement the counter to ask for the same student's input again
            continue; // Skip to the next iteration to repeat the input for the same student
        }

        // Assign grades based on the score
        if (nilai > 80 && nilai <= 100) {
            System.out.println("Nilai Mahasiswa Ke-" + i + " adalah A");
        } else if (nilai > 73 && nilai <= 80) {
            System.out.println("Nilai Mahasiswa Ke-" + i + " adalah B+");
        } else if (nilai > 65 && nilai <= 73) {
            System.out.println("Nilai Mahasiswa Ke-" + i + " adalah B");
        } else if (nilai > 60 && nilai <= 65) {
            System.out.println("Nilai Mahasiswa Ke-" + i + " adalah C+");
        } else if (nilai > 50 && nilai <= 60) {
            System.out.println("Nilai Mahasiswa Ke-" + i + " adalah C");
        } else if (nilai > 39 && nilai <= 50) {
            System.out.println("Nilai Mahasiswa Ke-" + i + " adalah D");
        } else {
            System.out.println("Nilai Mahasiswa Ke-" + i + " adalah E");
        }
    }

    sc.close(); // Close the scanner to avoid resource leak
}


