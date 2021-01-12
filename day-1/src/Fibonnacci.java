import java.util.Scanner;

public class Fibonnacci {

	public static void main(String[] a)
	{
		int f1=1,f2=1;
		int f3;
		int sum=f1+f2;
		System.out.println("Enter the number: ");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.print(f1+" "+f2+" ");
		for(int i=3;i<=n;i++)
		{
			f3=f1+f2;
			sum+=f3;
			System.out.print(f3+" ");
			f1=f2;
			f2=f3;
			
		}
		float avg=(sum/n);
		System.out.println("The average is: "+avg);
		s.close();
	}
}
