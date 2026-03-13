
import java.util.Scanner;


public class javaDay02_Admission_Eligibility_checker
{
public static void main(String[] args) 
{
    Scanner sc=new Scanner(System.in);

    //Input Student details
    System.out.println("Enter your Name");
    String name=sc.nextLine();

    System.out.println("Enter Maths Marks");
    int maths=sc.nextInt();

    System.out.println("Enter English Marks");
    int English=sc.nextInt();

    System.out.println("Enter Age");
    int age=sc.nextInt();

    System.out.println("Is student in Sports quota(True/false)");
    boolean sportsQuota=sc.nextBoolean();

    //Eligibility logic

    boolean isEligible= ((maths>=50 && English>=40)||sportsQuota)&&!(age<18);

    if (isEligible)
    {
        System.out.println(name+" is eligible for Admission");

    }
    else
    {
        System.out.println(name + "  is Not eligible for Admission");
    }


}
}