public class Test_04 {
    public static void main(String[] args){
        double principal=1000.0;
        double rate=0.05;
        double time=2.0;

        double interest=principal*rate*time;

        System.out.printf("Interest: %.2f\n", interest);
    }
}