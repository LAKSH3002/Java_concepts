class triangle{
    double b=4.8;
          double  h = 3.6;
    public void props()
    {
        System.out.println("A TRIANGLE HAS THREE SIDES\n");
    }
    public void medians()
    {
    System.out.println("THE PERPENDICULAR DROPPED FROM ONE POINT TO THE OTHER SIDE IS THE MEDIAN");
    }
}
class isoceles extends triangle {
    double base = 2.2;
    double height = 3.3;
public void surface_area()  // this class derives the base and height from the class triangle
{
    double sa = b*h*2;
    System.out.println("JUST FOR PROGRAMMING PURPOSE");
    System.out.println("WE SAY THAT SURFACE AREA OF ISOCELES TRIANGLE IS  "+sa);
}
public void props(){
    System.out.println("THE ISOCELES TRIANGLE HAS TWO EQUAL SIDES");
    System.out.println("THIS IS AN OVERRIDEN METHOD");
}
}
class Equi_triangle extends isoceles{
    public void area(){
        double area = 0.5*base*height;  // this methods inherits the base and height from class isoceles
        System.out.println("THE AREA OF EQUILATERAL TRIANGLE IS NOT  " +area);
        System.out.println("THIS TRIANGLE HAS JUST INHERITED THE BASE AND HEIGHT OF THE ISOCELES TRIANGLE");
    }
    public void props()
    {
        System.out.println("THE TRIANGLE HAS ALL THREE SIDES EQUAL");
        System.out.println("THERE IS A DIFFERENT FORMULA TO CALCULATE AREA OF EQUILATERAL TRIANGLE");
    }
}
public class Inheritance {
    public static void main(String[] args) {

        triangle t1 = new triangle();
        t1.props();

        isoceles t2 = new isoceles();
        t2.surface_area();
        System.out.println();

        Equi_triangle t3 = new Equi_triangle();
        t3.area();
        t3.props();
    }
}
