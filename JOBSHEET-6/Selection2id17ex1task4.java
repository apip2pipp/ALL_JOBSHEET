import java.util.Scanner;

/**
 * Selection2id17ex1
 */
public class Selection2id17ex1task4 {

    public static void main(String[] args) {
        Scanner input17 = new Scanner(System.in);

        int year;
        System.out.println(" Enter The year: ");
        year = input17.nextInt();

    if ((year % 4) ==0) {
        if ((year % 100)!=0) {
            System.out.println(" Leap year  ");
        }else if ((year % 400)==0) {
            System.out.println("Leap year");
        }else 
        System.out.println("Not Leap year");
        input17.close();
    }else
    System.out.println(" Not Leap year ");
    input17.close();

    }
        
    }
