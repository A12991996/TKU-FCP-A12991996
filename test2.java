import java.util.Scanner;

public class test2{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int year=scanner.nextInt();
        int month=scanner.nextInt();

        int days;

        if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
            days=31;
        }else if(month==4||month==6||month==9||month==11){
            days=30;
        }else if(month==2){
            if(year % 4==0){
                if(year % 100==0){
                    if(year % 400==0){
                        days=29;
                    }else{
                        days=28;
                    }
                }else{
                    days=29;
                }
            }else{
                days=28;
            }
        }else{
            days=-1;
        }
        scanner.close();
        System.out.println(days);
    }
}