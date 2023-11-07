import java.util.Scanner;

/**
 * Selection2id17
 */
public class Selection1id17ex2 {

    public static void main(String[] args) {
        Scanner input17 = new Scanner(System.in);
        System.out.println("Nilai UAS   : ");
        float finalExam = input17.nextFloat();
        System.out.println("Nilai UTS   :");
        float midExam = input17.nextFloat();
        System.out.println("Nilai kuis  :");
        float quiz = input17.nextFloat();
        System.out.println("nilai tugas :");
        float assignment = input17.nextFloat();

        float total = (finalExam * 0.4f) + (midExam*0.3f) + (quiz*0.1F) + (assignment*0.2F);
        //String message = total < 65? "Remidi " : "Tidak remidi ";
        //System.out.println(" Nilai Akhir = "+ total+ " sehingga " +message);

        if (total <= 39) {
            String messege = total >= 39? "Retake" : "pass";
            String letterGrade = "E";
            System.out.println("Final Grade = "+ letterGrade + " and the decision is " + messege);

        } else if (total <= 50) {
            String messege = total >= 50? "Retake" : "pass";
            String letterGrade = "D";
            System.out.println("Final Grade = "+ letterGrade + " and the decision is " + messege);
            
        } else if (total <= 60) {
            String messege = total >= 60? "Retake" : "pass";
            String letterGrade = "C";
            System.out.println("Final Grade = "+ letterGrade + " and the decision is " + messege);
            
        } else if (total <= 65) {
            String messege = total >= 65? "Retake" : "pass";
            String letterGrade = "C+";
            System.out.println("Final Grade = "+ letterGrade + " and the decision is " + messege);
            
        } else if (total <= 73) {
            String messege = total >= 73? "Retake" : "pass";
            String letterGrade = "B";
            System.out.println("Final Grade = "+ letterGrade + " and the decision is " + messege);
            
        } else if (total <= 80) {
            String messege = total >= 80? "Retake" : "pass";
            String letterGrade = "B+";
            System.out.println("Final Grade = "+ letterGrade + " and the decision is " + messege);
            
        } else if (total<= 100) {
            String messege = total >= 100? "Retake" : "pass";
            String letterGrade = "A";
            System.out.println("Final Grade = "+ letterGrade + " and the decision is " + messege);
            
        } else {
            System.out.println(" Nilai yang anda masukan salah coba lagi!");
        }
    }
}