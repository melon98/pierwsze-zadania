package pl.javastart.first;

import java.util.Scanner;

public class drugie {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int x = in.nextInt(), y = in.nextInt(), z = in.nextInt();

		if (x >= y && y >= z) {
			System.out.println("najwieksza liczba jest");
			System.out.println(x);
			System.out.println("najmniejsza liczba jest");
			System.out.println(z);
		} else if (x >= z && z >= y) {
			System.out.println("najwieksza liczba jest");
			System.out.println(x);
			System.out.println("najmniejsza liczba jest");
			System.out.println(y);
		} else if (y >= z && z >= x) {
			System.out.println("najwieksza liczba jest");
			System.out.println(y);
			System.out.println("najmniejsza liczba jest");
			System.out.println(x);
		} else if (y >= x && x >= z) {
			System.out.println("najwieksza liczba jest");
			System.out.println(y);
			System.out.println("najmniejsza liczba jest");
			System.out.println(z);
		} else if (z >= x && x >= y) {
			System.out.println("najwieksza liczba jest");
			System.out.println(z);
			System.out.println("najmniejsza liczba jest");
			System.out.println(y);
		} else if (z >= y && y >= x) {
			System.out.println("najwieksza liczba jest");
			System.out.println(z);
			System.out.println("najmniejsza liczba jest");
			System.out.println(x);
		}

	}

}

// Bartosz Mêdrek G14