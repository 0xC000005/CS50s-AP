public class Fish
{
    public String endoskeleton = "bone";
    public void action()
    {
        System.out.println("splash splash");
    }
    public void test()
    {
        System.out.println("111111");
    }
}

class Shark extends Fish{
    public String endoskeleton = "cartilage";
    public String test = "111111";
    public void action()
    {
        System.out.println("chomp chomp");
    }

}

class Main
{
    public static void main(String[] args) {
        Fish Bod = new Shark();
        System.out.println(Bod.endoskeleton);
        Bod.action();
        Bod.test();
        /*
        Output: bone
                chomp chomp
        */ 
    }
}