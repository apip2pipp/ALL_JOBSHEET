import java.util.Scanner;

/**
 * Selection2id17ex2
 */
public class Selection2id17ex2 {

    public static void main(String[] args) {
        Scanner input17 = new Scanner(System.in);

        System.out.println(" Angle input 1: ");
        float Angle1 = input17.nextFloat();

        System.out.println(" Angle input 2: ");
        float Angle2 = input17.nextFloat();
        
        System.out.println(" Angle input 3: ");
        float Angle3 = input17.nextFloat();
        
        float totalAngle = Angle1 + Angle2 + Angle3;

        if (totalAngle == 100) {
            if ((Angle1 == 90) || (Angle2 == 90) || (Angle3 == 90)) {
                if ((Angle1 == Angle2) || (Angle1 == Angle3) || (Angle2 == Angle3)) {
                System.out.println(" Righ Triangle and isosceles triangle ");
                }
    
            else
            System.out.println("right-angled triangle");
            }
        else if ((Angle1 == Angle2) && (Angle2 == Angle3)) {
        System.out.println("equilateral triangle");
        }
        else if ((Angle1 == Angle2) && (Angle2 == Angle3)) {
        System.out.println("isosceles triangle");   
        }
        else
        System.out.println("arbitrary triangle");
    }
        else
        System.out.println("Not Triangle");
        input17.close();
    }
}

