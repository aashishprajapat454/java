package maths;
public class maths{
    // all circle related methodes
    public void GetVolumeOfCircle(double redius){
        double v = (4*3.14159265359*redius*redius*redius)/3;
        System.out.println("Volume of Circle is : "+ v );
    }
    public void GetAreaOfCircle(double redius){
        double a = (3.14159265359*redius*redius);
        System.out.println("Area of Circle is : "+ a);
    }
}