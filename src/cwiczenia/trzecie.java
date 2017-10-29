package pl.javastart.first;

import java.util.Scanner;

public class trzecie {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		double waga = in.nextDouble(), wzrost = in.nextDouble(), bmi;

		bmi = waga / (wzrost * wzrost);
		System.out.println(bmi);

		if (bmi > 18.5 && bmi < 24.9) {
			System.out.println("waga prawidlowa");
		} else if (bmi < 18.5) {
			System.out.println("niedowaga");
		} else if (bmi > 24.9) {
			System.out.println("nadwaga");

		}

	}

}

// Bartosz Mêdrek G14