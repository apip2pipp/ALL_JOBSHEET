/**
 * Array2Cinema17
 */
public class array2Cinematask5 {

    public static void main(String[] args) {
        String[][] audience = new String[4][2];
        
        System.out.println(audience.length);
        for (int i = 0; i< audience.length; i++){
            System.out.println(" lengt of row " + (i + 1 )+ " : " +audience[1].length);
        }

        System.out.println(audience.length);
        for (String [] rowAudience : audience){
            System.out.println(" Lengt of row : " + rowAudience.length);
        }
    }
}