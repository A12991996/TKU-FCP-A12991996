public class Test_01 {
    public static void main(String[] args){
        double radius = 5.0;
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;
        System.out.printf("Area: %.2f\n", area);
        System.out.printf("Circumference: %.2f\n", circumference);
    }

}