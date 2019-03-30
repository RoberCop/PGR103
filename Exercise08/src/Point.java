class Point
{
    private int x;
    private int y;
    
    Point(final int newX, final int newY)
    {
        this.x = newX;
        this.y = newY;
    }
    
    @Override
    public String toString()
    {
        return "Point: (" + this.x + "," + this.y + ")";
    }
    
    int getX()
    {
        return this.x;
    }
    
    int getY()
    {
        return this.y;
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
