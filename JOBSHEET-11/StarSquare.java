import java.util.Scanner;

/**
 * StarSquare
 */
public class StarSquare {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of N : ");

        int N = sc.nextInt();
        for (int i = 1; i <=N; i++){
            System.out.print("*");

            for(int IinBox=1; IinBox<=N; IinBox++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}