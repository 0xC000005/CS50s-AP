public class swap
{
    private int a;
    private int b;
    public swap(int a, int b)
    {
        setA(a);
        setB(b);
    }
    public void setA(int a)
    {
        this.a = a;
    }
    public void setB(int b)
    {
        this.b = b;
    }
    public void test()
    {
        int temp = a;
        a = b;
        b = temp; 
    }
    public static void main(String[] args)
    {
        swap s = new swap(1, 2);
        s.test();
        System.out.println(s.a);
        System.out.println(s.b);
    }
}
