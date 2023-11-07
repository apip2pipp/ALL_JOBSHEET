import java.util.Scanner;
/**
 * DoWhileLeaveEntitlement10
 */
public class DoWhileLeaveEntitlement10 {

    public static void main(String[] args) {
        Scanner input17 = new Scanner(System.in);

        int leaveEntitlement, numLeave;
        String  confirmation;

        System.out.print("Number of Leave Entitlement : ");
        leaveEntitlement = input17.nextInt();

        do {
            System.out.print("Do you want to take a leave? (y/n) =  ");
             confirmation = input17.next();

            if ( confirmation.equalsIgnoreCase("y")) {
                System.out.print("Leave number : ");
                numLeave = input17.nextInt();

                if (numLeave <= leaveEntitlement) {
                    leaveEntitlement -= numLeave;
                    System.out.println("The remaining leave entitlement : " + leaveEntitlement);

                } else {
                    System.out.println("The remaining leave entitlement is not sufficient !");
                    break;
                }
            }
        } while (leaveEntitlement > 0);
        input17.close();
    }
}