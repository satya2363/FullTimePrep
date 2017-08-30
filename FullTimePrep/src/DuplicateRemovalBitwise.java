
public class DuplicateRemovalBitwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="subbu";
		boolean result = checkStrings(str);
		System.out.println(result);
//		System.out.println((1 << 18));
//		System.out.println((0 & (1 << 18)));
		int checker = 4;
		checker = checker | 1;
		System.out.println(checker); 	
	}
	
	

	private static boolean checkStrings(String str) {
		int checker = 0;
		for (int i=0; i < str.length(); i++) {
		 int val = str.charAt(i) - 'a';
		 //System.out.println((0 & (1 << 18)) > 0);
		//System.out.println("val--->"+val);
		
		if ((checker & (1 << val)) > 0)
		{
		return false;
		}
		 checker |= (1 << val);
		 }
		return true;
	}

	}


