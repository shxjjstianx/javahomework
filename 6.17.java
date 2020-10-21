import java.util.Scanner;
import java.util.Random;

public class matrix 
{
	public static void printMatrix(int n) 
	{
		for(int i=0; i<n; i++)
		{
			for (int j=0;j<n;j++) System.out.print((int)(Math.random()*2));
			System.out.print("\n");
		}
	}
	
	public static void main(String[] args) 
	{
		System.out.println("ÊäÈën:");
		Scanner i = new Scanner(System.in);
		int num = i.nextInt();
		printMatrix(num);
	}
}
