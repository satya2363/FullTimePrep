import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class SubSets {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int[] nums={1,2,3};
		
			List <List<Integer>>mainList = new ArrayList<List<Integer>>();
		 
	        List<Integer> list = new ArrayList<Integer>();
	       
	        
	        HashSet<List<Integer>> set = new HashSet<List<Integer>>();
	        
	      
	        for(int j=0;j<nums.length;j++)
	            list.add(nums[j]);
	        
	        int k=0;
	        mainList.add(list);
	        set.add(list);
	        subSetList(mainList,list,set,k);
		    System.out.println("mainList"+ mainList);
		    System.out.println("set"+ set);

	}
	

//	private static void backtrack(List<List<Integer>> list , List<Integer> tempList, int [] nums, int start){
//		 System.out.print("temp");
//	    list.add(new ArrayList<>(tempList));
//	    System.out.print("temp");
//	    for(int i = start; i < nums.length; i++){
//	        tempList.add(nums[i]);
//	        System.out.print("temp");
//	        backtrack(list, tempList, nums, i + 1);
//	        tempList.remove(tempList.size() - 1);
//	        System.out.print("temp");
//	    }
//	}
	
	
//	private static List<Integer> printList(List<Integer> list,int i) {
//		
//		if(list.size() > 5)
//			return list;
//		
//		for(int j=i;j<3;j++) {
//			System.out.println("j==>"+j);
//			list.add(j);
//		 printList(list,j);
//		}
//		System.out.println("list steps"+list);
//		return list;
//	}

	private static void subSetList(List <List<Integer>> mainList,
            List <Integer> list,HashSet<List<Integer>> set, int j)  {
		
		System.out.println("List"+ list);
		 for(int i=0;i<list.size();i++) {
		       int a = list.get(i);
		        list.remove(i);
		        
		        List<Integer> tempList = new ArrayList<Integer>();
		        for(Integer number : list) {
					tempList.add(number);
				}
		       
		        
		   if(set.contains(list)) {
			   System.out.println("set has them");
		   }
		   else {
		        	mainList.add(tempList);
		        	set.add(tempList);
		   }
		       
		        list.add(i, a);
		       
		        }
		 
		 j = j+1;
		 if( !mainList.get(j).isEmpty()) {
			 subSetList(mainList,mainList.get(j),set,j);
		 }
		 
	}
			}
