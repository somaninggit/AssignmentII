import java.util.Scanner;

class Subset{

	static boolean isSubset(int arr1[], int arr2[], int m,
							int n)
	{
		int i = 0;
		int j = 0;
		for (i = 0; i < n; i++) {
			for (j = 0; j < m; j++)
				if (arr2[i] == arr1[j])
					break;

			if (j == m)
				return false;
		}

	
		return true;
	}


	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of Ist array");
		int m=sc.nextInt();
		int[] arr1= new int[m];
		System.out.println("Enter size of IInd array");
		int n=sc.nextInt();
		int[] arr2= new int[n];
		System.out.println("Enter elements of Ist array");
		for(int i=0;i<n;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter elements of IInd array");
		for(int i=0;i<n;i++)
		{
			arr2[i]=sc.nextInt();
		}


		

		if (isSubset(arr1, arr2, m, n))
			System.out.print("arr2[] is "
							+ "subset of arr1[] ");
		else
			System.out.print("arr2[] is "
							+ "not a subset of arr1[]");
	}
}
