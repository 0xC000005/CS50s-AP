import java.util.*;
public class exploringThis
{
    private String name; private int age; private int date;
    Scanner myScanner = new Scanner(System.in);
    public exploringThis(String name, int age)
    {
        this.age = age;
        this.name = name;
        setDate(myScanner.nextInt());
    }
    public void setDate(int _date)
    {
        date = _date;
    }
    public String toString()
    {
        return name+" "+age;
    }
    public String randomThings()
    {
        return "1122334455";
    }
    public void printPerson()
    {
        System.out.println(this);
    }
    public static void main(String[] args)
    {
        exploringThis p = new exploringThis("sb", 10);
        p.printPerson();
    }
}