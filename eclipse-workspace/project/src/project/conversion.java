package project;
import java.util.Scanner;
public class conversion {

	public static void main(String[] args) {
	
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int rem;
		int a=0;
		while(num!=0)
		{
			rem=num%2;
			a=a*10+rem;
			num=num/2;
			
		}
		System.out.println(a);
	}
	

}
