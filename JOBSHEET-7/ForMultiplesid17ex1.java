import java.util.Scanner;

/**
 * ForMultiplesid17ex1
 */
public class ForMultiplesid17ex1 {

    public static void main(String[] args) {
        Scanner input17 = new Scanner(System.in);
        int multiple;
        int sum=0; 
        int counter=0;
        System.out.println(" Input The Multiple = ");
        multiple = input17.nextInt();

        for(int i=1; i<50; i++) {
            if (i % multiple == 0 ) {
                sum += i;
                counter++;
            }
        }
        System.out.printf("There are %d numbers that are multiple of %d in range 1 to 50\n", counter, multiple);
        System.out.printf("THE SUM FROM ALL MULTIPLES OF %dIN RANGE 1 s.d, 50 is %d. \n", multiple, sum);
        input17.close();
    }
    
}