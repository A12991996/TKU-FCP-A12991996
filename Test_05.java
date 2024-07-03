public class Test_05 {
    public static void main(String[] args){
        double weight = 70.0;
        double height = 1.75;

        double bmi = weight / (height * height);

        System.out.printf("BMI: %.1f\n", bmi);
    }
}