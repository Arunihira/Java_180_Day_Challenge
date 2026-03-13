public class javaDay3_switch
{
    public static void main(String[] args)
     {
        int day =5;
        switch(day)
        {
            //here from java 14 instead of : we can use -> and no need to wrire break statement
            //if java version is 8 or below we have to use : and break statement method
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("wednesday");
            case 4 -> System.out.println("thursday");
            case 5 -> System.out.println("friday");
            case 6 -> System.out.println("saturday");
            case 7 -> System.out.println("sunday");
            default -> System.out.println("Invalid day");

        }
    }
}