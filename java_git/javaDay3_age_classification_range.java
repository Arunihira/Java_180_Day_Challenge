
import java.util.Scanner;

public class javaDay3_age_classification_range
{
    public static void main (String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age");
        int age=sc.nextInt();
        
        if(age<13)
        {
            System.out.println("child");
        }
        else if(age>=13 && age<=19)
        {
            System.out.println("Teenager");
    
        }
        else if(age>=20 && age <=59)
        {
            System.out.println("Adult");

        }
        else if(age>=70)
        {
            System.out.println("Senior");
        }

        sc.close();


    }
}