package tarea06;

import java.util.Scanner;

public class E11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el tamaño de la lista: ");
		int num = sc.nextInt();
		while (num <= 0) {
			System.out.print("Introduce un tamaño de la lista correcto: ");
			num = sc.nextInt();
		}
		sc.close();
		int array1[] = new int[num];
		int array2[] = new int[array1.length];
		int array3[] = new int[array1.length];

		generarArray(array1);
		array2 = array1;
		multiplicarArray(array1, array2, array3);
		
		System.out.print("\n----- ARRAY 1 -----\n|");
		mostrarArray(array1);
		
		System.out.print("\n\n----- ARRAY 2 -----\n|");
		mostrarArray(array2);
		
		System.out.print("\n\n----- ARRAY 1 * ARRAY 2 -----\n|");
		mostrarArray(array3);

	}

	public static void generarArray(int array1[]) {
		for (int i = 0; i < array1.length; i++) {
			array1[i] = (int) (Math.random() * 100+1);
		}
	}

	public static void mostrarArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "|");
		}
	}

	public static void multiplicarArray(int array1[], int array2[], int array3[]) {
		for (int i = 0; i < array1.length; i++) {
			array3[i]=array1[i]*array2[i];
		}
	}

}
