public class encapsule{
    // fields to calculate area
        int length;
        int breadth;
        // constructor to initialize values
        encapsule(int length, int breadth) {
            this.length = length;
            this.breadth = breadth;
        }
        // method to calculate area and perimeter
        public void getAreaPeri() {
            int area = length * breadth;
            int peri = 2*(length+breadth);
            System.out.println("Area: " + area);
            System.out.println("PERIMETER "+peri);
        }
    }
    class Main {
        public static void main(String[] args) {

            encapsule rectangle = new encapsule(5, 8);
            rectangle.getAreaPeri();
        }
    }
