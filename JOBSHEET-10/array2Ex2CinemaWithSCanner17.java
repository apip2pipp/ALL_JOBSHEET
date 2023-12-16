import java.util.Scanner;

/**
 * array2Ex2CinemaWithSCanner17
 */
public class array2Ex2CinemaWithSCanner17 {

    public static void main(String[] args) {
        Scanner sc17 = new Scanner(System.in);
        int row, column;
        String name, next;

        String[][] audience = new String[4][2];

        while (true) {
            System.out.print("Enter the name : ");
            name = sc17.nextLine();
            System.out.print("Enter the row : ");
            row = sc17.nextInt();
            System.out.print("Enter the column : ");
            column = sc17.nextInt();
            sc17.nextLine();

            audience[row -1][column - 1] = name;

            System.out.print("Want to enter another audience?(y/n) : ");
            next = sc17.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
    
        }
    }
}