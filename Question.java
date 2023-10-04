/**
 * QuestionExperiment3
 */
import java.util.Scanner;
public class Question {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String nameOfBook;
            String pageCount;
            int price, quantity;
            double discount=0.1, totalPrice, purchasePrice, totalDiscount;
            System.out.println("Name of Book: ");
            nameOfBook=input.nextLine();
            System.out.println("pageCount: ");
            pageCount=input.nextLine();   
            System.out.print("Input price: ");
            price=input.nextInt();
            System.out.print("Input quantity: ");
            quantity=input.nextInt();
            totalPrice=price*quantity;
            totalDiscount=totalPrice*discount;
            purchasePrice=totalPrice-totalDiscount;
            System.out.print("Total discount: "+totalDiscount);
            System.out.print("Final Purchase price: "+purchasePrice);
        }
    }
}