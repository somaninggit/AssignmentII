import java.util.*;
public class QuestionI {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of an Array");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter elements of an Array");
		for (int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		boolean dup=false;
		System.out.println("Duplicate found at position");
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]==arr[i])
				{
					 dup=true;

//					 System.out.println("i");
					 System.out.println(i);
				}
			}
			
		}
	}

}
