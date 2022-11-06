import java.util.Scanner;

public class SelectionSort {
	  void selectionSort(int array[]) {
		    int size = array.length;

		    for (int step = 0; step < size - 1; step++) {
		      int min_idx = step;

		      for (int i = step + 1; i < size; i++) {

		        if (array[i] < array[min_idx]) {
		          min_idx = i;
		        }
		      }

		      
		      int temp = array[step];
		      array[step] = array[min_idx];
		      array[min_idx] = temp;
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
		SelectionSort ob =new SelectionSort();
		    ob.selectionSort(arr);

		    System.out.println("Sorted array:");
		    printArray(arr);
	}


	}


