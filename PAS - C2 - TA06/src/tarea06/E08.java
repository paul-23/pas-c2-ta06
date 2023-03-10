package tarea06;

import java.util.Scanner;

public class E08 {

	public static void main(String[] args) {
		int array[] = new int[10];
		rellenarValores(array);
		mostrarValores(array);
	}

	public static void rellenarValores(int array[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("------------- CREAR ARRAY -------------");
		
		for (int i = 0; i < array.length; i++) {
			System.out.print("Introduce el valor del número " + (i + 1) + ":");
			int num = sc.nextInt();
			array[i] = num;
		}
		sc.close();
	}

	public static void mostrarValores(int array[]) {
		System.out.println("\n\n------------- MOSTRAR ARRAY -------------");
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("El valor de la posición " + i + " es: " + array[i]);
		}
	}

}
