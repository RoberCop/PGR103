class Square extends Rectangle
{
    Square(double side)
    {
        super(side, side);
    }
    
    Square(double side, String color, boolean filled)
    {
        super(side, side, color, filled);
    }
    
    double getSide()
    {
        return width;
    }
    
    void setSide(double side)
    {
        this.width = this.length = side;
    }
    
    @Override
    void setWidth(double side)
    {
        setSide(side);
    }
    
    @Override
    void setLength(double side)
    {
        setSide(side);
    }
    
    @Override
    public String toString()
    {
        return "Square[" + super.toString() + "]";
    }
}
