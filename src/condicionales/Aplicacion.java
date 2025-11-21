package condicionales;

import java.util.Scanner;

public class Aplicacion {

	public Aplicacion() {
		mostrarMenu();
	}
	
	public void mostrarMenu() {
		//Declaro variables
		Scanner s=new Scanner(System.in);
		int opcion;
		//Muestro menú
		System.out.println("Introduce un número del 1 al 5:");
		System.out.println("1) Calcular el mayor de dos números.");
		System.out.println("2) Hace una cosa.");
		System.out.println("3) Hace una cosa.");
		System.out.println("4) Hace una cosa.");
		System.out.println("5) Hace una cosa.");
		//Pido por teclado la opción
		opcion=s.nextInt();
		//Evalúo la opción
		switch(opcion) {
		case 1: // Mayor entre dos números
			System.out.println("Introduce un número:");
			int a=s.nextInt();
			System.out.println("Introduce otro número:");
			int b=s.nextInt();
			int mayor=Calculadora.calcularMayor(a, b);
			System.out.println("El mayor número entre "+a+" y "+b+" es "+mayor);
			break;
		case 2: // Menor entre dos números
			System.out.println("Introduce un número:");
			a=s.nextInt();
			System.out.println("Introduce otro número:");
			b=s.nextInt();
			int menor=Calculadora.calcularMenor(a, b);
			System.out.println("Opción incorrecta.");
			break;
		default:
			System.out.println("Opción incorrecta.");
		}
		
	}
	
	public void mostrarMenuAntiguo() {
		System.out.println("Escoge una opción:");
		System.out.println("1) Introducir un mes (número entero) y mostrar su nombre.");
		System.out.println("2) Introducir un mes (número entero) y mostrar cuántos días tiene.");
		System.out.println("3) Introducir un mes (cadena, con la primera letra en mayúscula) y mostrar cuántos días tiene.");
		Scanner s=new Scanner(System.in);
		int opcionEscogida=s.nextInt();
		switch(opcionEscogida) {
		case 1:
			System.out.println("Introduce un número entre el 1 y el 12.");
			int mes=s.nextInt();
			System.out.println(Calculadora.getNombreMes(mes));
			break;
		case 2:
			System.out.println("Introduce un número entre el 1 y el 12.");
			mes=s.nextInt();
			String mesTexto=Calculadora.getNombreMes(mes);
			int diasMes=Calculadora.getDiasMes(mesTexto);
			System.out.println("El mes "+mes+" tiene "+diasMes+" días.");
			System.out.println(Calculadora.getDiasMes(mesTexto));
			break;
		case 3:
			System.out.println("Introduce un mes con la primera letra en mayúscula.");
			String nombreMes=s.next();
			diasMes=Calculadora.getDiasMes(nombreMes);
			System.out.println("El mes "+nombreMes+" tiene "+diasMes+" días.");
			break;
			default:
				System.out.println("Opción incorrecta");
		}
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