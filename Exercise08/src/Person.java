class Person
{
    private String name;
    private String address;
    
    Person(String name, String address)
    {
        this.name = name;
        this.address = address;
    }
    
    String getName()
    {
        return name;
    }
    
    String getAddress()
    {
        return address;
    }
    
    void setAddress(String newAddress)
    {
        this.address = newAddress;
    }
    
    @Override
    public String toString()
    {
        return "Person[name=" + name + ", address=" + address + "]";
    }
}
