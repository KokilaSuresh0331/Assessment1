package com.kokilas.day1;

import java.util.Scanner;

public class Program5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of arraya a:");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter array values:");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println("Enter size of arraya b:");
		int m = sc.nextInt();
		int b[] = new int[m];
		System.out.println("Enter array values:");
		for (int j = 0; j < m; j++) {
			b[j] = sc.nextInt();
		}
		int flag = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (b[i] == a[j]) {
                    flag++;
                    break;
                }
            }
        }

        
        if (flag == m) {
            System.out.println("b[] is a subset of a[]");
        } else {
            System.out.println("b[] is not a subset of a[]");
        }
    }
}