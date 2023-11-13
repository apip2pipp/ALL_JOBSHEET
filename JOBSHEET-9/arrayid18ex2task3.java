import java.util.Scanner;

/**
 * arrayid18ex2task3
 */
public class arrayid18ex2task3 {

    public static void main(String[] args) {
        Scanner sc17 = new Scanner(System.in);
        int [] nilaiAkhir = new int[10];

        for ( int i = 0; i< nilaiAkhir.length; i++){
            System.out.print("Enter Final Score " + i + " : ");
            nilaiAkhir[i] =sc17.nextInt();
        }

        for (int i = 0; i < nilaiAkhir.length; ++i){
            if (nilaiAkhir[i] > 70) {
                System.out.println(" student to " + i + " paassed ! " );
            } else {
                System.out.println(" Student to " + i + " Failed ! ");
            }
        }
        sc17.close();
    }
}