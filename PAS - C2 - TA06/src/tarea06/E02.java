package tarea06;

import java.util.Scanner;

public class E02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce la cantidad de números a generar: ");
		int cantidad = sc.nextInt();
		System.out.print("Introduce el número mínimo: ");
		int numMin = sc.nextInt();
		System.out.print("Introduce el número máximo: ");
		int numMax = sc.nextInt();
		sc.close();

		for (int i = 0; i < cantidad; i++) {
			System.out.println(numerosAleatorios(numMin, numMax));
		}
	}

	public static int numerosAleatorios(int numMin, int numMax) {
		int num = (int) (Math.random() * (numMax - numMin) + numMin);
		return num;
	}

}
