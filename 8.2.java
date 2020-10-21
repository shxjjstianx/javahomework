import java.util.Scanner;
import java.util.Random;

public class sum
{
	public static double sumMajorDiagonal(double [][] m)
	{
		double sum=0;
		for(int i=0;i<4;i++)
		{
			sum+=m[i][i];
		}
		return sum;
	}
	
	public static void main(String[] args) 
	{
		double[][] list=new double[4][4];
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++) 
				{
					Scanner input=new Scanner(System.in);
					list[i][j]=input.nextDouble();
				}
		}
		System.out.println("Sum of the elements in the major diagonal is "+sumMajorDiagonal(list));
	}
}
