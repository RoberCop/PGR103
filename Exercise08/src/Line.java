class Line
{
    private Point begin;
    private Point end;
    
    Line(Point newBegin, Point newEnd)
    {
        this.begin = newBegin;
        this.end = newEnd;
    }
    
    Line(final int beginX, final int beginY, final int endX, final int endY)
    {
        this.begin = new Point(beginX, beginY);
        this.end = new Point(endX, endY);
    }
    
    @Override
    public String toString()
    {
        return "Line[begin=" + this.begin.toString() + ", end=" + this.end.toString() + "]";
    }
    
    Point getBegin()
    {
        return this.begin;
    }
    
    Point getEnd()
    {
        return this.end;
    }
    
    void setBegin(Point newBegin)
    {
        this.begin = newBegin;
    }
    
    void setEnd(Point newEnd)
    {
        this.end = newEnd;
    }
    
    int getBeginX()
    {
        return this.begin.getX();
    }
    
    int getBeginY()
    {
        return this.begin.getY();
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
        this.begin.setX(newX);
    }
    
    void setBeginY(final int newY)
    {
        this.begin.setY(newY);
    }
    
    void setBeginXY(final int newX, final int newY)
    {
        this.begin.setXY(newX, newY);
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
         return new Point(this.end.getX() - this.begin.getX(), this.end.getY() - this.begin.getY());
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
