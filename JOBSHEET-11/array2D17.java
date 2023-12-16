import java.util.Scanner;

/**
 * array2D17
 */
public class array2D17 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int data[][] = new int[4][4];
        int jam[] = { 3, 6, 9, 12 };
        int min[] = { 100, 100, 100, 100 };
        double total[] = { 0, 0, 0, 0 };
        double rata[] = { 0, 0, 0, 0 };

        for (int i = 0; i < data.length; i++) {
            System.out.printf("Jam %d\n", jam[i]);
            for (int j = 0; j < data[0].length; j++) {
                switch (j) {
                    case 0:
                        System.out.print("Masukkan suhu : ");
                        data[i][j] = scan.nextInt();
                        if (min[j] > data[i][j]) {
                            min[j] = data[i][j];
                        }
                        total[j] += data[i][j];
                        break;
                    case 1:
                        System.out.print("Masukkan kelembaban : ");
                        data[i][j] = scan.nextInt();
                        if (min[j] > data[i][j]) {
                            min[j] = data[i][j];
                        }
                        total[j] += data[i][j];
                        break;
                    case 2:
                        System.out.print("Masukkan Kecepatan Angin : ");
                        data[i][j] = scan.nextInt();
                        if (min[j] > data[i][j]) {
                            min[j] = data[i][j];
                        }
                        total[j] += data[i][j];
                        break;
                    case 3:
                        System.out.print("Masukkan Index UV : ");
                        data[i][j] = scan.nextInt();
                        if (min[j] > data[i][j]) {
                            min[j] = data[i][j];
                        }
                        total[j] += data[i][j];
                        break;
                }
                rata[j] = total[j] / data.length;
            }
        }

        // Menampilkan data hanya pada kolom kecepatan angin
        System.out.println("Data Kecepatan Angin:");
        for (int i = 0; i < data.length; i++) {
            System.out.println("Jam " + jam[i] + ": " + data[i][2]);
        }

        // Mencari nilai maksimum untuk setiap parameter
        int maxSuhu = Integer.MIN_VALUE;
        int maxKelembaban = Integer.MIN_VALUE;
        int maxKecepatanAngin = Integer.MIN_VALUE;
        int maxIndexUV = Integer.MIN_VALUE;

        for (int i = 0; i < data.length; i++) {
            if (maxSuhu < data[i][0]) {
                maxSuhu = data[i][0];
            }
            if (maxKelembaban < data[i][1]) {
                maxKelembaban = data[i][1];
            }
            if (maxKecepatanAngin < data[i][2]) {
                maxKecepatanAngin = data[i][2];
            }
            if (maxIndexUV < data[i][3]) {
                maxIndexUV = data[i][3];
            }
        }

        // Menampilkan nilai maksimum
        System.out.println("Nilai Maksimum:");
        System.out.println("Maksimum Suhu: " + maxSuhu);
        System.out.println("Maksimum Persentase Kelembaban: " + maxKelembaban);
        System.out.println("Maksimum Kecepatan Angin: " + maxKecepatanAngin);
        System.out.println("Maksimum Index UV: " + maxIndexUV);
    }
    }
