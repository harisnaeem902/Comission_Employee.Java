
package test_commission_employee;

public class CommissionEmployee extends Object
{
    private String Firstname;
    private String Lastname;
    private String EmpId;
    private double GrossSale;
    private double CommRate;
    
    public CommissionEmployee(String fn,String ln,String eid,double gs,double cr)
    {
        this.setFirstname(fn);
        this.setLastname(ln);
        this.setEmpId(eid);
        this.setGrossSale(gs);
        this.setCommRate(cr);
    }

    public String getFirstname() 
    {
        return Firstname;
    }

    public void setFirstname(String fn) 
    {
        this.Firstname = Firstname;
    }

    public String getLastname() 
    {
        return Lastname;
    }

    public void setLastname(String ln) 
    {
        this.Lastname = Lastname;
    }

    public String getEmpId() 
    {
        return EmpId;
    }

    public void setEmpId(String eid) 
    {
        this.EmpId = EmpId;
    }

    public double getGrossSale() 
    {
        return GrossSale;
    }

    public void setGrossSale(double gs) 
    {
       if(gs>0.0)
       this.GrossSale = gs;
       else
       this.GrossSale = 0.0;
    }

    public double getCommRate() 
    {
        return CommRate;
    }

    public void setCommRate(double cr) 
    {
        if(cr>0&&cr<1)
        this.CommRate = cr;
        else
        this.CommRate = 0.0;
        this.CommRate = 0.0;
    }
    public double earning()
    {
        return this.GrossSale*this.CommRate;
    }
     @Override
     public String toString()
        {
          return String.format("First Name: %s\nLast Name:%s\nEmp ID:%s\nGross Sale:%f\nCommission Rate: %f", this.Firstname,this.Lastname,this.EmpId,this.GrossSale,this.CommRate);
        }
        
    
}


