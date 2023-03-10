package tarea06;
import java.util.Scanner;

public class E01 {

	public static void main(String[] args) {
		opcion();
	}

	public static void opcion() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Selecciona a que figura quieres calcular el Área:\n1.Circulo\n2.Triangulo\n3.Cuadrado");
		System.out.print("Opción: ");
		int opcion = sc.nextInt();

		switch (opcion) {
		case 1:
			System.out.print("Introduce el radio del circulo(cm): ");
			double radio = sc.nextDouble();
			System.out.println("El área del circulo es: " + areaCirculo(radio) + " cm2.");
			break;
		case 2:
			System.out.print("Introduce la base del triangulo(cm): ");
			double base = sc.nextDouble();
			System.out.print("Introduce la altura del triangulo(cm): ");
			double altura = sc.nextDouble();
			System.out.println("El área del triangulo es: " + areaTriangulo(base, altura) + " cm2.");
			break;
		case 3:
			System.out.print("Introduce un lado del cuadrado(cm): ");
			double lado = sc.nextDouble();
			System.out.println("El área del cuadrado es: " + areaCuadrado(lado) + " cm2.");
			break;

		default:
			System.out.println("Opción Incorrecta");
			break;
		}
		sc.close();
	}

	public static double areaCirculo(double radio) {
		double aCirculo = (Math.pow(radio, 2)) * (Math.PI);
		return aCirculo;
	}

	public static double areaTriangulo(double base, double altura) {
		double aTriangulo = (base * altura) / 2;
		return aTriangulo;
	}

	public static double areaCuadrado(double lado) {
		double aCuadrado = lado * lado;
		return aCuadrado;
	}

}
