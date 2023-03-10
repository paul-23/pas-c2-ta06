package tarea06;

import java.util.Scanner;

public class E04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		int num = sc.nextInt();
		sc.close();
		System.out.println("El resultado factorial de " + num + " es " + calcularFactorial(num));
	}

	public static int calcularFactorial(int num) {
		int numFactorial = num;
		for (int i = (num-1); i > 0; i--) {
			numFactorial = numFactorial*i;
		}
		return numFactorial;
	}

}
