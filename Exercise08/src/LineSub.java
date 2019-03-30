class LineSub extends Point
{
    Point end;
    
    LineSub(final int beginX, final int beginY, final int endX, final int endY)
    {
        super(beginX, beginY);
        this.end = new Point(endX, endY);
    }
    
    LineSub(Point newBegin, Point newEnd)
    {
        super(newBegin.getX(), newBegin.getY());
        this.end = newEnd;
    }
    
    @Override
    public String toString()
    {
        return "LineSub[begin=" + super.toString() + ", end=" + this.end.toString() + "]";
    }
    
    Point getBegin()
    {
        return new Point(this.getX(), this.getY());
    }
    
    Point getEnd()
    {
        return this.end;
    }
    
    void setBegin(final int newX, final int newY)
    {
        this.setXY(newX, newY);
    }
    
    void setEnd(final int newX, final int newY)
    {
        this.end.setXY(newX, newY);
    }
    
    int getBeginX()
    {
        return this.getX();
    }
    
    int getBeginY()
    {
        return this.getY();
    }
    
    int getEndX()
    {
        return this.end.getX();
    }
    
    int getEndY()
    {
        return this.end.getY();
    }
    
    void setBeginX(final int newX)
    {
        this.setX(newX);
    }
    
    void setBeginY(final int newY)
    {
        this.setY(newY);
    }
    
    void setBeginXY(final int newX, final int newY)
    {
        this.setXY(newX, newY);
    }
    
    void setEndX(final int newX)
    {
        this.end.setX(newX);
    }
    
    void setEndY(final int newY)
    {
        this.end.setY(newY);
    }
    
    void setEndXY(final int newX, final int newY)
    {
        this.end.setXY(newX, newY);
    }
    
    private Point getVector()
    {
        return new Point(this.end.getX() - this.getX(), this.end.getY() - this.getY());
    }
    
    int getLength()
    {
        Point vector = this.getVector();
        return (int) Math.sqrt( (vector.getX() * vector.getX()) + (vector.getY() * vector.getY()) );
    }
    
    double getGradient()
    {
        Point vector = this.getVector();
        return (double) vector.getY() / (double) vector.getX();
    }
}
