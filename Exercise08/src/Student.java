class Student extends Person
{
    private String program;
    private int year;
    private double fee;
    
    Student(String name, String address, String program, int year, double fee)
    {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }
    
    String getProgram()
    {
        return program;
    }
    
    int getYear()
    {
        return year;
    }
    
    double getFee()
    {
        return fee;
    }
    
    void setProgram(String newProgram)
    {
        this.program = newProgram;
    }
    
    void setYear(int newYear)
    {
        this.year = newYear;
    }
    
    void setFee(double newFee)
    {
        this.fee = newFee;
    }
    
    @Override
    public String toString()
    {
        return "Student[Person" + super.toString() + ", program=" + program + ", year=" +
            String.valueOf(year) + ", fee=" + String.valueOf(fee) + "]";
    }
}
