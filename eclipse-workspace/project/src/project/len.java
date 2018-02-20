package project;

import java.util.Scanner;

public class len {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		long num=scan.nextLong();
		int count=0;
		while(num!=0)
		{
			num=num/10;
			count++;
		}
		
		System.out.println(count);
	
		

	}

}
