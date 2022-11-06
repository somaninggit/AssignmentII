import java.util.Arrays;
import java.util.*;
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array");
		int m=sc.nextInt();
		int[] arr=new int[m];
		System.out.println("enter elements of an array");
		for(int i=0;i<m;i++)
		{
			arr[i]=sc.nextInt();
		}
		boolean swapped=false;
		for(int i=0;i<m-1;i++)
		{
			for(int j=0;j<m-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swapped =true;
				}
			}
			if(swapped==false)
				break;
		}
		for(int i=0;i<m;i++)
		{
			System.out.println(arr[i]);
		}
	}

	}


