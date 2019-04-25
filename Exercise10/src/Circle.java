class Circle extends Shape
{
    protected double radius;
    
    Circle()
    {
        super("red", true);
        radius = 1.0;
    }
    
    Circle(double radius)
    {
        super("red", true);
        this.radius = radius;
    }
    
    Circle(double radius, String color, boolean filled)
    {
        super(color, filled);
        this.radius = radius;
    }
    
    double getRadius()
    {
        return radius;
    }
    
    void setRadius(double radius)
    {
        this.radius = radius;
    }
    
    double getArea()
    {
        return radius*radius*Math.PI;
    }
    
    double getPerimeter()
    {
        return 2*Math.PI*radius;
    }
    
    @Override
    public String toString()
    {
        return "Circle[radius=" + radius + "," + super.toString() + "]";
    }
}
