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
	
	public static int calcularMenor(int a, int b, int c) {
		int resultado=0;
		if(a<b)
			resultado=a;
		else
			resultado=b;
		if(resultado>c)
			resultado=c;
		return resultado;
	}
	
	public static boolean entreCeroYDiez(int a) {
		if(a>=0&&a<=10)
			return true;
		else
			return false;
	}
	
	public static boolean fueraRangoDiezVeinte(int a) {
		if(a<10 || a>20)
			return true;
		else
			return false;
	}
	
	/**
	 * Comprueba si un valor pertenece al rango (x,y)
	 * @param a Valor a comprobar
	 * @param x Límite inferior
	 * @param y Límite superior
	 * @return True si pertenece al rango
	 */
	public static boolean perteneceRango(int a, int x, int y) {
		if(a>x&&a<y)
			return true;
		else
			return false;
	}
	
	public static boolean entreDiezVeinteOTreintaCuarenta(int a) {
		if(perteneceRango(a,10,20)||perteneceRango(a,30,40))
			return true;
		else
			return false;
	}
	
	public static boolean esMayorDeEdad(int edad) {
		if (edad >= 18) // >17
			return true;
		else
			return false;
	}
	
	public static void puedeEntrarDiscoteca(int edad) {
		if(esMayorDeEdad(edad))
			System.out.println("Puede entrar en la discoteca.");
		else
			System.out.println("No puede entrar en la discoteca.");
	}
	
	public static boolean esVocalMinuscula(char caracter) {
		if(caracter=='a'||caracter=='e'||caracter=='i'||caracter=='o'||caracter=='u')
			return true;
		else
			return false;
	}
	
	public static boolean esConsonanteMinuscula(char caracter) {
		if(Character.isLowerCase(caracter)&&!esVocalMinuscula(caracter))
			return true;
		else
			return false;
	}
	
	public static void informarTemperatura(int grados) {
		if(grados<=10)
			System.out.println("Hace frío.");
		else if(grados>10 && grados <=25)
			System.out.println("Temperatura templada.");
		else
			System.out.println("Hace calor.");
	}
	
	//Pedir una contraseña e indicar si coincide con una clave predefinida.
	public static boolean checkPassword(String password) {
		String passwordPredefinida="hola";
		if(passwordPredefinida==password)
			return true;
		else
			return false;
	}
	
	//Pedir el nombre de usuario y contraseña y verificar si ambos son correctos.
	public static boolean checkUserPassword(String user, String password) {
		String userPredefinido="admin";
		String passwordPredefinido="password";
		if(user==userPredefinido&&password==passwordPredefinido)
			return true;
		else
			return false;
	}
	
	//Pedir un número e indicar si es positivo y par al mismo tiempo.
	public static boolean esParPositivo(int a) {
		if(Calculadora.esPositivo(a)&&a%2==0)
			return true;
		else
			return false;
	}
	
	//Pedir un número e indicar si es negativo o impar.
	public static boolean esNegativoOImpar(int a) {
		if(Calculadora.esNegativo(a)||a%2!=0)
			return true;
		else
			return false;
	}
	
	//Pedir dos números e indicar si ambos son positivos, ambos negativos o de signo distinto.
	public static void comprobacionMultiple(int a, int b) {
		if(a>0&&b>0)
			System.out.println("Ambos son positivos");
		if(a<0&&b<0)
			System.out.println("Ambos son negativos");
		if(a>0&&b<00||a<0&&b>0)
			System.out.println("Tienen signo distinto");
		else
			System.out.println("Al menos uno de los dos valores es cero");
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
	
	
	public static int getDiasMes(int mes) {
		switch(mes) {
		case 1:
			return 31;
		case 2:
			return 28;
		case 3:
			return 31;
		case 4:
			return 30;
		case 5:
			return 31;
		case 6:
			return 30;
		case 7:
			return 31;
		case 8:
			return 31;
		case 9:
			return 30;
		case 10:
			return 31;
		case 11:
			return 30;
		case 12:
			return 31;
		default: 
			return -1;
		}	
	}
	
	public static int getDiasMes(String mes) {
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
	
	public static String getNombreMes(int mes) {
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
	
	public static void imprimirNombreMes(int mes) {
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

}
