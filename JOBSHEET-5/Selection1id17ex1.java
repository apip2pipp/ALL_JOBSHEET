import java.util.Scanner;

/**
 * Selection17
 */
public class Selection1id17ex1 {

    public static void main(String[] args) {
        Scanner input17 = new Scanner(System.in);
        System.out.println(" Input a number = ");
        int number = input17.nextInt();
        //if(number%2==0){
           // System.out.println(number+ " is an even number!");
        //}else{
            String messegeS = (number % 2 == 0) ? " is an even number!" : " is an odd number!";
            System.out.println(number + messegeS);
            //System.out.println(number+" is an odd number");
        }
    }