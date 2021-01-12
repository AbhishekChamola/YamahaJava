import java.util.Scanner;

public class GradesAverage {
	
	public static void main(String[] a)
	{
		int n;
		System.out.println("Enter the number of students: ");
		Scanner obj = new Scanner(System.in);
		n=obj.nextInt();
		int[] grades=new int[n];
		int sum=0;
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the grade for student "+(i+1));
			grades[i]=obj.nextInt();
			if(grades[i]<1 || grades[i]>100)
			{
				System.out.println("Invalid grade, try again...");
				grades[i]=obj.nextInt();
			}
			
			sum+=grades[i];
		}
		float avg=(sum/n);
		System.out.println("The average is: "+avg);
		
	}
}
