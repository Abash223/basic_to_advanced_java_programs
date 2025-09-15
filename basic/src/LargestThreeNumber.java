import java.util.Scanner;

public class LargestThreeNumber {
    public static void main(String[]args){
        Scanner sc= new Scanner (System.in);
        int a= sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        int max =b;
        if(a>max) max=a;
        if(c>max) max=c;
        System.out.println(max);
    }
}
