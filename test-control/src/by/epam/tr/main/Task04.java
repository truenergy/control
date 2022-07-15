package by.epam.tr.main;

public class Task04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] mas;
		mas = new int[] { 1, 9, 2, 3, 2, 5, 6, 2, 8, 9, 10, 19, 12 };

		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + ", ");
		}
		System.out.println("");
		Task04.array(mas);

	}

	/////////////////////////////////////////////////

	public static void array(int mas[]) {

		for (int i = 0; i < mas.length; i++) {
			int step = 1;
			int numer = mas[i];
			for (int j = 2; j < (numer); j++) {
				if (numer % j == 0) {
					step = 0;
				}
			}
			if (step == 1) {
				System.out.println("prostoe chislo = " + mas[i] + ", number element = " + i);
			}
		}
		return;
	}
	//////////////////////////////////////////////////

}
