package pl.javastart.first;

import java.util.Scanner;

public class piate {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		double cena = in.nextDouble(), ilosc = in.nextDouble(), rata;

		if (cena < 100 || cena > 10000) {
			System.err.println("podaj cene z przedzialu 100-10000 !");
		} else if (ilosc < 6 || ilosc > 48) {
			System.err.println("podaj ilosc rat z przedzialu 6-48 !");
		} else {
			if (ilosc >= 6 && ilosc <= 12) {
				rata = (cena + (cena * 0.025)) / ilosc;
				System.out.println(rata);
			} else if (ilosc >= 13 && ilosc <= 24) {
				rata = (cena + (cena * 0.05)) / ilosc;
				System.out.println(rata);
			} else if (ilosc >= 25 && ilosc <= 48) {
				rata = (cena + (cena * 0.1)) / ilosc;
				System.out.println(rata);
			}
		}
	}

}

// Bartosz Mêdrek G14
