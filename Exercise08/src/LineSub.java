class LineSub extends Point
{
    Point end;
    
    LineSub(final int beginX, final int beginY, final int endX, final int endY)
    {
        super(beginX, beginY);
        this.end = new Point(endX, endY);
    }
    
    LineSub(Point begin, Point end)
    {
        super(begin.getX(), begin.getY());
        this.end = end;
    }
    
    @Override
    public String toString()
    {
        return "LineSub[begin=" + super.toString() + ", end=" + end.toString() + "]";
    }
    
    Point getBegin()
    {
        return new Point(getX(), getY());
    }
    
    Point getEnd()
    {
        return end;
    }
    
    void setBegin(final int newX, final int newY)
    {
        setXY(newX, newY);
    }
    
    void setEnd(final int newX, final int newY)
    {
        end.setXY(newX, newY);
    }
    
    int getBeginX()
    {
        return getX();
    }
    
    int getBeginY()
    {
        return getY();
    }
    
    int getEndX()
    {
        return end.getX();
    }
    
    int getEndY()
    {
        return end.getY();
    }
    
    void setBeginX(final int newX)
    {
        setX(newX);
    }
    
    void setBeginY(final int newY)
    {
        setY(newY);
    }
    
    void setBeginXY(final int newX, final int newY)
    {
        setXY(newX, newY);
    }
    
    void setEndX(final int newX)
    {
        end.setX(newX);
    }
    
    void setEndY(final int newY)
    {
        end.setY(newY);
    }
    
    void setEndXY(final int newX, final int newY)
    {
        end.setXY(newX, newY);
    }
    
    private Point getVector()
    {
        return new Point(end.getX() - getX(), end.getY() - getY());
    }
    
    int getLength()
    {
        Point vector = getVector();
        return (int) Math.sqrt( (vector.getX() * vector.getX()) + (vector.getY() * vector.getY()) );
    }
    
    double getGradient()
    {
        Point vector = getVector();
        return (double) vector.getY() / (double) vector.getX();
    }
}
