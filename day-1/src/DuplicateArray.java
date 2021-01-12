
public class DuplicateArray {
	
	public static int[] copyOf(int[] s) {
		int[] c=new int[s.length];
		for(int i=0;i<s.length;i++)
		{
			c[i]=s[i];
		}
		return c;
	}

	public static void main(String[] a)
	{
		int[] s= {1,2,3,4,5,6};
		System.out.println("The copy of thr given array is: ");
		int[] b=copyOf(s);
		for(int d:b)
		{
			System.out.print(d+" ");
		}
	}

	
}
