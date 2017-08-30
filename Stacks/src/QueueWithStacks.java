import java.util.Scanner;
import java.util.Stack;

public class QueueWithStacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> stack1 = new Stack<Integer>();
		Stack<Integer> stack2 = new Stack<Integer>();
		
		Scanner sc = new Scanner(System.in);
		String value="";
		System.out.println("enter push/pop/exit since we implement this queue with a stack");
		while(sc.hasNext()) {
			
			value = sc.nextLine();
			
			if(value.equals("push")){
				System.out.println("enter value to put in the queue");
				int item = sc.nextInt();
				stack1.push(item);
			}
			else if(value.equals("pop")) {
				if(stack2.isEmpty())
				{
					while(!stack1.isEmpty())
					stack2.push(stack1.pop());
					
					int frontQueueElement = stack2.pop();
					System.out.println(frontQueueElement);
				}
				else {
					int frontQueueElement = stack2.pop();
					System.out.println(frontQueueElement);
				}
			}
			else if(value.equals("exit")) {
				break;
			}
			
			System.out.println("enter push/pop/exit");
		}
		
		System.out.println("Rear Queue"+stack1);
		System.out.println("Front Queue"+stack2);

	}

}
