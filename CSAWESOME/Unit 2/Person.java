public class Person 
{ 
    private String name; 
    private int age;
    public Person(String aName, int anAge) 
    { 
        name = aName; age = anAge; 
    }
    /** @return the String form of this person */ 
    public String toString1() 
    { 
        return name + " " + age; 
    }
    public String toString() 
    { 
        return age + " " + name; 
    }
    public void printPerson() 
    { 
        System.out.println(this); 
    }
    //Other variables and methods are not shown.
    public static void main(String[] args)
    {
        Person p = new Person("Dan", 10); 
        p.printPerson();
    }
}