public class ch6_4_1 {
    public static void main(String[] args) {
        int sum=0;
        int[][] sales={{32,35,26,30},{34,30,33,31}};

        for(int[] row:sales){
            for(int n:row){
                System.out.printf("%3d",n);
                sum+=n;
            }
            System.out.println();
        }
        System.out.printf("總銷售量為%d部車",sum);
    }
}