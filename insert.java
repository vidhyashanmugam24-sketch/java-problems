import java.util.Scanner;
public class Main
{   
    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int a[]=new int[n+1];
	    for(int i=0;i<n;i++){
	        a[i]=sc.nextInt();
	    }
	    int pos=sc.nextInt();
	    int value=sc.nextInt();
	    left(a,n,pos,value);
    }
    public static void left(int a[],int n,int pos,int value){
	    for(int i=n;i>pos;i--){
	        a[i]=a[i-1];
	    }
	    a[pos]=value;
	    
	    for(int i=0;i<=n;i++){
	        System.out.print(a[i]+" ");
	    }
    }
    
    
    }

