import java.util.Scanner;

public class Rotate90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the rows of the image");
		int rows = sc.nextInt();
		System.out.println("Enter the columns of the image");
		int columns = sc.nextInt();
		int[][] image = new int[rows][columns];
		
		System.out.println("fill in the matrix");
		
		for(int i=0;i<rows;i++)
			for(int j=0;j<columns;j++)
			{
				image[i][j]=sc.nextInt();
			}
		
		image = transposeImage(image,rows,columns);

		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++)
			{
				System.out.print(" "+image[i][j]);
			}
			System.out.println();
			}
		
		image = mirror(image,rows,columns);
		System.out.println();
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++)
			{
				System.out.print(" "+image[i][j]);
			}
			System.out.println();
			}
		
		
	}

	private static int[][] mirror(int[][] image, int rows, int columns) {
		// TODO Auto-generated method stub
		int temp = 0;
		for(int i=0;i<rows;i++)
		{
			for(int j=1;j<columns;j++)
			{
				for(int k=1;k<=columns-j;k++){
				
					temp = image[i][k-1];
					image[i][k-1]=image[i][k];
					image[i][k] = temp;
				}
				
			}
			
		}
		
		return image;
		
	}

	private static int[][] transposeImage(int[][] image, int rows, int columns) {
		// TODO Auto-generated method stub
		int temp =0;
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				if(j<i){
					temp = image[i][j];
					image[i][j]=image[j][i];
					image[j][i] = temp;
				}
			}
			
		}
		
		return image;
	}

	

}
