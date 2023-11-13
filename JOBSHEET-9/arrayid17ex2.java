import java.util.Scanner;

/**
 * arrayid17ex2
 */
public class arrayid17ex2 {

    public static void main(String[] args) {
        Scanner input17 = new Scanner(System.in);
        int [] finaScore = new int[10];

        for (int i = 0; i < 10; ++i) {
            System.out.print("Enter Final Score to " + i + " : ");
            finaScore[i] = input17.nextInt();
        }
        for (int i = 0; i < 10; ++i ){
            System.out.println("Final Score to " + i + " is : " + finaScore[i]);
        }
        input17.close();
    }
}