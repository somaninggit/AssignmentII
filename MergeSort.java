import java.util.*;
public class MergeSort {
	void mergesort(int[] arr,int l,int h)
	{
		
		if(l<h)
		{
			int m=(l+h)/2;
			mergesort(arr,l,m);
			mergesort(arr,m+1,h);
			merge(arr,l,m,h);
		}
	}

	void merge(int arr[], int l, int m, int h) 
	{
		int n1=m+1-l;
		int n2=h-m;
		int[] A=new int[n1];
		int[] B=new int[n1];
		for(int i=0;i<n1;i++)
		{
			A[i]=arr[l+i];
		}
		for(int j=0;j<n2;j++)
		{
			B[j]=arr[m+1+j];
		}
		int i,j,k;
		i=0;
		j=0;
		k=l;
		while(i<n1 && j<n2)
		{
			if(A[i] <=B[j])
			{
				arr[k]=A[i];
				i++;
				
			}
			else
			{
				arr[k]=B[j];
				j++;
				
			}
			k++;
		}
		while(i<n1)
		{
			arr[k]=A[i];
			i++;
			k++;
		}
		while(j<n2)
		{
			arr[k]=B[j];
			j++;
			k++;
		}
		
	}
 static void printArray(int arr[])
 {
	 int n=arr.length;
	 for(int i=0;i<n;i++)
	 {
		 System.out.print(" "+arr[i]+" ");
	 }
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array");
		int n=sc.nextInt();
		int[] arr= new int[n];
		System.out.println("Enter elements to be sorted");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		   MergeSort ob = new MergeSort();
		    ob.mergesort(arr, 0,n-1);

		    System.out.println("Sorted array:");
		    printArray(arr);
	}

}
