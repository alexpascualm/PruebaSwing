/**
 * 
 * @author alepa
 *
 */
public class Calculadora {
	/** 
	 * Calcula la suma de dos numeros que son pasados como parametros. 
	 * @param a :double -- sumando 1
	 * @param b :double -- el sumando 2
	 * @return  :double -- resultado 
	
	 */
	public double suma(double a, double b) {
		return a+b;
	}
	/** 
	 * Calcula la resta de dos numeros que son pasados como parametros. 
	 * @param a :double -- Número al que se le resta
	 * @param b :double -- Número restado
	 * @return  :double -- resultado
	
	 */
	public double resta(double a, double b) {
		return a-b;
	}
	/** 
	 * Calcula el producto de dos numeros que son pasados como parametros. 
	 * @param a :double -- 
	 * @param b :double -- 
	 * @return  :double -- Producto
	 
	 */
	public double mult(double a, double b) {
		return a*b;
	}
	/**
	 * Calcula el cociente de dos números reales
	 * @param a:double -- Dividendo
	 * @param b: double -- Divisor
	 * @return: double --Cociente
	 * @throws ArithmeticException if b==0) //Precondition
	 
	 */
	public double divide(double a, double b) {
		if (b==0) throw new ArithmeticException();
		return a/b;
	}
	/** 
	 * Calcula el factorial de un numero entero. 
	 * @param n :int -- Número
	 * @return  :int -- Factorial
	 * @throws IllegalArgumentException (if n<0) //precondition
	 * @throws IllegalArgumentException (if n>=14) //precondition
	 */
	public int fact(int numero) {
		if (numero<0 || numero>=14) throw new IllegalArgumentException();
		if (numero==0) {
			return 1;}
			else {
			return numero * fact(numero-1);}
	}
	/** 
	 * Determina si un numero es primo. 
	 * @param n :int -- Número
	 * @return  :boolean -- Resultado 
	 */
	public Boolean esPrimo(int n) {
		if(n<=0) return false;
		  for(int i=2;i<n;i++) {
		        if(n%i==0)
		            return false;
		    }
		    return true;
	}
	
}