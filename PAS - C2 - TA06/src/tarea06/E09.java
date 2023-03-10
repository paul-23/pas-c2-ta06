package tarea06;

import java.util.Scanner;

public class E09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		int num = sc.nextInt();
		sc.close();

		int array[] = new int[num];
		rellenarArray(array);
		mostrarArray(array);
	}

	public static void rellenarArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			array[i] = ((int) (Math.random() * 10));
		}
	}

	public static void mostrarArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("|Posición " + i + "| = |" + array[i] + "|");
		}
	}

}
