package be9;
import java.util.Scanner;


public class Homework2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your average point of Mathematics:");
		double mathPoint = sc.nextDouble();
			
		System.out.print("Enter your average point of English:");
		double englishPoint = sc.nextDouble();
		
				
		System.out.print("Enter your average point of Literature:");
		double literaturePoint = sc.nextDouble();
		
		sc.close();
		
		double average = (mathPoint + englishPoint + literaturePoint) / 3 ;
		System.out.println("\nYour scores:");
		System.out.printf("Mathematics: %.2f\n",mathPoint);
		System.out.printf("English: %.2f\n",englishPoint);
		System.out.printf("Literature: %.2f\n",literaturePoint);
		System.out.printf("Average: %.2f\n",average);
		
		double minScore = Math.min(Math.min(mathPoint, englishPoint), literaturePoint);
        
        char grade;
        if (average < 5) grade = 'F';
        else if (average < 6) grade = 'D';
        else if (average < 7) grade = 'C';
        else if (average < 8) grade = 'B';
        else if (average < 9) grade = 'A';
        else grade = 'S';
        
        char miniGrade;
        if (minScore >= 9) miniGrade = 'S';
        else if (minScore >= 8) miniGrade = 'A';
        else if (minScore >= 7) miniGrade = 'B';
        else if (minScore >= 6) miniGrade = 'C';
        else if (minScore >= 5) miniGrade = 'D';
        else miniGrade = 'F';
        
        
        
        
        System.out.println("\nStudent Status:");
        
        switch (grade) {
            case 'S':
                System.out.println("Excellent Student");
                break;
            case 'A':
                System.out.println("Good Student");
                break;
            case 'B':
                System.out.println("Normal Student");
                break;
            case 'C':
                System.out.println("Average Student");
                break;
            case 'D':
                System.out.println("Not Bad Student");
                break;
            case 'F':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid grade");
        }
       
        
        String gradeOrder = "FDCBAS";
        int minIndex = gradeOrder.indexOf(miniGrade);
        int avgIndex = gradeOrder.indexOf(grade);

        
        if (avgIndex - minIndex > 1) {
            grade = gradeOrder.charAt(minIndex + 1);
        }
        System.out.println("Student's grade is "+ grade);
        
        
		
	}
}
