class Point
{
    private int x;
    private int y;
    
    Point(final int x, final int y)
    {
        this.x = x;
        this.y = y;
    }
    
    @Override
    public String toString()
    {
        return "Point: (" + x + "," + y + ")";
    }
    
    int getX()
    {
        return x;
    }
    
    int getY()
    {
        return y;
    }
    
    void setX(final int newX)
    {
        this.x = newX;
    }
    
    void setY(final int newY)
    {
        this.y = newY;
    }
    
    void setXY(final int newX, final int newY)
    {
        this.x = newX; this.y = newY;
    }
}
