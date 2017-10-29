package pl.javastart.first;

import java.util.Scanner;

public class czwarte {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		double dochod = in.nextDouble(), podatek;

		if (dochod < 85528) {
			podatek = (dochod * 0.18) - 556.02;
			System.out.println(podatek);
		} else if (dochod >= 85528) {
			podatek = 14839.02 + ((dochod - 85528) * 0.32);
			System.out.println(podatek);
		}

	}

}

// Bartosz Mêdrek G14