package project;

import java.util.Scanner;

public class rev {
 
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int num=scan.nextInt();
		int r=0;
		int a;
		while(num!=0)
		{
			a=num%10;
			r=r*10+a;
			num=num/10;
			
		}
		System.out.println("Reveresd number is: "+r);
	}

}
