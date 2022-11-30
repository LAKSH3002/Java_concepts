import java.util.Scanner;
interface marvel{
    void hits();
    void superhits();
}
interface harry_potter{
     void part1();
     void part2();
    void part3();
    void part4();
    void part5();
}
class Movie_lover implements marvel, harry_potter{
    Scanner sc = new Scanner(System.in);
    public void hits()
    {
        System.out.println("ALMOST EVERY MARVEL FILM IS A HIT");
        System.out.println("DIFFICULT TO COUNT ANY FLOP FILM");
        System.out.println();
    }
    public void superhits()
    {
        int n;
        System.out.println("HOW MANY DO U THINK ARE WORLDWIDE SUPERHITSOF MARVEL");
        n = sc.nextInt();
        if(n>=10 && n<15)
        {
            System.out.println("SORRY THERE ARE MORE SUPERHITS");
        }
        else if(n>=15)
        {
            System.out.println("YOU ARE CLOSE TO IT");
        }
        else {
            System.out.println("YOU DON'T HAVE MUCH IDEA ABOUT MARVEL THEN ");
        }
    }
    public void part1()
    {
        System.out.println("LETS SEE THE HARRY POTTER BOOKS");
        System.out.println();
        System.out.println("HARRY POTTER PART 1 IS PHILOSOPHER STONE");
    }
    public void part2()
    {
        System.out.println("HARRY POTTER PART 2 IS CHAMBER OF SECRETS");
    }
    public void part3()
    {
        System.out.println("HARRY POTTER PART 3 IS PRISONER OF AZKABAN");
    }
    public void part4()
    {
        System.out.println("HARRY POTTER PART 4 GOBLET OF FIRE");
    }
    public void part5()
    {
        System.out.println("HARRY POTTER PART 5 IS ORDER OF THE PHOENIX");
        System.out.println();
        System.out.println("SEEN/READ ALL THIS ? NO - BETTER WATCH/READ IT AND THE REST OF THE TWO PARTS AS WELL");
    }
}
public class Interface_Program {
    public static void main(String[] args) {
        Movie_lover m = new Movie_lover();
        m.hits();
        m.superhits();
        m.part1();
        m.part2();
        m.part3();
        m.part4();
        m.part5();
    }
}
