class Student extends Person
{
    private String program;
    private int year;
    private double fee;
    
    Student(String newName, String newAddress, String newProgram, int newYear, double newFee)
    {
        super(newName, newAddress);
        this.program = newProgram;
        this.year = newYear;
        this.fee = newFee;
    }
    
    String getProgram()
    {
        return this.program;
    }
    
    int getYear()
    {
        return this.year;
    }
    
    double getFee()
    {
        return this.fee;
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
        return "Student[Person" + super.toString() + ", program=" + this.program + ", year=" +
            String.valueOf(this.year) + ", fee=" + String.valueOf(this.fee) + "]";
    }
}
