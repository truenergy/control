package by.epam.tr.main;

public class Task03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a;
		double b;
		double h;
		double y;

		a = 1.0;
		b = 8.2;
		h = 1;

		System.out.println("---------------------------------");
		System.out.printf("|\t%4s\t|\t%4s\t|\n", "x", "y");
		System.out.println("---------------------------------");

		for (double x = a; x <= b; x = x + h) {
			y = Math.tan(x);
			System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n", x, y);
		}

		System.out.println("---------------------------------");

	}
}
