
public class ConvertAtoB {

	

	public static void main(String[] args) {
		
		int a = 2;
		int b = 2;
		int flag=0;
		byte c;
		
		c = (byte) (a ^ b);
		String result;
		String A = Integer.toBinaryString(a);
		String B = Integer.toBinaryString(b);
		result = Integer.toBinaryString(c);
		System.out.println("A ==> "+A);
		System.out.println("B ==> "+B);
		System.out.println("result ==> "+result);
		
		for(int i=0;i<result.length();i++) {
			if(result.charAt(i)=='1') {
				flag++;
			}
		}
		
		System.out.println("bits to be changed==> " + flag);
	}

}
