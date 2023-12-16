import java.util.Scanner;

/**
 * gratitude17
 */
public class gratitude17 {

    public static void sayThanku17(){
        String name = getGreetingRecipient17();
        System.out.println("Thank u for being the best teacher in world. \n" + 
        "Your inspired in me a love for learning and made me feel like i could ask you anything");

        String additionalGreetings = "Wishing you a great day!";
        sayAdditionalGreetings17(additionalGreetings);
    }

    public static void sayAdditionalGreetings17(String greeting){
        System.out.println(greeting);
    }

    public static String getGreetingRecipient17(){
        Scanner input17 = new Scanner(System.in);
        System.out.println("input the name of people u want to grat : ");
        String recipientName = input17.nextLine();
        input17.close();
        return recipientName;
    }
    public static void main(String[] args) {
    sayThanku17();
    }
}