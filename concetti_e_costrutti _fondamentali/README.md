# Concetti e costrutti fondamentali

Java è un moderno linguaggio di programmazione **object-oriented**, questo linguaggio nasce con l’obiettivo di permettere agli sviluppatori di scrivere i programmi in Java una sola volta e con la certezza che sarebbe stato possibile eseguirli su tutti i dispositivi hardware dotati, di una **macchina virtuale** in grado di interpretare ed eseguire il bytecode.

> ---------------------N.B. da approfondire-----------------------

> utillizzo della memoria ( Bit, Byte ), e l' utilizzo della CPU. 

## Che cosa sono e Quali sono i Paradigmi di programmazione?
Un paradigma o stile di programmazione indica un determinato modello concettuale e metodologico, al quale fa riferimento un programmatore per progettare e scrivere un programma. 
Esistono diversi paradigmi ad esempio:
 - Paradigma Procedurale 
 - Paradigma Oggetti
 
### Paradigma Procedurale
Il paradigma procedurale è anche chiamato **Imperativo**,  perché consente di costruire un programma indicando dei comandi (**assegna**, **chiama una procedura**, esegui un **loop** e così via) che indicano quali azioni si devono eseguire, in un certo ordine, per risolvere un determinato compito.
> I Linguaggi procedurali sono: FORTRAN, COBOL, Pascal, C, ....

### Paradigma ad Oggetti
Nella programmazione ad oggetti l'unita principale è l'oggetto oppure la classe, gli oggetti sono astrazionni virtuali degli oggetti reali.
I principi fondamentali di questo paradigma sono:
- **Incapsulamento** 
- **Ereditarietà**
- **Polimorfisfmo**

#### Incapulamento
L'incapsulamento è un meccanismo attraverso il quale i **dati** e il **codice** di un oggetto sono protetti da accessi arbitrari, grazie all'incapsulamento il codice di una classe risulta essere più robusto.
Per dati le **proprietà di un oggetto**, mentre codice o membri intendiamo i **metodi**. La protezione dell’accesso viene effettuata applicando ai membri della classe degli specificatori o modificatori di accesso, definibili come: 
- **pubblico** (public), con cui si consente l’accesso a un membro di una classe da parte dei metodi di altre classi; 
- **protetto** (protect), con cui si consente l’accesso a un membro di una classe solo da parte di metodi appartenenti alle sue classi derivate; 
- **privato** (private), con cui un membro di una classe non è accessibile né da metodi di altre classi né da quelli delle sue classi derivate, ma soltanto dai metodi della sua stessa classe.

In definitiva, l’incapsulamento si raggiunge rendendo gli attributi delle classi privati, cioè 
non modificabili dall’esterno e creando dei metodi pubblici da utilizzare per l’accesso ai dati. 
Questi metodi andranno a costituire l’interfaccia pubblica per l’accesso ai dati. 
I vantaggi legati a questo approccio sono: 
-  l’utente  della classe ha il vantaggio di chiamare  semplicemente il metodo per 
l’inserimento di un valore in un attributo ma non ha la necessità di conoscere come 
una classe implementa quell’azione (information hiding) 
-  il programmatore ha il vantaggio di dover modificare solo il codice relativo 
all’interfaccia nel caso in cui si vogliano introdurre migliorie o apportare modifiche 
(dal punto di vista dell’utente non occorre modificare nulla in quanto l’utente 
continuerà ad usare la stessa interfaccia senza essere al corrente delle eventuali 
modifiche apportate)

**Ecco un esempio pratico** 

```sh
public class Anagrafica {
  private String nome;
  private int annoDiNascita;  
  
  public void setNome(String n) {
    nome=n;  	
  }
  public String getNome() {
    return nome;      
  }
  public void setAnnoDiNascita(int anno) {
    annoDiNascita=anno;
  }
  public int getAnnoDiNascita() {
    return annoDiNascita;
  }
}

-------------------------------------------------------

public class Implementazione {
  public static void Main(String args[]) {
    Anagrafica anagrafica = new Anagrafica();
    anagrafica.setNome("Matteo");
    anagrafica.setAnnoDiNascita(1987);
  }
}
```

#### Ereditarietà
L' ereditarietà è un meccanismo attraverso il quale una classe può avere relazioni di ereditarietà nei confronti di altre classi. 
Per relazione di ereditarietà intendiamo una relazione gerarchica di parentela padre-figlio, dove una classe figlio (definita classe derivata o sottoclasse) 
deriva da una classe padre (definita classe base o superclasse) i metodi e le proprietà pubbliche e protette, e dove essa stessa ne definisce di proprie. 

Con l’ereditarietà si può costruire, di fatto, un modello orientato agli oggetti che in principio è generico e minimale (ha solo classi base) e poi, man mano che se ne presenta l’esigenza, può essere esteso attraverso la creazione di sottomodelli sempre più specializzati (ha anche classi derivate).

```sh
/**
 * Collo è la classe "base"
 */
public class Collo {
	// dati
	private int x_size, y_size, z_size;
	protected int weight;
	// funzione getter di Weight
	public int getWeight() { return weight; }
	// Costruttore
	public Collo(int w, int xs, int ys, int zs) {
		this.weight = w;
		this.x_size = xs;
		this.y_size = ys;
		this.z_size = zs;
	}
	public int getVolume() {
		return x_size * y_size * z_size;
	}
}
/**
 * ColloInVendita è la classe "derivata"
 */
public class ColloInVendita extends Collo {
	// dati (oltre quelli di Collo)
	private int price;
	// coefficienti da applicare alla vendita
	private static final float A0 = 1;
	private static final float B0 = 1.2;
	private static final float C0 = 1.5;
	public int getPrice() {
		return price;
	}
	// Costruttore della classe derivata
	public ColloInVendita(int w, int xs, int ys, int zs, int price) {
		// richiama il costruttore della classe base
		super(w, xs, ys, zs);
		this.price = price;
	}
	public float getDeliveryCost() {
		return A0*weight + B0*getVolume() + C0*price;
	}
}
```

###Polimorfismo

Il Polimorfismo è un meccanismo attraverso il quale si può scrivere codice in modo generico ed estendibile 
grazie al potente concetto che una classe base può riferirsi a tutte le sue classi derivate cambiando, di fatto, la sua forma. 

Ciò si traduce, in pratica, nella possibilità di assegnare a una variabile A (istanza di una classe base) il riferimento di una variabile 
B (istanza di una classe derivata da A) e, successivamente, riassegnare alla stessa variabile A il riferimento di una variabile C (istanza di un’altra classe derivata da A). 

La caratteristica appena indicata consentirà, attraverso il riferimento A, di invocare i metodi di A che B o C hanno ridefinito in modo specializzato, 
con la garanzia che il sistema di runtime del linguaggio di programmazione a oggetti saprà sempre a quale classe derivata appartengono. 
La discriminazione automatica, effettuata dal sistema di runtime di un tale linguaggio, di quale oggetto (istanza di una classe derivata) è contenuto in una variabile (istanza di una classe base) è effettuata con un meccanismo definito dynamic binding (binding dinamico).

```sh
class Albero
{
    protected void cresce()
    {
        System.out.println("Metodo cresce della classe Albero");
    }
    public static void main(String args[])
    {
        Albero al = new Abete();
        al.cresce();
    }
}

class Abete extends Albero
{
    public void cresce()
    {
        System.out.println("Metodo cresce della classe Abete");
    }
}
```