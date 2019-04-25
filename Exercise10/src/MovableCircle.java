class MovableCircle implements Movable
{
    private MovablePoint center;
    private int radius;
    
    MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius)
    {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }
    
    @Override
    public String toString()
    {
        return "MovableCircle[center=" + center.toString() + ",radius=" + radius + "]";
    }
    
    @Override
    public void moveUp()
    {
        center.y += center.ySpeed;
    }
    
    @Override
    public void moveDown()
    {
        center.y -= center.ySpeed;
    }
    
    @Override
    public void moveLeft()
    {
        center.x -= center.xSpeed;
    }
    
    @Override
    public void moveRight()
    {
        center.x += center.xSpeed;
    }
}
