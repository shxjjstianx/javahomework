import java.util.Scanner;
import java.util.Random;

public class digit
{
	public static void main(String[] args) 
	{
		int counts[]= {0,0,0,0,0,0,0,0,0,0};
		
		for(int i=0;i<100;i++)
		{
			int j = (int)(Math.random()*10);
			System.out.print(j+" ");
			counts[j]++;
		}
		//Scanner i = new Scanner(System.in);
		System.out.print("\n");
		for(int i=0;i<10;i++) System.out.print(counts[i]+" ");
	}
}
