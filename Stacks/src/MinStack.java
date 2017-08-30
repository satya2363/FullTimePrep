import java.util.Scanner;
import java.util.Stack;

public class MinStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> stack = new Stack<Integer>();
		Stack<Integer> minStack = new Stack<Integer>();
	
//		Scanner sc  = new Scanner(System.in);
		
		
		String value = " ";
		while(!value.equals("exit")) {
			
			System.out.println("push/pop/min/exit");
			Scanner sc  = new Scanner(System.in);
			value = sc.nextLine();
			if(value.equals("push"))
				{
					System.out.println("Enter a value to push");
					
					int pushedVal = sc.nextInt();
					stack.push(pushedVal);
					if( minStack.empty() || minStack.peek() > pushedVal)
					{
						minStack.push(pushedVal);
					}
				}
			
			else if(value.equals("pop")) {
				int poppedVal = (int) stack.pop();
				if(minStack.peek() == poppedVal) {
					minStack.pop();
				}
				System.out.println(poppedVal);
			}
			
			else if(value.equals("min")) {
			
				int min = minStack.pop();
				System.out.println(min);
			}
			System.out.println("stack"+stack);
		}
	
		
		System.out.println(minStack);
	}

}
