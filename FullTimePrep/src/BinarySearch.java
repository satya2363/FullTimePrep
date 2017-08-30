import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		int[] arr  = {1,3,5,7,10,14,17,19};
		
		Scanner sc = new Scanner(System.in);
		
		int first = 0;
		int last = arr.length-1;
		int mid= -1;
		
		System.out.println("enter the element to be found");
		int s = sc.nextInt();
		
		while(first <= last)
		{
			mid = (first+last)/2;
			if(s == arr[mid])
			{
				System.out.println("Index-->"+ mid);
				break;
			}
			else if(s < arr[mid])
				last= mid-1;
			else 
				first = mid + 1;
		}
		
		if(s!= arr[mid])
		System.out.println("element not found");

	}

}
