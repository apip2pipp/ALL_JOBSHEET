import java.util.Scanner;

/**
 * Array2withScanner17
 */
public class Array2withScanner17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row, column;
        String name, next;

        String[][]audience = new String[4][2];

        while (true) {
            System.out.println("Menu");
            System.out.println("1. Input audience data");
            System.out.println("2. Show audience list");
            System.out.println("3. Exit");

            System.out.print("Choose a menu(1/2/3): ");
            int menuChoices = sc.nextInt();
            sc.nextLine();

            switch (menuChoices) {
                case 1:
                    System.out.print("Enter the name: ");
                    name = sc.nextLine();
                    System.out.print("Enter the row: ");
                    row = sc.nextInt();
                    System.out.print("Enter the column : ");
                    column = sc.nextInt();
                    sc.nextLine();

                    if (row >= 1 && row <=4 && column >= 1 && column <=2) {
                        if (audience[row -1][column - 1] == null) {
                            audience[row -1][column -1] = name;
                            System.out.println("audience "+ name + " has been seated in row "+ row+ " column " +column);
                            
                        }else{
                            System.out.println("the seat is already occupied by another audience, please choose another seat");
                        }

                        }else{
                            System.out.println(" invalid row/column number. please select a valid number!");
                        }
                        break;
                    case 2:
                        for(int i =0; i< audience.length; i++){
                            for(int j=0; j<audience[i].length; j++){
                            if (audience[i][j] == null) {
                            System.out.print("***\t");
                            }else{
                                System.out.print(audience[i][j]+ "\t");
                            }
                        }
                        System.out.println();
                    }
                    break;
                    case 3:
                        System.out.println("Thank u ! Exiting the program");
                        System.exit(0);
                        break;

                default:
                    System.out.println("invalid menu choice");
                }
                System.out.print(" Do u want to g0 baack the main menu? (y/n): ");
                next = sc.nextLine();

                if (next.equalsIgnoreCase("n")) {
                break;
                }
            }
            
        }
    }
        
    