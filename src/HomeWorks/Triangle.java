package HomeWorks;

public class Triangle {
    double a,b,c;

    void area() {
        double p=(a+b+c)/2;
        double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("Area of triangle is: "+s);
    }
}
