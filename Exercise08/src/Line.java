class Line
{
    private Point begin;
    private Point end;
    
    Line(Point begin, Point end)
    {
        this.begin = begin;
        this.end = end;
    }
    
    Line(final int beginX, final int beginY, final int endX, final int endY)
    {
        this.begin = new Point(beginX, beginY);
        this.end = new Point(endX, endY);
    }
    
    @Override
    public String toString()
    {
        return "Line[begin=" + begin.toString() + ", end=" + end.toString() + "]";
    }
    
    Point getBegin()
    {
        return begin;
    }
    
    Point getEnd()
    {
        return end;
    }
    
    void setBegin(Point begin)
    {
        this.begin = begin;
    }
    
    void setEnd(Point end)
    {
        this.end = end;
    }
    
    int getBeginX()
    {
        return begin.getX();
    }
    
    int getBeginY()
    {
        return begin.getY();
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
        begin.setX(newX);
    }
    
    void setBeginY(final int newY)
    {
        begin.setY(newY);
    }
    
    void setBeginXY(final int newX, final int newY)
    {
        begin.setXY(newX, newY);
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
         return new Point(end.getX() - begin.getX(), end.getY() - begin.getY());
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
