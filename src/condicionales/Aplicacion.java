package condicionales;

import java.util.Scanner;

public class Aplicacion {

	public Aplicacion() {
		System.out.println(Calculadora.checkPassword("hola"));
	}

	/**
	 * Cálculos básicos con números.
	 */
	public void primerEjemplo() {
		int a = 20;
		int b = 900;
		int c = 10;
		int resultado1 = Calculadora.calcularMayor(a, b);
		int resultado2 = Calculadora.calcularMayor(resultado1, c);
		System.out.println(resultado2);
		System.out.println(Calculadora.encasillar(10));
	}

	/**
	 * Primer menú
	 */
	public void segundoEjemplo() {
		Scanner s = new Scanner(System.in);
		int opcion, a, b, resultado;

		System.out.println("¡Hola!");
		System.out.println("Escoge una opción:");
		System.out.println("1. Sumar dos números enteros");
		System.out.println("2. Restar dos números enteros");
		System.out.println("3. Multiplicar dos números enteros");
		System.out.println("4. Dividir dos números enteros");
		System.out.print("Introduce un número:");
		opcion = s.nextInt();

		if (opcion < 1 || opcion > 4)
			System.out.println("Opción incorrecta.");
		else {
			System.out.println("Has escogido la opción " + opcion);
			System.out.print("Introduce el primer valor:");
			a = s.nextInt();
			System.out.print("Introduce el segundo valor:");
			b = s.nextInt();
			if (opcion == 1) {
				resultado = a + b;
				System.out.println("Resultado de " + a + "+" + b + "=" + (a + b));
			} else if (opcion == 2) {
				resultado = a - b;
				System.out.println("Resultado de " + a + "-" + b + "=" + (a - b));
			} else if (opcion == 3) {
				resultado = a * b;
				System.out.println("Resultado de " + a + "*" + b + "=" + (a * b));
			} else if (opcion == 4) {
				if (b == 0)
					System.out.println("No es posible dividir por cero.");
				else {
					resultado = a / b;
					System.out.println("Resultado de " + a + "/" + b + "=" + (a / b));
				}
			}
		}
	}

	public static void main(String[] args) {
		Aplicacion a = new Aplicacion();

	}
}