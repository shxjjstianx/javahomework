import java.util.Scanner;
import java.util.Random;

public class min
{
	public static int indexOfSmallestElement(double[] array)
	{
        double min=array[0];
        int index=0;
        for(int i=array.length-1;i>1;i--){
            if(array[i]<min){
                index=i;
            }
        }
        return index;
	}
	
	public static void main(String[] args) 
	{
        Scanner input=new Scanner(System.in);
        double[] array=new double[10];
        System.out.println("ÊäÈë10¸öÊı×Ö");
        for(int i=0;i<array.length;i++){
            array[i]=input.nextDouble();
        }
        System.out.println(indexOfSmallestElement(array));
	}
}
