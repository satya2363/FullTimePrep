
public class StringCOmpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "aaabbcccccaaa";
		s1 = s1 + "\0";
		StringBuffer s2 = new StringBuffer();
		int count = 1;
		int i=0;
		int j=0;
		while(i<s1.length())
		{
			char chars1 = s1.charAt(i);
			//char chars2 = s2.charAt(j);
			if(i==0)
			{
				 s2.append(chars1);
				i++;
				
				
			}
			else if(chars1==s2.charAt(j))
			{
				count++;
				i++;
			}	
			
			else if(chars1!=s2.charAt(j))
			{
				s2.append(count);
				s2.append(chars1);
				j = j+2;
				count = 1;
				i++;
			}
		}
		
		if(s1.length()<s2.length())
			System.out.println(s1);
		else
		System.out.println(s2);

	}

}
