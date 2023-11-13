import java.util.Scanner;

/**
 * arrayid17ex3
 */
public class arrayid17ex3 {

    public static void main(String[] args) {
        Scanner sc17 = new Scanner(System.in);

        int [] scoreStudents = new int[10];
        double total = 0;
        double Average;

        for (int i = 0; i <scoreStudents.length; i++) {
            System.out.print(" Enter Score Students to "+(i+1)+ "  : ");
            scoreStudents[i] = sc17.nextInt();
        }
        for (int i = 0; i < scoreStudents.length; i++){
            total += scoreStudents[i];
        }

        Average = total/scoreStudents.length;
        System.out.print(" Average Score is = "+Average);
        sc17.close();
    }
}