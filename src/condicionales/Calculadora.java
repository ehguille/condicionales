package condicionales;

public abstract class Calculadora {

	public static boolean esPositivo(int valor) {
		if (valor > 0)
			return true;
		else
			return false;
	}

	public static boolean esNegativo(int valor) {
		return valor < 0;
	}

	public static boolean esCero(int valor) {
		return valor == 0;
	}

	public static int calcularMayor(int a, int b) {
		// SI a>b
		// return a
		// si no,
		// return b
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

	public static boolean sonIguales(int a, int b) {
		if (a == b)
			return true;
		else
			return false;
	}

	public static int calcularMenor(int a, int b) {
		if (a < b)
			return a;
		else
			return b;
	}

	public static String esParOImpar(int a) {
		if (a % 2 == 0)
			return "Par";
		else
			return "Impar";
	}

	public static boolean esMultiploDeCinco(int a) {
		if (a % 5 == 0)
			return true;
		else
			return false;
		// Otra forma: return a%5==0
	}

	public static boolean esMultiploDeDiez(int a) {
		if (a % 10 == 0)
			return true;
		else
			return false;
	}

	public static boolean esDivisiblePorDosYPorTres(int a) {
		if (a % 2 == 0 && a % 3 == 0)
			return true;
		else
			return false;
	}

	public static int calcularMayor(int a, int b, int c) {
		/**
		 * Solución válida:
		 * 
		 * int mayorIntermedio=calcularMayor(a, b); return
		 * calcularMayor(mayorIntermedio, b);
		 */
		int valorIntermedio;
		int valorFinal;
		if(a>b)
			valorIntermedio=a;
		else
			valorIntermedio=b;
		if(valorIntermedio>c)
			valorFinal=valorIntermedio;
		else
			valorFinal=c;
		return valorFinal;
		
	}

	public static boolean esMayorDeEdad(int edad) {
		if (edad >= 18) // >17
			return true;
		else
			return false;
	}

	public static boolean esBisiesto(int anio) {
		if ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0)
			return true;
		else
			return false;
		/*
		 * if (anio % 4 == 0 && anio % 100 != 0) return true; else if (anio % 400 == 0)
		 * return true; else return false;
		 */
	}

	/**
	 * Recibe un número entre un 0 y un 10 y devuelve la calificación que le
	 * corresponde a cada número (por ejemplo: menor que cinco es "suspenso"; entre
	 * cinco y siete es "bien"; entre siete y nueve es "notable"; entre nueve y 10
	 * es "sobresaliente"; igual a 10 es "matrícula de honor".
	 * 
	 * @param calificacionNumerica Calificación
	 */
	public static String calificacionEscrita(int calificacionNumerica) {
		String calificacion = "pendiente!";

		return calificacion;
	}

	/**
	 * Método para comprobar si un número es divisible por otro.
	 * 
	 * @param a Dividendo
	 * @param b Divisor
	 * @return true si a%b==0;
	 */
	public static boolean esDivisible(int a, int b) {
		if (a % b == 0)
			return true;
		else
			return false;
		// return a%b==0;
	}

	public static String encasillar(int edad) {
		String resultado;
		if (edad < 0)
			resultado = "Persona no nacida.";
		else if (edad == 0)
			resultado = "Persona recién nacida.";
		else if (edad > 0 && edad < 10)
			resultado = "Persona de menos de 10 años.";
		else if (edad >= 10 && edad < 18)
			resultado = "Persona adolescente.";
		else
			resultado = "Persona mayor de edad";
		return resultado;
	}
}
