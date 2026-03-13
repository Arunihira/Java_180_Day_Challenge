public class javaDay02_task_discount
{
public static void main(String[] args) 
{
    double customerBill=2000;
    double customerDiscount=customerBill*10/100;
    double customerBillAfterdiscount=customerBill-customerDiscount;
    System.out.println("Customer bill "+customerBill);
    System.out.println("Custer Bill after 10% discount. "+customerBillAfterdiscount);
}
}