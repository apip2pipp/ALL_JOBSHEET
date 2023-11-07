import java.util.Scanner;

/**
 * WhileMultiplesid17ex1task4
 */
public class WhileMultiplesid17ex1task4 {

    public static void main(String[] args) {
        Scanner input17 = new Scanner(System.in);

        int multiple;
        int sum = 0;
        int counter = 0;
        int i = 1;
        float Average;

        System.out.print("Input the multiple = ");
        multiple = input17.nextInt();

        while (i <= 50) {
            if (i % multiple == 0) {
                sum +=i;
                counter++;
            }
        i++;
        }
        Average = sum / counter;
        System.out.printf("There are %d numbers that are multiple of %d in the range 1 to 50. \n", counter, multiple);
        System.out.printf("The sum of all multiples of %d in the range 1 to 50 is %d. \n", multiple, sum);
        System.out.printf("Averge from %d is %.3f\n", counter, Average);
        input17.close();
    }
}
