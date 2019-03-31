class Staff extends Person
{
    private String school;
    private double pay;
    
    Staff(String name, String address, String school, double pay)
    {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }
    
    String getSchool()
    {
        return school;
    }
    
    double getPay()
    {
        return pay;
    }
    
    void setSchool(String newSchool)
    {
        this.school = newSchool;
    }
    
    void setPay(double newPay)
    {
        this.pay = newPay;
    }
    
    @Override
    public String toString()
    {
        return "Staff[Person" + super.toString() + ", school=" + school +
            ", pay=" + String.valueOf(pay) + "]";
    }
}
