import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        float s=n*0.0254f;
        System.out.printf("%d inch is %.2f meters",n,s);
        
    }
}