import java.util.Scanner;

public class StacksSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int stack[] = new int[12];
			
			int stackSize = 4;
			int stackPointer[] = new int[3];
			for(int k=0;k<stackPointer.length;k++)
			{
				stackPointer[k]=-1;
			}
				
			int stackP=0;
			String  value;
			int stackNumber = 0;
			value = " ";
			
	//		Scanner sc = new Scanner(System.in);
			
		while(!value.equals("exit")) {
			System.out.println();
			System.out.println("enter push/pop/popAt/exit");
			Scanner sc = new Scanner(System.in);
			value = sc.nextLine();
			
			if(value.equals("push")) {
				System.out.println("enter the value to push");
				int valueToPush = sc.nextInt();
				
				stack[stackP++] = valueToPush;
				stackPointer[stackNumber]++;
				
				//System.out.println("pointer"+stackPointer[i]);
				
				if((stackP+1)%stackSize == 0) {
					stackNumber++;
				}
			}
			
			else if(value.equals("pop"))
			{
				
				if(stackP == 0)
				{
					System.out.println("nothing  in this stack");
					
					break;
				
				}
				
				
				System.out.println(stack[--stackP]);	
				stackPointer[stackNumber]--;
				
			}
			
			else if(value.equals("popAt")) {
				System.out.println("enter the stack number");
				
				int specificPop=sc.nextInt();
				if(stackPointer[specificPop]== -1)
				{
					System.out.println("nothing  in this stack");
					
					break;
				
				}
				
				
				int index; 
			
					index= (specificPop * stackSize);
				
					
				
				System.out.println(stack[index + stackPointer[specificPop] ]);
				stackPointer[specificPop]--;
			}
		}
		
		for(int j=0;j<stack.length;j++)
		{
			System.out.print(" "+stack[j]);
		}
		
		System.out.println();
		
		for(int j=0;j<stackPointer.length;j++)
		{
			System.out.println( stackPointer[j]);
		}
		
	}

}
