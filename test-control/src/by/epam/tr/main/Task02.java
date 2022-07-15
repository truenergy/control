package by.epam.tr.main;

import java.util.Random;
import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc;
		int a;

		sc = new Scanner(System.in);
		System.out.println("Vvedite kolichestvo a");
		System.out.print(">");

		a = sc.nextInt();
		int[] ar = new int[a];
		Random rand = new Random();

		for (int i = 0; i < ar.length; i++) {
			ar[i] = rand.nextInt(50);
		}

		Task02.method(ar);
		Task02.sum(ar);
	}

	/////////////////////////////////////////////////////////////////////////
	public static void method(int array[]) {

		for (int i = 0; i < array.length; i++) {
			System.out.println("arr[" + i + "]= " + array[i] + "; ");
		}
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if ((array[i] > 15) || (array[i] < 2)) {
				count = count + 1;
			}
		}
		System.out.println("Number = " + count + "raz");

		return;
	}
	///////////////////////////////////////////////////////////////////////////

	public static void sum(int array[]) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 5 == 4) {
				sum = sum + array[i];
			}
		}
		System.out.println("Sum = " + sum);
		return;
	}
	/////////////////////////////////////////////////////////////////////////
}
