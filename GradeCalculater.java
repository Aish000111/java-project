import java.util.*;
import java.util.Scanner;
public class GradeCalculater{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Enter the marks obtain in 5 subject. 

        System.out.println("Enter the marks obtain in OOP(out of 100):");
        int OOP = scanner.nextInt();

        System.out.println("Enter the marks obtain in DBMS(out of 100):");
        int DBMS = scanner.nextInt();

        System.out.println("Enter the marks obtain in AI(out of 100):");
        int AI = scanner.nextInt();

        System.out.println("Enter the marks obtain in SE(out of 100):");
        int SE = scanner.nextInt();

        System.out.println("Enter the marks obtain in CG(out of 100):");
        int CG = scanner.nextInt();

        System.out.println("Marks obtain in OOP:"+OOP);
        System.out.println("Marks obtain in DBMS:"+DBMS);
        System.out.println("Marks obtain in AI:"+AI);
        System.out.println("Marks obtain in SE:"+SE);
        System.out.println("Marks obtain in CG:"+CG);

        //Total marks of 5 subject

        int TotalMarks = OOP+DBMS+AI+SE+CG;

        System.out.println("Toatal marks obtain:"+TotalMarks);

        int TotalSubject = 5;

        //Average percentage of total subject.

        double AveragePercentage = (double)TotalMarks / TotalSubject;

        System.out.println("Average percentage:"+AveragePercentage+"%");

        // Grade 

        char Grade;
        
        if(AveragePercentage >= 90)
        {
            Grade = 'A';
        }
        else if(AveragePercentage >= 80)
        {
            Grade = 'B';
        }
        else if(AveragePercentage >= 70)
        {
            Grade = 'C';
        }
        else if(AveragePercentage >= 60)
        {
            Grade = 'D';
        }
        else
        {
            Grade = 'F';
        }

        System.out.println("Grade:"+Grade);
    }
}