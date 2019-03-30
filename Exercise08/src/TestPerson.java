public class TestPerson
{
    public static void main(String[] args)
    {
        Student s1 = new Student("John", "A place", "A Program", 1999, 50000.0);
        Student s2 = new Student("Bruh", "A house", "margorP A", 2222, 421643.0);
        Student s3 = new Student("John2", "A nation", "A ProorP A", 2000, 500.0);
        
        Staff sf1 = new Staff("John3", "A planet", "JohnSchool", 57896.0);
        Staff sf2 = new Staff("Bruh2", "A galaxy", "BruhSchool", 1.0);
    
        System.out.println(s1.getProgram());
        System.out.println(s2.getFee());
        System.out.println(s3.getYear());
        System.out.println(s3.getName());
        System.out.println(s2.getAddress());
        System.out.println(s1.toString());
        
        System.out.println(sf1.getSchool());
        System.out.println(sf2.getPay());
        System.out.println(sf1.toString());
        
        s1.setProgram("New Program");
        s2.setYear(1980);
        s3.setFee(300);
        s1.setAddress("New place");
        
        sf1.setSchool("John2School");
        sf2.setPay(0);
        
        System.out.println(s1.toString());
        System.out.println(sf1.toString());
    }
}
