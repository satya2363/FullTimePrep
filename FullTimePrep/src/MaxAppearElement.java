
public class MaxAppearElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,5,2,4,5,6,5,5,3};
		//ans must be 5 in this case
		// range must be 0 to n-1 (it's 0 to 6 where the length is 10)
		int	n= arr.length;
		for(int i=0;i<n;i++)
		{
			arr[arr[i]%n] += n;
		}
		int max=0;
		int maxIndex=-1;
		for(int i=0;i<n;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
				maxIndex=i;
			}
		}
		System.out.println(max);
		System.out.println(maxIndex);
		
	}

}
