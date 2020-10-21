import java.util.Scanner;
public class rev {
	public static void reverse(int number) {
        int l = (number+" ").length()-1;
        for(int i=0;i<l;i++){
        	System.out.print(number%10);
        	number/=10;
        }
	}
	
	public static void main(String[] args) {
		System.out.println("ÊäÈëÕûÊı:");
		Scanner i = new Scanner(System.in);
		int num = i.nextInt();
		reverse(num);
	}

}
