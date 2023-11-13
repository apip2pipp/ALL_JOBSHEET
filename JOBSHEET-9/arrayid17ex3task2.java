import java.util.Scanner;

/**
 * arrayid17ex3task2
 */
public class arrayid17ex3task2 {

    public static void main(String[] args) {
        Scanner sc17= new Scanner(System.in);
        System.out.print("Enter Total Studnets   : ");
        int totalStudents = sc17.nextInt();

        int [] ScoreStudents = new int [totalStudents];
        double totalFailed = 0;
        double totalPassed = 0;
        int Passed = 0;
        int Failed = 0;

        for (int i = 0; i < ScoreStudents.length; i++){
            System.out.print("Enter Score Student - " +(i+1)+ " : ");
            ScoreStudents [i] = sc17.nextInt();
            }
            for (int i = 0; i < ScoreStudents.length; i++){
                totalPassed += ScoreStudents[i];
                if (ScoreStudents[i] > 70) {
                    totalPassed += ScoreStudents[i];
                    Passed++;
                    
                }else{
                    totalFailed += ScoreStudents[i];
                    Failed++;
                }
            }
            double AveragePassed = (Passed > 0) ? totalPassed / Passed : 0;
            double AverageFailed = (Failed > 0) ? totalFailed / Failed : 0;

            System.out.println(" Average Score passed is :" + AveragePassed);
            System.out.println(" Average Score Failed "+ AverageFailed);

            sc17.close();
            
    }
}