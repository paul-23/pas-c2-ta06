package tarea06;

import java.util.Scanner;

public class E05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		int num = sc.nextInt();
		sc.close();
		System.out.println(num + " en binario es " + calcularBinario(num));
	}

	public static String calcularBinario(int num) {
		String resultado = "", ceroUno = "";
		
		for (int i = num; i > 0; i /= 2) {
			if (i % 2 == 1) {
				ceroUno = "1";
			} else {
				ceroUno = "0";
			}
			resultado = ceroUno + resultado;
		}
		return resultado;
	}

}
