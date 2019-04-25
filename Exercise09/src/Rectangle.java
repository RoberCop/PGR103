class Rectangle extends Shape
{
    private int length;
    private int width;
    
    Rectangle(String color, int length, int width)
    {
        super(color);
        this.length = length;
        this.width = width;
    }
    
    @Override
    public String toString()
    {
        return "Rectangle[length=" + length + ",width=" + width + "," + super.toString() + "]";
    }
    
    @Override
    double getArea()
    {
        return length * width;
    }
}
