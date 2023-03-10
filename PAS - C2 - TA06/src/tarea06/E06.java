package tarea06;

import java.util.Scanner;

public class E06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;

		do {
			System.out.print("Introduce un número: ");
			num = sc.nextInt();
		} while (num <= 0);

		sc.close();

		System.out.println(num + " contiene " + contador(num) + " cifras.");

	}

	public static int contador(int num) {
		int contador = 0;

		while (num != 0) {
			num = num / 10;
			contador++;
		}

		return contador;
	}

}
