import java.util.Scanner;

public class setToZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the rows of the matrix");
		int rows = sc.nextInt();
		System.out.println("Enter the columns of the matrix");
		int columns = sc.nextInt();
		int[][] matrix = new int[rows][columns];
		
		System.out.println("fill in the matrix");
		
		for(int i=0;i<rows;i++)
			for(int j=0;j<columns;j++)
			{
				matrix[i][j]=sc.nextInt();
			}
		
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++)
			{
				System.out.print(" "+matrix[i][j]);
			}
			System.out.println();
			}
		
			matrix = setZeros(matrix,rows,columns);
			
			System.out.println();
			
			for(int i=0;i<rows;i++){
				for(int j=0;j<columns;j++)
				{
					System.out.print(" "+matrix[i][j]);
				}
				System.out.println();
				}
			
	}
	
	
	

	private static int[][] setZeros(int[][] matrix, int rows, int columns) {
		// TODO Auto-generated method stub
		boolean[] rowpos= new boolean[rows];
		boolean[] colpos=new boolean[columns];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				if(matrix[i][j] == 0)
				{
					rowpos[i]=true;
					colpos[j]=true;
				}
			}
		}
		
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				if(rowpos[i] || colpos[j])
				{
					matrix[i][j]=0;
				}
			}
			
		}
		
		
		return matrix;
	}

}
