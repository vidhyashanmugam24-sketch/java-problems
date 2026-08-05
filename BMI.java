import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        long n=sc.nextLong();
        float s=sc.nextFloat();
        float p=n/(s*s);
        System.out.printf("BMI = %.2f",p);
    }
}
