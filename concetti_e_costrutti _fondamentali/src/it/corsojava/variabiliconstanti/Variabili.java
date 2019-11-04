package it.corsojava.variabiliconstanti;

public class Variabili {
	public static void main(String[] args) {
		// dichiarazione e inizializzazione contestuale di alcune variabili
		int nr1 = 44, 
			nr2 = 55;
		String my_str = "Java is a great programming language!!!";

		// dichiarazione
		float 	fl1, 
				fl2;

		// inizializzazione
		fl1 = 33.33f;
		fl2 = 44.44f;
		
		double db = Math.sqrt(44.44); // method invocation expression
		int sum, 
			add1 = 10, 
			add2 = 20;
		sum = add1 + add2; // arithmetic expression o additive expression
		
		int a = 10;
        int b = 100;

        // le due istruzioni di output stampano i valori su un'unica linea, perché la prima
        // istruzione printf non va a capo
        System.out.printf("%d - %d - ", a, b); /* 10 - 100 - */

        int c = 1000;
        System.out.printf("%d%n", c); /* 1000 */
        // altre istruzioni
	}
}
