package by.epam.tr.main;

public class Task01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x;
		double y;
		x = 1.5;
		y = 3.5;

		double itog;

		itog = x + (Task01.num(x, y) / Task01.del(x, y));
		System.out.println("Itog = " + itog);

	}

	////////////////////////////////////////////////
	public static double num(double x, double y) {
		double num;
		num = Math.sin(x + y);
		num = 1 + Math.pow(num, 2);
		return num;
	}
	/////////////////////////////////////////////////

	public static double del(double x, double y) {
		double del;
		del = (x - 2 * x / (1 + x * x * y * y));
		if (del < 0) {
			del = -1 * del;
			del = 2 + del;
		} else {
			del = 2 + del;
		}
		return del;
	}
	//////////////////////////////////////////////////
}
