package tarea06;

import java.util.Scanner;

public class E12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el tamaño de la lista: ");
		int num = sc.nextInt(), digitoFinal;
		while (num <= 0) {
			System.out.print("Introduce un tamaño de la lista correcto: ");
			num = sc.nextInt();
		}

		int array[] = new int[num];

		do {
			System.out.print("Introduce un dígito (0-9): ");
			digitoFinal = sc.nextInt();
		} while (digitoFinal < 0 && digitoFinal > 9);
		sc.close();

		generarArray(array);

		int arrayDigitoFinal[] = new int[array.length];

		comprobarUltimoDigito(array, arrayDigitoFinal, digitoFinal);

		System.out.print("\n\n------- LISTA DE NÚMEROS -------\n|");
		mostrarArray(array);

		System.out.print("\n\n------- LISTA DE NÚMEROS TERMINADOS EN " + digitoFinal + " -------\n|");
		mostrarArray(arrayDigitoFinal);

	}

	public static void generarArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 300 + 1);
		}
	}

	public static void comprobarUltimoDigito(int array[], int[] arrayDigitoFinal, int digitoFinal) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 10 == digitoFinal) {
				arrayDigitoFinal[i] = array[i];
			}
		}
	}

	public static void mostrarArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] != 0) {
				System.out.print(array[i] + "|");
			}
		}
	}

}
