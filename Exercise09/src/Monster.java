class Monster
{
    private String name;
    
    Monster(String name)
    {
        this.name = name;
    }
    
    String attack()
    {
        return "Help!! I don't know how to attack!";
    }
}

class FireMonster extends Monster
{
    FireMonster(String name)
    {
        super(name);
    }
    
    @Override
    String attack()
    {
        return "Attack with fire";
    }
}

class WaterMonster extends Monster
{
    WaterMonster(String name)
    {
        super(name);
    }
    
    String attack()
    {
        return "Attack with water";
    }
}

class StoneMonster extends Monster
{
    StoneMonster(String name)
    {
        super(name);
    }
    
    String attack()
    {
        return "Attack with stone";
    }
}
