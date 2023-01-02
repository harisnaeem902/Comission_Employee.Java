package test_commission_employee;

public class Test_commission_employee 
{

    public static void main(String[] args) 
    {
        CommissionEmployee e = new CommissionEmployee("Haris","Naeem","2252",27000,0.05);
        System.out.println(e.toString());
        System.out.println("Earning " + e.earning());
        System.out.println("\n\n\n");
        
        SalriedEmployee e1 = new SalriedEmployee("Muzamil", "Tarar" , "2257",35000);
        System.out.println(e1.toString());
        System.out.println("Earning:"+e1.earning());
    }
    
}
