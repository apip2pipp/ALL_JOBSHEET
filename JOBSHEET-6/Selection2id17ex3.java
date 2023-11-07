import java.util.Scanner;

/**
 * Selection2id17ex3
 */
public class Selection2id17ex3 {

    public static void main(String[] args) {
        Scanner input17 = new Scanner(System.in);

        String Category1;
        int income,  netSalary;
        double tax = 0;

        System.out.println("Category 1: ");
        Category1 = input17.nextLine();
        System.out.println("income : ");
        income = input17.nextInt();

        if (Category1.equalsIgnoreCase("WORKER")) {
            if (income <= 2000000) 
            tax =0.1;
            else if (income <= 3000000)
            tax = 0.15;
            else
            tax = 0.2;

            netSalary = (int) (income = (int) (income + tax ));
            System.out.println("Net Salary : "+ netSalary);        
        }
        else if (Category1.equals("BUSNIESS MAN")) {
            if (income <=250000)
            tax = 0.15;
            else if (income <= 150000) 
            tax = 0.2;
            else
            tax = 0.25;

            netSalary = (int) (income = (int) ( income * tax));
            System.out.println(" Net Salary " + netSalary);
        }
        else
        System.out.println(" Wrong Category");
        input17.close();
        }
    }