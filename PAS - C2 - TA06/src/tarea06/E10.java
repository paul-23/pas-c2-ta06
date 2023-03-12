package tarea06;

import java.util.Scanner;

public class E10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el tamaño de la lista: ");
		int num = sc.nextInt();
		while (num <= 0) {
			System.out.print("Introduce un tamaño de la lista correcto: ");
			num = sc.nextInt();
		}
		System.out.print("Introduce el número mínimo aleatorio: ");
		int numMin = sc.nextInt();
		while (numMin <= 0) {
			System.out.print("Introduce el número mínimo aleatorio positivo: ");
			numMin = sc.nextInt();
		}

		System.out.print("Introduce el número máximo aleatorio: ");
		int numMax = sc.nextInt();

		while (numMax <= 0 && numMax < numMin) {
			System.out.print("Introduce el número máximo aleatorio positivo y mayor que el mínimo: ");
			numMax = sc.nextInt();
		}
		sc.close();

		int array[] = new int[num];

		rellenarArrayNumPrimos(array, numMin, numMax);

		System.out.println("\n---------- NÚMEROS PRIMOS ----------");
		mostrarArrayNumPrimos(array);

	}

	public static void rellenarArrayNumPrimos(int array[], int min, int max) {
		int recorrerLista = 0, numPrimo = 0;
		while (recorrerLista < array.length) {
			numPrimo = ((int)Math.floor(Math.random()*(min-max)+max));
			if (comprobarPrimo(numPrimo)) {
				array[recorrerLista] = numPrimo;
				recorrerLista++;
			}
		}
	}

	public static boolean comprobarPrimo(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void mostrarArrayNumPrimos(int array[]) {
		int numMayor = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "|");
			if (array[i] > numMayor) {
				numMayor = array[i];
			}
		}
		System.out.println("\n\n- NÚMERO MAYOR: " + numMayor);
	}

}
