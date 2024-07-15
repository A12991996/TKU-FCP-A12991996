public class ch5_9_1 {

    public static void main(String[] args){
        for (int i=1;i<=12;i++){
            for (int j=1;j<=12;j++)
                System.out.printf("%d*%d=%2d ",i,j,i*j);
            System.out.println();
        }
    }
}