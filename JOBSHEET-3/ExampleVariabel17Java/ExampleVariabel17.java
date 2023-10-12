package ExampleVariabel17Java;

/**
 * ExampleVariabel17
 */
public class ExampleVariabel17{

    public static void main(String[] args) {
        String oneOfMyHobbies = "Playing BasketBall";
        boolean isSmart = true;
        char gender = 'M';
        byte _age = 18;
        double $gpa =3.88, height = 1.88;
        System.out.println(oneOfMyHobbies);
        System.out.println("Are you smart ?" + isSmart);
        System.out.println("Gender:  " +gender);
        System.out.println("My currnet age is: " + _age);
        System.out.println(String.format("My GPA is %s and my height is %s meters", $gpa, height));

    }
}