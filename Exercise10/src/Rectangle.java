class Rectangle extends Shape
{
    protected double width;
    protected double length;
    
    Rectangle()
    {
        super("red", true);
        this.width = 1.0;
        this.length = 1.0;
    }
    
    Rectangle(double width, double length)
    {
        super("red", true);
        this.width = width;
        this.length = length;
    }
    
    Rectangle(double width, double length, String color, boolean filled)
    {
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    
    double getWidth()
    {
        return width;
    }
    
    void setWidth(double width)
    {
        this.width = width;
    }
    
    double getLength()
    {
        return length;
    }
    
    void setLength(double length)
    {
        this.length = length;
    }
    
    @Override
    double getArea()
    {
        return width * length;
    }
    
    @Override
    double getPerimeter()
    {
        return (width * 2) + (length * 2);
    }
    
    @Override
    public String toString()
    {
        return "Rectangle[width=" + width + ",length=" + length + "," + super.toString() + "]";
    }
}
