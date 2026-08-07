
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    
	    int a[]=new int[n];
	    for(int  i=0;i<n;i++){
	        a[i]=sc.nextInt();
	    }
	    int temp=a[0];
	    for(int i=0;i<a.length-1;i++){
	        a[i]=a[i+1];
	    }
	    a[n-1]=temp;
	    for(int i=0;i<a.length;i++){
	        System.out.print(a[i]+" ");
	    }
	    
	}
}