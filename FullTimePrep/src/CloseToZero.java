import java.util.Arrays;

public class CloseToZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int positiveClosest=Integer.MAX_VALUE;
		 int negativeClosest=Integer.MIN_VALUE;
		 int positiveNumber1=0;
		 int positiveNumber2=0;
		 int negativeNumber1=0;
		 int negativeNumber2=0;
		 
		 int[]  arr = {1,60,-10,70,-80,85};
			
		 int i = 0;
		 int j = arr.length-1;
		 int temp=0;
		 
		 Arrays.sort(arr);			
		 
		while (i <= j)
		{
			temp = arr[i] +arr[j];
			
			if(temp == 0)
			{
				System.out.println(temp);
				System.out.println(arr[i]);
				System.out.println(arr[j]);
				break;
			}
			if(temp < 0)
			{
				if(temp > negativeClosest)
					{
						negativeClosest = temp;
						negativeNumber1 = arr[i];
						negativeNumber2 = arr[j];
						
					}
				j--;
			}
			else if(temp > 0) {
				if(temp < positiveClosest)
					{
						positiveClosest = temp;
						positiveNumber1 = arr[i];
						positiveNumber2 = arr[j];
						
					}
				
				i++;
			}
			
		}
		
		
		if(positiveClosest >= Math.abs(negativeClosest))
		{
			System.out.println(positiveClosest);
			System.out.println(positiveNumber1);
			System.out.println(positiveNumber2);
		}
		
		else
		{
			System.out.println(negativeClosest);
			System.out.println(negativeNumber1);
			System.out.println(negativeNumber2);
			
		}
			
			
	}
	
	private static void print(int[] arr){
		
		for(int i=0;i<arr.length-1;i++)
			System.out.println(arr[i]);
		
	}

}
