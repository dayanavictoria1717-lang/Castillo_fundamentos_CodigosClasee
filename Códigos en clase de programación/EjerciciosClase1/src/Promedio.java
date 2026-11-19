public class Promedio{
    static double promedio(double a, double b, double c){
        return (a + b + c)/3;
    }
    public static void main (String[]args){
        double num1 = 10;
        double num2 = 9;
        double num3 = 8;
        System.out.println(promedio(num1, num2, num3));
    }

}