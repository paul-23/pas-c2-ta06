package tarea06;

import java.util.Scanner;

public class E07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce la cantidad de euros: ");
		double euros = sc.nextDouble();
		System.out.print("Introduce a que moneda lo convertimos:\n1. Libras\n2. Dolares\n3. Yenes\nOpcion:");
		sc.nextLine();
		String moneda = sc.nextLine();
		sc.close();

		convertirMoneda(euros, moneda);

	}

	public static void convertirMoneda(double euros, String moneda) {
		switch (moneda.toLowerCase()) {
		case "1":
		case "libras":
			System.out.println(euros + "€ són " + (euros*0.86) + " Libras.");
			break;
		case "2":
		case "dolares":
			System.out.println(euros + "€ són " + (euros*1.28611) + " Dólares.");
			break;
		case "3":
		case "yenes":
			System.out.println(euros + "€ són " + (euros*129.852) + " Yenes.");
			break;

		default:
			System.out.println("Valores incorrectos.");
			break;
		}
	}

}
