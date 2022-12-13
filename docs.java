/**
 * This is to demnonstate the docs in a package
 * @author laksh
 * @version 0.1
 * @since 2022
 */
public class javadoc_tags
{
    public void add(int a,int b)
    {
        System.out.println("The sum is: "+ a+b);
    }
    public void subract(int a,double b)
    {
        System.out.println(b-a);
    }
    public void loop(int a)
    {
        int i;
        for(i = 0;i<a;i++)
        {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        System.out.println("THIS IS MY MAIN METHOD");
    }
}
// tools - generate java docs - file/whole package - output path - generate(at the bottom)
