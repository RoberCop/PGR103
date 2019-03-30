class Staff extends Person
{
    private String school;
    private double pay;
    
    Staff(String newName, String newAddress, String newSchool, double newPay)
    {
        super(newName, newAddress);
        this.school = newSchool;
        this.pay = newPay;
    }
    
    String getSchool()
    {
        return this.school;
    }
    
    double getPay()
    {
        return this.pay;
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
        return "Staff[Person" + super.toString() + ", school=" + this.school +
            ", pay=" + String.valueOf(this.pay) + "]";
    }
}
