package project;

import java.util.Scanner;

public class fact {
	
	private static Scanner sc;

	public static void main(String[] args)
	{
		sc = new Scanner(System.in);
		int n=1;
		int num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			n=n*i;
		}
		System.out.println(n);
	}

}
