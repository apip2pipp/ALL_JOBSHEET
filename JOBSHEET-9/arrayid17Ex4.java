import java.util.Scanner;

/**
 * arrayid17Ex4
 */
public class arrayid17Ex4 {

    public static void main(String[] args) {
        Scanner sc17 = new Scanner(System.in);

        int [] arrayInt = {34,18,26,48,72,20,56,63};
        int key = 20;
        int result = 0;
        for (int i = 0; i < arrayInt.length; i++){
            if (arrayInt[i] == key) {
                result = i;
                break;
            }
        }
        System.out.println(" The key in the array is located at index position " + result);
        sc17.close();
    }
}
