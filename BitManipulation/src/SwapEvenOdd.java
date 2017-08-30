
public class SwapEvenOdd {

	
	public static void main(String[] args) {

		byte a = 5;
		byte b =  (byte) (~a|a); 
		String A = Integer.toBinaryString(a);
		String B = Integer.toBinaryString(b);
		System.out.println("A ==> "+ A);
		System.out.println("B(Result) ==> "+ B);
	}

}
