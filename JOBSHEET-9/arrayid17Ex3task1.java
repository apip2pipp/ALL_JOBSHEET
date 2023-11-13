import java.util.Scanner;

/**
 * arrayid17ex3
 */
public class arrayid17Ex3task1 {

    public static void main(String[] args) {
        Scanner sc17 = new Scanner(System.in);

        int [] scoreStudents = new int[10];
        double total = 0;
        double Average;

        for (int i = 0; i <scoreStudents.length; i++) {
            System.out.print("Enter Score Students "+(i+1)+ "  : ");
            scoreStudents[i] = sc17.nextInt();
        }
        for (int i = 0; i < scoreStudents.length; i++){
            total += scoreStudents[i];
            if (scoreStudents[i] > 70) {
                System.out.println("Student - " +(i+1)+ " Passed! ");                
            }else {
                System.out.println("Student - " +(i+1)+ " Failed! ");
            }
        }
        Average = total/scoreStudents.length;
        System.out.println(" Average Score is = "+Average);
        sc17.close();
    }
}