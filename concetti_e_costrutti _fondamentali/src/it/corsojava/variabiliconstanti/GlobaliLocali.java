package it.corsojava.variabiliconstanti;

public class GlobaliLocali {

	// nr � un membro di una classe e dunque una variabile "globale"
    // essa � "messa in ombra" (� celata) per� dalla variabile locale nr dichiarata nel
    // metodo foo e solo all'interno di tale metodo
    private int nr = 200;

    // args, l e zed sono tutte variabili locali visibili solo nel metodo main
    // e negli altri eventuali blocchi di codice annidati
	public static void main(String[] args) {

		// l � una variabile locale, perch� dichiarata nel metodo main
        // args � un parametro di un metodo e dunque una variabile locale
        int l = args.length;

        { // blocco di codice esplicito...

            // an_int � una variabile locale di un blocco di codice
            // � visibile solo in questo contesto oppure in altri
            // eventuali blocchi annidati
            int an_int = l; // Ok - l qui visibile e utilizzabile perch� la ricerca della
            // dichiarazione relativa parte dal punto di utilizzo verso
            // "l'alto" ossia dal blocco corrente verso gli eventuali blocchi
            // contenitori; infatti in main, blocco contenitore, � presente
            // la sua dichiarazione
        }

        // ERRORE - an_int � utilizzabile solo nel suo blocco di codice
        int zed = an_int; // error: cannot find symbol
    }

    private void foo()
    {
        int nr = 100;

        // usa la variabile nr dichiarata localmente
        System.out.printf("nr = %d%n", nr); // nr = 100
    }

    private void bar()
    {
        // usa la variabile nr dichiarata "globalmente" perch� �
        // visibile in tutto il corpo della classe e in questo
        // metodo non � nascosta da nessun'altra variabile con
        // lo stesso nome
        System.out.printf("nr = %d%n", nr); // nr = 200
    }

    private void baz()
    {
        // dichiarazione di una variabile locale di tipo int denominata x
    	int x = 20;

        // blocco di codice annidato
        {
            // dichiarazione di una variabile locale di tipo int denominata x
            int x = 11; // error: variable x is already defined in method baz()
        }
	}

}
