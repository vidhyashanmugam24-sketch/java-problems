import java.util.Scanner;
public class Main
{   
    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int a[]=new int[n];
	    for(int i=0;i<n;i++){
	        a[i]=sc.nextInt();
	        
	    }
	    int pos=sc.nextInt();
	    left(a,pos);
    }
    

    public static void left(int a[],int pos){
	    for(int i=pos;i<a.length-1;i++){
	        a[i]=a[i+1];
	    }
	    
	    for(int i=0;i<a.length-1;i++){
	        System.out.print(a[i]+" ");
	    }
    }
    
    
    }

