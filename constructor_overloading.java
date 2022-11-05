class const_overload {
    int length;
    int breadth;
    int area;
    const_overload()
    {
        System.out.println("THIS IS A DEFAULT CONSTRUCTOR");
    }
    const_overload(int l,int b)
    {
         length=l;
         breadth=b;
    }
    void print()
    {
        int area = length*breadth;
        System.out.println("AREA OF RECTANGLE IS "+area);
    }

    public static void main(String[] args) {
        const_overload s = new const_overload();// default constructor
        const_overload s2 = new const_overload(5,6);// parameterised constructor
        s2.print();
    }
}
