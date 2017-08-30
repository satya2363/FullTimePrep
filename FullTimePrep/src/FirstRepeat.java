import java.util.HashMap;

public class FirstRepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,5,4,5,6,5,5,3};
		
		 HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
		 
		 int n = arr.length;
		 
		 for(int i=0;i<n;i++) {
			 if(hmap.containsKey(arr[i])) {
				 hmap.put(arr[i], hmap.get(arr[i])+1);
			 }
			 else
			 {
				 hmap.put(arr[i],1);
			 }
		 }
		 
		 for(int i=0;i<n;i++)
		 {
			 if( hmap.containsKey(arr[i]) && hmap.get(arr[i]) > 1){
				 System.out.println(arr[i]);
				 break;
			 }
		 }
		 
		
	}

}
