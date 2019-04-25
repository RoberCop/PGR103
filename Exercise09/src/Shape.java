class Shape
{
    private String color;
    
    Shape(String color)
    {
        this.color = color;
    }
    
    @Override
    public String toString()
    {
        return "Shape[color=" + color + "]";
    }
    
    double getArea()
    {
        System.err.println("Shape unknown! Cannot compute area!");
        return 0;
    }
}
