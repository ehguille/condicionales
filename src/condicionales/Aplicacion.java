package condicionales;

import java.util.Scanner;

public class Aplicacion {

	public Aplicacion() {
		mostrarMenu();
	}
	
	public void mostrarMenu() {
		System.out.println("Escoge una opción:");
		System.out.println("1) Introducir un mes (número entero) y mostrar su nombre.");
		System.out.println("1) Introducir un mes (número entero) y mostrar cuántos días tiene.");
		Scanner s=new Scanner(System.in);
		int opcionEscogida=s.nextInt();
		switch(opcionEscogida) {
		case 1:
			System.out.println("Introduce un número entre el 1 y el 12.");
			int mes=s.nextInt();
			System.out.println(getNombreMes(mes));
			break;
		default:
			System.out.println("Opción incorrecta.");
		}
	}
	
	public int getDiasMes(String mes) {
		switch(mes) {
		case "Enero":
			return 31;
		case "Febrero":
			return 28;
		case "Marzo":
			return 31;
		case "Abril":
			return 30;
		case "Mayo":
			return 31;
		case "Junio":
			return 30;
		case "Julio":
			return 31;
		case "Agosto":
			return 31;
		case "Septiembre":
			return 30;
		case "Octubre":
			return 31;
		case "Noviembre":
			return 30;
		case "Diciembre":
			return 31;
		default: 
			return -1;
		}
	}
	
	public String getNombreMes(int mes) {
		switch(mes) {
		case 1:
			return "Enero";
		case 2:
			return "Febrero";
		case 3:
			return "Marzo";
		case 4:
			return "Abril";
		case 5:
			return "Mayo";
		case 6:
			return "Junio";
		case 7:
			return "Julio";
		case 8:
			return "Agosto";
		case 9:
			return "Septiembre";
		case 10:
			return "Octubre";
		case 11:
			return "Noviembre";
		case 12:
			return "Diciembre";
		default:
			return "Mes inexistente";
		}
	}
	
	public void imprimirNombreMes(int mes) {
		switch(mes) {
		case 1:
			System.out.println("El mes "+mes+" es enero.");
			break;
		case 2:
			System.out.println("El mes "+mes+" es febrero.");
			break;
		case 3:
			System.out.println("El mes "+mes+" es marzo.");
			break;
		case 4:
			System.out.println("El mes "+mes+" es abril.");
			break;
		case 5:
			System.out.println("El mes "+mes+" es mayo.");
			break;
		case 6:
			System.out.println("El mes "+mes+" es junio.");
			break;
		case 7:
			System.out.println("El mes "+mes+" es julio.");
			break;
		case 8:
			System.out.println("El mes "+mes+" es agosto.");
			break;
		case 9:
			System.out.println("El mes "+mes+" es septiembre.");
			break;
		case 10:
			System.out.println("El mes "+mes+" es octubre.");
			break;
		case 11:
			System.out.println("El mes "+mes+" es noviembre.");
			break;
		case 12:
			System.out.println("El mes "+mes+" es diciembre.");
			break;
		default:
			System.out.println("No existe el mes número "+mes);
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