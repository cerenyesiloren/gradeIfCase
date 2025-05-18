import java.util.Scanner;

public class GradeIfCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Lütfen notunuzu girin(0-100) : ");
        int grade = scanner.nextInt();
        String letterGrade ;

        if (grade>= 90) {
            letterGrade = "AA";
        } else if (grade>= 80) {
            letterGrade = "BA";
        } else if (grade>=70){
            letterGrade = "BB";
        } else if (grade>=60){
            letterGrade = "CB";
        } else if (grade>=50){
            letterGrade = "CC";
        } else if (grade>=40){
            letterGrade = "DC";
        } else if (grade>=30){
            letterGrade = "DD";
        } else {
            letterGrade = "FF";
        }


        System.out.println("Harf Notunuz : " + letterGrade);
    }
}
