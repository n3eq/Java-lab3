package lab3zad1;

public class MyNumber {

	private int number;

	public MyNumber(int number) {
		this.number = number;
	}

	public int getNumber() {
		return this.number;
	}

	public boolean isOdd() {
		return number % 2 != 0;
	}

	public boolean isEven() {
		return number % 2 == 0;
	}

	public double sqrt() {
		return Math.sqrt(number);
	}

	public int pow(MyNumber x) {
		int pow = x.number;
		return (int) Math.pow(number, pow);
	}

	public MyNumber add(MyNumber x) {
		int result = this.number + x.number;
		MyNumber myNumber = new MyNumber(result);
		return myNumber;
	}

	public MyNumber subtract(MyNumber x) {
		int result = this.number - x.number;
		MyNumber myNumber = new MyNumber(result);
		return myNumber;
	}
}
