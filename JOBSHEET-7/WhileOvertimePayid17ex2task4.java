import java.util.Scanner;

/**
 * WhileOvertimePayid17ex2
 */
public class WhileOvertimePayid17ex2task4 {

    public static void main(String[] args) {
        Scanner input17 = new Scanner(System.in);

        int totalStaff, totalOverTimeHours;
        double overtimePay =0;
        double totalOvertimePay=0;
        String position;

        System.out.println(" enter the number of employees : ");
        totalStaff=input17.nextInt();

        int i = 0;
        
        while (i < totalStaff) {
            System.out.println(" Select Position = Director, Manager, Staff ");
            System.out.println("Input Position Staff to-" + (i+1)+ ": ");
            position = input17.next();
            System.out.println(" Input number of overtime hours: ");
            totalOverTimeHours = input17.nextInt();
            i++;

            if (position.equalsIgnoreCase("Director")) {
                continue;
            }else if (position.equalsIgnoreCase("Manager")) {
                overtimePay = totalOverTimeHours * 100000;
            }else if (position.equalsIgnoreCase("Staff")) {
                overtimePay = totalOverTimeHours * 75000;                
            }else { i--;
                System.out.println("Position Invalid");
            }
            totalOvertimePay += overtimePay;
        }   
        System.out.println("Total Ovaertime Pay: "+ totalOvertimePay);
        input17.close();
        
    }
}