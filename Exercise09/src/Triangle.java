class Triangle extends Shape
{
    private int base;
    private int height;
    
    Triangle(String color, int base, int height)
    {
        super(color);
        this.base = base;
        this.height = height;
    }
    
    @Override
    public String toString()
    {
        return "Triangle[base=" + base + ",height=" + height + "," + super.toString() + "]";
    }
    
    @Override
    double getArea()
    {
        return 0.5 * base * height;
    }
}
