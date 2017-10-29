package pl.javastart.first;

import java.util.Scanner;

public class Pierwsze {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		double temperatura = in.nextDouble(), koncowa;

		koncowa = (temperatura * 1.8) + 32;

		System.out.print(koncowa);

	}

}

// Bartosz Mêdrek G14