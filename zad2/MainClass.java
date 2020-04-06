package lab3zad2;

import java.util.Random;

public class MainClass {

	private Number[] numbers = new Number[100];

	public static void main(String[] args) {

		MainClass mainClass = new MainClass();
		mainClass.generate();
		mainClass.showArray();

		int sum = mainClass.sumArray();
		System.out.println("SUM:" + sum);

		double average = mainClass.arithmeticAverage(sum);
		System.out.println("A. AVERAGE: " + average);

		double gaverage = mainClass.geometricAverage();
		System.out.println("G. AVERAGE: " + gaverage);

		mainClass.changeOdd();

		System.out.println("After adding----------------------");
		mainClass.showArray();
	}

	private void generate() {
		Random generator = new Random();

		for (int i = 0; i < 100; i++) {
			numbers[i] = new Number(generator.nextInt(55 - 25) + 25);
		}
	}

	private void showArray() {
		for (Number n : numbers) {
			System.out.println(n.getNumber());
		}
	}

	private int sumArray() {
		int result = 0;

		for (Number n : numbers) {
			result += n.getNumber();
		}

		return result;
	}

	private double arithmeticAverage(int sum) {
		return sum / 100.0;
	}

	private double geometricAverage() {

		double result = 1;

		for (Number n : numbers) {

			double x = Math.pow(Math.E, Math.log(n.getNumber()) / 100.0);
			result = result * x;
		}

		return result;
	}

	private void changeOdd() {

		Random generator = new Random();

		for (Number n : numbers) {

			if (n.getNumber() % 2 != 0) {
				int valueToAdd = generator.nextInt(110 - 100) + 100;

				if (valueToAdd % 2 != 0) {
					valueToAdd += 1;
				}

				n.setNumber(n.getNumber() + valueToAdd);
			}
		}
	}
}
