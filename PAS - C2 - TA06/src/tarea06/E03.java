package tarea06;

import java.util.Scanner;

public class E03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		int num = sc.nextInt();
		sc.close();

		if (comprobarNumeros(num)) {
			System.out.println(num + " es un número primo.");
		} else {
			System.out.println(num + " no es un número primo.");
		}
	}

	public static boolean comprobarNumeros(int num) {
		boolean numPrimo = true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				numPrimo = false;
			}
		}
		return numPrimo;
	}

}
