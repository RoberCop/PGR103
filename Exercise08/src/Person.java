class Person
{
    private String name;
    private String address;
    
    Person(String newName, String newAddress)
    {
        this.name = newName;
        this.address = newAddress;
    }
    
    String getName()
    {
        return this.name;
    }
    
    String getAddress()
    {
        return this.address;
    }
    
    void setAddress(String newAddress)
    {
        this.address = newAddress;
    }
    
    @Override
    public String toString()
    {
        return "Person[name=" + this.name + ", address=" + this.address + "]";
    }
}
