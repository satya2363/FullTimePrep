import java.util.Scanner;

public class StacksWithArray {
	
	
	 	static int stackSize = 3;
	 	static int[] arr = new int[3*stackSize];
	 	static int[] stackPointer = {0,0,0};
		static String  value;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		value = " ";
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("enter push/pop/exit");
		
		while(sc.hasNext())
		{
			
			//Scanner sc = new Scanner(System.in);
				value = sc.nextLine();
			
			if(!value.equals("exit"))
			{
			System.out.println(value);
				if( value.equals("push")) {
					System.out.println("enter a value");
					int n = sc.nextInt();
					System.out.println("enter stack number 0/1/2");
					int snum = sc.nextInt();
					push(n,snum);
				}
				else if(value.equals("pop")) {
					System.out.println("enter stack number 0/1/2");
					int snum = sc.nextInt();
					pop(snum);
		
				}
			}
			
			else {
			
				break;
			}
			
		for(int i=0;i<arr.length;i++)
		System.out.print(" "+arr[i]);
		
		System.out.println();
		System.out.println("enter push/pop/exit");

	}
		
	}
	
	private static void push(int n,int snum) {
		
		//if the first stack is filled 
		if (snum == 0 && stackPointer[snum]>= stackSize) {
			System.out.println(stackPointer[snum]);
			snum++;
		}
		//if the remaining stacks are filled
		else if(stackPointer[snum]> (snum*stackSize) && snum!=0) {
			System.out.println("in else if"+ stackPointer[snum]);
			snum++;
		}
		
		int index = snum * stackSize + stackPointer[snum];
		stackPointer[snum]++;
		arr[index] = n;	
	}

	private static void pop(int snum) {
		int poppedValue;
		poppedValue = stackPointer[snum];
		System.out.println(poppedValue);
		stackPointer[snum]--;
	}

}
