package test_commission_employee;

public class SalriedEmployee 
{
     private String firstName;
    private String lastName;
    private String EmpID;
    private double baseSale;
    public SalriedEmployee(String fn,String ln, String eid, double bs)
    {
        this.setFirstName(fn);
        this.setLastName(ln);
        this.setEmpID(eid);
        this.setBaseSale(bs);
    }
    public String getFirstName() 
    {
        return firstName;
    }

    public void setFirstName(String firstName) 
    {
        this.firstName = firstName;
    }

    public String getLastName() 
    {
        return lastName;
    }

    public void setLastName(String lastName) 
    {
        this.lastName = lastName;
    }

    public String getEmpID() 
    {
        return EmpID;
    }

    public void setEmpID(String EmpID) 
    {
        this.EmpID = EmpID;
    }

    public double getBaseSale() 
    {
        return baseSale;
    }

    public void setBaseSale(double bs) 
    {
        if(bs>0.0)
        this.baseSale = bs;
        else
    this.baseSale=0.0;
    }

    
    public double earning()
    {
        return this.baseSale;
    }
    @Override
    public String toString()
    {
        return String.format("First Name: %s\nLast Name:%s\nEmp ID:%s\nBase Sale:%f", this.firstName,this.lastName,this.EmpID,this.baseSale);
    }
}
