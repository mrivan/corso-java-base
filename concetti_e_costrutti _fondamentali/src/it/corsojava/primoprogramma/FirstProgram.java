package it.corsojava.primoprogramma;


/**
 * 
 * @author I.Verzilli
 *
 * Si puo vedere i diversi modi di commentare //  oppure /*
 * Il metodo printf, definito nella classe PrintStream, consente di scrivere (visualizzare) una stringa formattata nel corrente stream di output.
 * public PrintStream printf(String format, Object... args), che consente, di fatto, di specificare i seguenti argomenti.
 * Come primo argomento, un letterale stringa definito come stringa di formato (format string).
 * %d � il segnaposto per l�argomento 
 * %n indica semplicemente il separatore di riga della specifica piattaforma.
 */
public class FirstProgram {
	
	private static int counter = 10;
	private static final int multiplicand = 10;
	private static final int multiplier = 20;

	public static void main(String[] args) {
		
		// dichiarazione e inizializzazione contestuale
		// di pi� variabili di diverso tipo
		String text_1 = "Primo programma in Java:", 
			   text_2 = " Buon divertimento!";
		int a = 10, 
		    b = 20;

		float f; // dichiarazione
		f = 44.5f; // inizializzazione

		// stampa qualcosa...
		System.out.printf("%s%s%n", text_1, text_2);
		System.out.printf("Stamper� un test condizionale tra a=%d e b=%d%n", a, b);

		if (a < b){ // se a < b stampa quello che segue...

			System.out.print("a < b VERO!");
		
		} else{ /* altrimenti stampa quest'altra stringa */

			System.out.print("a > b VERO!");
		}

		System.out.print("\nStamper� un ciclo iterativo, dove legger� ");
		System.out.println("per 10 volte il valore di a");

		/*
		 * ciclo for
		 */
		for (int i = 0; i < counter; i++) {
			System.out.printf("Passo %d ", i);
			System.out.printf("--> a=%d%n", a);
		}
		/*
		 * // esecuzione della moltiplicazione
		 */
		System.out.printf("Ora eseguir� una moltiplicazione tra %d e %d%n", multiplicand, multiplier);

		int res = mult(multiplicand, multiplier); // invocazione di un metodo
		
		System.out.printf("Il risultato di %d x %d �: %d%n", multiplicand, multiplier, res);
	}

	/****************************************
	 * Metodo: mult * Scopo: moltiplicazione di due valori * Parametri: a, b -> int
	 * * Restituisce: int *
	 ****************************************/
	private static int mult(int a, int b) {
		return a * b;
	}
}
