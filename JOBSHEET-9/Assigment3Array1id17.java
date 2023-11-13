import java.util.Scanner;

/**
 * Assigment3Array1id17
 */
public class Assigment3Array1id17 {

    public static void main(String[] args) {
        Scanner sc17 = new Scanner(System.in);

        System.out.print("Enter the number of elements : ");
        int totalElement = sc17.nextInt();

        int[] Score = new int[totalElement];
        
        for(int i=0; i < totalElement; i++){
            System.out.print("Enter element to- "+(i+1)+" : ");
            Score [i] = sc17.nextInt();
        }

            int highestScore = Score [0];
            int lowestScore = Score [0];
            int AveragetScore = Score [0];

            for (int i =0; i< totalElement; i++){
                if (Score[i] > highestScore){ 
                    highestScore = Score[i];
                }
                    
                if (Score[i]<lowestScore) {
                    lowestScore = Score[i];
                }
                AveragetScore+= Score[i];
        }
        double Average = AveragetScore / totalElement;

        System.out.println("Highest Score  : " + highestScore);
        System.out.println("Lowest Score    : " + lowestScore);
        System.out.println("Average Score   : " + Average);
        sc17.close();
    }
}