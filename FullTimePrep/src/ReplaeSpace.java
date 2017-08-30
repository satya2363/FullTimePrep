
public class ReplaeSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = " Mr John Smith  ";
		String resultS="";
		s= s.trim();
		
//		s.replaceAll("\\s", "%20");
//		System.out.println(s);
//		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			resultS = resultS + s.charAt(i);
			else
				resultS = resultS + "%20";
			
		}
		
		System.out.println(resultS);
		
		System.out.println(1<<19);
		

	}

}
