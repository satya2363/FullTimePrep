
public class LongestPalinSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String s = "abcdasdfghjkldcba";
		 boolean[][] result = new boolean[s.length()][s.length()];
	        
		 
//		 for(int i=0;i<s.length();i++)
//	        {
//			 result[i][i] = true;
//	        }
		 
	        for(int i=0;i<s.length();i++)
	        {
	            for(int j=0;j<s.length();j++)
	            {
	                if(s.charAt(i) == s.charAt(j) )
	                result[i][j] = true;
	                
	                else
	                result[i][j] = false;
	                
	            }
	        }

	        
	        
	        
	        
	        
	        
	        
	        
	       //****************************************************
	        
	        String sRes = "";
	        int k = s.length()-1;
	        int l = 0;
	        int m=0;
        	int n=s.length();
        	
        	while(m<n){
        		String tempRes="";
	        while(k>=m && l< n) {
        	
	        	
	        	if(result[k][l] == true)
	        	{
	        		tempRes = tempRes + s.charAt(k);
	        	}
	        	else 
	        		tempRes="";
	        	
	        	if(tempRes.length()>sRes.length())
	        		sRes = tempRes;
	        	
	        	k--;
	        	l++;
	        }
	        m++;
	        l=m;
	        k=s.length()-1;
        	}
	        
        	  //****************************************************
	        
        	
 	         k = 0;
 	        l = s.length()-1;
 	        m=0;
 	        n=s.length();
         	
         	while(m<n){
         		String tempRes="";
 	        while(l>=m && k< n) {
         	
 	        	
 	        	if(result[k][l] == true)
 	        	{
 	        		tempRes = tempRes + s.charAt(k);
 	        		
 	        	} else 
	        		tempRes="";
	        	
 	        	
 	        	if(tempRes.length()>sRes.length())
 	        		sRes = tempRes;
 	        	
 	        	
 	        	System.out.print(" "+result[k][l]);
 	        	k++;
 	        	l--;
 	        	
 	        	
 	        }
 	        k=0;
 	        n--;
 	        l=n-1;
 	       System.out.println();
         	}
        	
//	        while(k<s.length() && l>=0) {
//	        	
//	        	if(result[k][l] == true ) {
//	        		sRes = sRes + s.charAt(k);
//	        		k++;l--;
//	        	}
//	        	
//	        	else if(k+1<s.length() && result[k+1][l] == true ) {
//	        		k++;
//	        	}
//	        	
//	        	else {
//	        		l--;
//	        	}
//	        	
//	        }
//	        
	      System.out.println("Result ==>"+ sRes);
	        
	        for(int i=0;i<s.length();i++)
	        {
	            for(int j=0;j<s.length();j++)
	            {
	                System.out.print(" "+result[i][j]);
	                
	            }
	            System.out.println();
	        }
		
	}

}
