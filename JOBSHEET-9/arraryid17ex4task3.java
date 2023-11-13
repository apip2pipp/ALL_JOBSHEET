import java.util.Scanner;

/**
 * arraryid17ex4task2
 */
public class arraryid17ex4task3 {

    public static void main(String[] args) {
        Scanner sc17 = new Scanner(System.in);

        System.out.print("Enter total element Array : ");
        int total = sc17.nextInt();

        int[] arrayInt = new int[total];

        for (int i=0; i < total; i++){
            System.out.print("Enter Elements to "+i+" : ");
            arrayInt [i]= sc17.nextInt();
        }
            System.out.print("Enter the key you want search : ");
            int key = sc17.nextInt();

            int result =0;

            for (int i= 0; i< arrayInt.length; i++){
                if (arrayInt[i] == key) {
                    result =i;
                    break;
                    
                }
            }
            if (result != 0) {
                System.out.print("The key is in the index position to- "+result);
            }else{
                System.out.println("key not found ");
            }
        sc17.close();
    }
}