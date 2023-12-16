import java.util.Scanner;

/**
 * nesteadLoop17
 */
public class nesteadLoop17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Deklarasi array 2 dimensi dengan jumlah baris 5 dan kolom 7
        double[][] temps = new double[5][7];

        // Input suhu untuk setiap kota dan hari
        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke " + i);
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Hari ke " + (j + 1) + ": ");
                temps[i][j] = scanner.nextDouble();
            }
            System.out.println();
        }

        // Menampilkan suhu untuk setiap kota dan hari
        //for (int i = 0; i < temps.length; i++) {
        //    System.out.print("Kota ke-" + (i + 1) + ": ");
        //    for (int j = 0; j < temps[0].length; j++) {
        //        System.out.print(temps[i][j] + " ");
        //    }
        //    System.out.println();

        // Menampilkan suhu untuk setiap kota dan hari menggunakan foreach
        for (int i = 0; i < temps.length; i++) {
            System.out.print("City " + (i + 1) + ": ");
        for (double suhu : temps[i]) {
            System.out.print(suhu + " ");
        }
            System.out.println();
        }

        // Menampilkan nilai rata-rata suhu masing-masing kota
        for (int i = 0; i < temps.length; i++) {
            double totalSuhu = 0;
        for (int j = 0; j < temps[0].length; j++) {
            totalSuhu += temps[i][j];
        }
        double Averege = totalSuhu / temps[0].length;
            System.out.println("Averege City " + (i + 1) + ": " + Averege);
        }
    }
}