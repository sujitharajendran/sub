package guviproject;
import java.util.*;
public class newpro {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int[] d=new int[n];
		int k[]=new int[n];
	int sum;
		int count=0;
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++){

				d[i]=a[i]-a[i+1];
						
sum=Math.abs(d[i]);
System.out.println("the sum of number"+sum);
k[i]=sum;
Arrays.sort(k);
		}
		
		System.out.println(k[k.length-1]);


			
		}
		
	}


/*5
2
3
4
2
3*/