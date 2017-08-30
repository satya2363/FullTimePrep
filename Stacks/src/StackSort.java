import java.util.Scanner;
import java.util.Stack;

//All corner cases are important

public class StackSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> stack = new Stack<Integer>();
		Stack<Integer> tempStack = new Stack<Integer>();
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println(" say push / exit");
		String value ="";
		while(sc.hasNext())
		{
			
			//Scanner sc = new Scanner(System.in);
				value = sc.nextLine();
			
			if(!value.equals("exit"))
			{
				
				if(value.equals("push"))
				{
				System.out.println("Enter elements to the stack for sorting");
				int item = sc.nextInt();
				stack.push(item);
				}
				System.out.println(" say push / exit");
					
			}
			else{
				System.out.println("You are done");
				break;
			}
					}
		
		System.out.println(stack);
		stack=sortStack(stack,tempStack);
		
		
		
		
	}

	private static Stack<Integer> sortStack(Stack<Integer> stack, Stack<Integer> tempStack) {
		// TODO Auto-generated method stub
		int temp;
		int stackLength = stack.size();
		System.out.println("stack length"+stackLength);
		temp = stack.pop();
		while(tempStack.size()!=stackLength) {
			
			//stack will be empty in many cases in between iterations
			// hence cannot be used as a condition here.
			if(tempStack.isEmpty())
			{
				tempStack.push(temp);
				temp = stack.pop();
			} else if(tempStack.peek()>temp) {

				stack.push(tempStack.pop());
				
			} else {
				tempStack.push(temp);
				//last iteration contains no element in stack all elements sorted descending tempStack
				// and temp contains one last element to be placed. Where the stack cannot pop anything.
				
				if(!stack.isEmpty())
				temp = stack.pop();
			}
		}
		
		System.out.println(tempStack);
		
		
		while(!tempStack.isEmpty()) {
			stack.push(tempStack.pop());
			
		}
		System.out.println(stack);
		return stack;
		
	}

}
