package lab3zad1;

public class MyApp {

	public static void main(String[] args) {

		MyNumber myNumber = new MyNumber(5);
		MyNumber myNumberForPow = new MyNumber(2);
		MyNumber myNumberForAdd = new MyNumber(11);
		MyNumber myNumberForSubtract = new MyNumber(4);

		System.out.println("Twoja liczba:" + myNumber.getNumber());

		System.out.println("Czy liczba jest nieparzysta?");
		System.out.println(myNumber.isOdd());

		System.out.println("Czy liczba jest parzysta?");
		System.out.println(myNumber.isEven());

		System.out.println("Pierwiastek z liczby:");
		System.out.println(myNumber.sqrt());

		System.out.println("Twoja liczba do potegi " + myNumberForPow.getNumber());
		System.out.println(myNumber.pow(myNumberForPow));

		System.out.println("Twoja liczba + " + myNumberForAdd.getNumber());
		System.out.println(myNumber.add(myNumberForAdd).getNumber());

		System.out.println("Twoja liczba - " + myNumberForSubtract.getNumber());
		System.out.println(myNumber.subtract(myNumberForSubtract).getNumber());

	}

}
