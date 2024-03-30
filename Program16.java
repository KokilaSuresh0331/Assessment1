package com.kokilas.day1;

import java.util.Scanner;

public class Program16 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the seat number");
		int seatNo=sc.nextInt();
		 int seat = seatNo % 6;
	        if (seat== 1 || seat == 0)
	            System.out.println("Windows Seat");
	        else if (seat == 2 || seat == 5)
	            System.out.println("Middle Seat");
	        else
	            System.out.println("Aisle Seat");
		
	}

}
