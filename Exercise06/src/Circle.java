class Circle
{
    private double radius;
    private String color;
    private static int shapesCounter = 0;
    
    Circle()
    {
        this.radius = 1.0;
        this.color = "red";
        shapesCounter++;
    }
    
    Circle(double setRadius)
    {
        this.radius = setRadius;
        this.color = "red";
        shapesCounter++;
    }
    
    Circle(double setRadius, String setColor)
    {
        this.radius = setRadius;
        this.color = setColor;
        shapesCounter++;
    }
    
    double getRadius()
    {
        return this.radius;
    }
    
    String getColor()
    {
        return this.color;
    }
    
    double getArea()
    {
        return Math.PI * (this.radius * this.radius);
    }
    
    void setRadius(double newRadius)
    {
        this.radius = newRadius;
    }
    
    void setColor(String newColor)
    {
        this.color = newColor;
    }
    
    double compareArea(Circle otherCircle)
    {
        return Math.abs(this.getArea() - otherCircle.getArea());
    }
    
    @Override
    public String toString()
    {
        return "Circle[radius=" + this.radius + " color=" + this.color + "]";
    }
    
    static void shapesCreated()
    {
        System.out.println(shapesCounter);
    }
}
