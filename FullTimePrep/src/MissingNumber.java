
public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,4,5,7};
		int n = arr.length;
		
		int x=0;
		int y=0;
		for(int i=0;i<n;i++)
		{
			x = x^arr[i];
		}
		
		for(int i=1;i<=n+1;i++)
		{
			y = y^i;
			//System.out.println("y"+y);
		}
			
		
		System.out.println(x^y);
		
	}

}
