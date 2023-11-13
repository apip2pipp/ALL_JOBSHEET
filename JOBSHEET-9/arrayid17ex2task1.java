import java.util.Scanner;

/**
 * arrayid17ex2task1
 */
public class arrayid17ex2task1 {

    public static void main(String[] args) {
        Scanner sc17 = new Scanner(System.in);
        int [] ScoreAkhir = new int[10];

        for (int A = 0; A < ScoreAkhir.length; A++ ){
            System.out.print("Enter Final score to " + A + " : ");
            ScoreAkhir [A]= sc17.nextInt();
        }
        for (int A = 0; A < 10; ++A){
            System.out.println(" Nilai akhir " + A + " : " + ScoreAkhir[A]);
        }
        sc17.close();
    }
}