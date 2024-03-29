# Concetti e costrutti fondamentali

Java � un moderno linguaggio di programmazione **object-oriented**, questo linguaggio nasce con l�obiettivo di permettere agli sviluppatori di scrivere i programmi in Java una sola volta e con la certezza che sarebbe stato possibile eseguirli su tutti i dispositivi hardware dotati, di una **macchina virtuale** in grado di interpretare ed eseguire il bytecode.

> ---------------------N.B. da approfondire-----------------------

> utillizzo della memoria ( Bit, Byte ), e l' utilizzo della CPU. 

## Che cosa sono e Quali sono i Paradigmi di programmazione?
Un paradigma o stile di programmazione indica un determinato modello concettuale e metodologico, al quale fa riferimento un programmatore per progettare e scrivere un programma. 
Esistono diversi paradigmi ad esempio:
 - Paradigma Procedurale 
 - Paradigma Oggetti
 
### Paradigma Procedurale
Il paradigma procedurale � anche chiamato **Imperativo**,  perch� consente di costruire un programma indicando dei comandi (**assegna**, **chiama una procedura**, esegui un **loop** e cos� via) che indicano quali azioni si devono eseguire, in un certo ordine, per risolvere un determinato compito.
> I Linguaggi procedurali sono: FORTRAN, COBOL, Pascal, C, ....

### Paradigma ad Oggetti
Nella programmazione ad oggetti l'unita principale � l'oggetto oppure la classe, gli oggetti sono astrazionni virtuali degli oggetti reali.
I principi fondamentali di questo paradigma sono:
- **Incapsulamento** 
- **Ereditariet�**
- **Polimorfisfmo**

#### Incapulamento
L'incapsulamento � un meccanismo attraverso il quale i **dati** e il **codice** di un oggetto sono protetti da accessi arbitrari, grazie all'incapsulamento il codice di una classe risulta essere pi� robusto.
Per dati le **propriet� di un oggetto**, mentre codice o membri intendiamo i **metodi**. La protezione dell�accesso viene effettuata applicando ai membri della classe degli specificatori o modificatori di accesso, definibili come: 
- **pubblico** (public), con cui si consente l�accesso a un membro di una classe da parte dei metodi di altre classi; 
- **protetto** (protect), con cui si consente l�accesso a un membro di una classe solo da parte di metodi appartenenti alle sue classi derivate; 
- **privato** (private), con cui un membro di una classe non � accessibile n� da metodi di altre classi n� da quelli delle sue classi derivate, ma soltanto dai metodi della sua stessa classe.

In definitiva, l�incapsulamento si raggiunge rendendo gli attributi delle classi privati, cio� 
non modificabili dall�esterno e creando dei metodi pubblici da utilizzare per l�accesso ai dati. 
Questi metodi andranno a costituire l�interfaccia pubblica per l�accesso ai dati. 
I vantaggi legati a questo approccio sono: 
-  l�utente  della classe ha il vantaggio di chiamare  semplicemente il metodo per 
l�inserimento di un valore in un attributo ma non ha la necessit� di conoscere come 
una classe implementa quell�azione (information hiding) 
-  il programmatore ha il vantaggio di dover modificare solo il codice relativo 
all�interfaccia nel caso in cui si vogliano introdurre migliorie o apportare modifiche 
(dal punto di vista dell�utente non occorre modificare nulla in quanto l�utente 
continuer� ad usare la stessa interfaccia senza essere al corrente delle eventuali 
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

#### Ereditariet�
L' ereditariet� � un meccanismo attraverso il quale una classe pu� avere relazioni di ereditariet� nei confronti di altre classi. 
Per relazione di ereditariet� intendiamo una relazione gerarchica di parentela padre-figlio, dove una classe figlio (definita classe derivata o sottoclasse) 
deriva da una classe padre (definita classe base o superclasse) i metodi e le propriet� pubbliche e protette, e dove essa stessa ne definisce di proprie. 

Con l�ereditariet� si pu� costruire, di fatto, un modello orientato agli oggetti che in principio � generico e minimale (ha solo classi base) e poi, man mano che se ne presenta l�esigenza, pu� essere esteso attraverso la creazione di sottomodelli sempre pi� specializzati (ha anche classi derivate).

```sh
/**
 * Collo � la classe "base"
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
 * ColloInVendita � la classe "derivata"
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

Il Polimorfismo � un meccanismo attraverso il quale si pu� scrivere codice in modo generico ed estendibile 
grazie al potente concetto che una classe base pu� riferirsi a tutte le sue classi derivate cambiando, di fatto, la sua forma. 

Ci� si traduce, in pratica, nella possibilit� di assegnare a una variabile A (istanza di una classe base) il riferimento di una variabile 
B (istanza di una classe derivata da A) e, successivamente, riassegnare alla stessa variabile A il riferimento di una variabile C (istanza di un�altra classe derivata da A). 

La caratteristica appena indicata consentir�, attraverso il riferimento A, di invocare i metodi di A che B o C hanno ridefinito in modo specializzato, 
con la garanzia che il sistema di runtime del linguaggio di programmazione a oggetti sapr� sempre a quale classe derivata appartengono. 
La discriminazione automatica, effettuata dal sistema di runtime di un tale linguaggio, di quale oggetto (istanza di una classe derivata) � contenuto in una variabile (istanza di una classe base) � effettuata con un meccanismo definito dynamic binding (binding dinamico).

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

> Esempi di linguaggi che supportano il paradigma a oggetti sono: Java, C#, C++, JavaScript, Smalltalk, Python e cos� via.

### Da dove si inizia? 
Per poter programmare in Java � necessario scaricare il [JDK](https://www.oracle.com/technetwork/java/javase/downloads/jdk13-downloads-5672538.html). 
Dopo l�installazione del JDK avremo a disposizione tutti gli strumenti per compilare ed eseguire i programmi creati, incluse svariate librerie di classi dette API (Application Programming Interface).

Impostare le variabili di ambiente **PATH** e **JAVA_HOME**

- In Cerca cercate e selezionate: **Sistema (Pannello di controllo)**
- Fate clic sul collegamento **Impostazioni di sistema avanzate**.
- Fate clic su Variabili di ambiente. Nella sezione Variabili di sistema, trovate la variabile di ambiente **PATH** e selezionatela. 
- Fate clic su **Modifica**. Se la variabile di ambiente **PATH non esiste**, fate clic su **Nuovo**.
- Nella finestra Modifica variabile di sistema o Nuova variabile di sistema specificare il valore della variabile di ambiente PATH (Es. **C:\Program Files\Java\jdk-13\bin** ). 
- Allo stesso modo aggiungiamo una nuova variabile d'ambiente **JAVA_HOME** e impostiamo il suo valore (Es. **C:\Program Files\Java\jdk-13** ).  
  Fate clic su OK. Chiudere tutte le altre finestre facendo clic su OK.
- Riaprite la finestra del prompt dei comandi ed eseguite il codice Java

Nella cartella bin (C:\Program Files\Java\jdk-13\bin) troviamo i file utili per lo sviluppo come: 
- **javac.exe** (il compilatore dal codice sorgente Java in codice intermedio bytecode), 
- **java.exe** (il launcher di un�applicazione Java), 
- **jar.exe** (il gestore per file di archivi basati sul formato Java ARchive o JAR), 
- **javap.exe** (il disassemblatore di file .class) 
- e cos� via.

###  Come si esegue il nostro codice Java
Dopo aver scritto il programma con un IDE, vediamo come eseguirne la compilazione che, lo ricordiamo, � quel procedimento mediante il quale un compilatore Java 
legge un file sorgente (nel nostro caso FirstProgram.java) e lo trasforma in un file (per esempio FirstProgram.class) che conterr� le istruzioni (bytecode) 
proprie della Java Virtual Machine.

Prima di vedere come utilizzare manualmente un compilatore Java, verifichiamo che esso sia disponibile nel sistema; da una shell (bash, command prompt e cos� via) 
digitiamo, semplicemente, il comando **javac - version** e verifichiamo che appaiano, in output, le informazioni sull�attuale versione del compilatore in uso.

**Invocazione del comando di compilazione (GNU/Linux e macOS).**

$ javac -d $HOME/MY_JAVA_CLASSES FirstProgram.java

**Invocazione del comando di compilazione (Windows).**

C:\MY_JAVA_SOURCES> javac -d \MY_JAVA_CLASSES FirstProgram.java

Dopo la fase di compilazione possiamo avviare ed eseguire il file prodotto tramite il comando java.

**Avvio del programma (GNU/Linux e macOS).**

[thp@localhost MY_JAVA_CLASSES]$ java it.corsojava.primoprogramma.FirstProgram

**Avvio del programma (Windows).**

C:\MY_JAVA_CLASSES> java it.corsojava.intro.primoprogramma.FirstProgram

In breve, il comando java lancia un�applicazione Java (legge il relativo file .class).


> ###Prima di iniziare a scrivere del codice bisogna:
> - Analisi. Questa � la fase dove bisogna recuperare delle informazioni preliminari allo sviluppo di un software, le quali possono riguardare la sua fattibilit� in senso tecnico ed economico (analisi costi/benefici), il suo dominio applicativo, i suoi requisiti funzionali (cosa il software deve offrire) e cos� via. 
> - Progettazione. In questa fase si inizia a ideare in modo pi� concreto come si pu� sviluppare il software che � stato oggetto della precedente analisi. In pratica il software viene scomposto in moduli e componenti e si definisce la loro interazione e anche il loro contenuto (dettaglio interno). La progettazione indica, pertanto, come il software deve essere implementato piuttosto di cosa deve fare il software (appannaggio della fase di analisi).
> - Codifica. Questa � la fase in cui si implementa concretamente il software oggetto della progettazione. In pratica, attraverso l�utilizzo di un editor di testo, si scrivono gli algoritmi, le funzionalit� e le istruzioni del programma codificate secondo la sintassi propria del linguaggio Java. Il codice scritto nell�editor � detto codice sorgente (source code), e il file prodotto � un file di codice sorgente (source code file).


### Variabili e Costanti cosa sono e come si usano.

#### Variabili
Una variabile rappresenta uno spazio di memoria alterabile, all�interno del quale vengono memorizzati dei valori. 
Per prima cosa � necessario dichiararne il tipo, cio� determinare che specie di dato potr� contenere. 

### Costanti 
Una costante rappresenta uno spazio di memoria a sola lettura (read-only), ossia una locazione di memoria nella quale 
� memorizzato un valore che non pu� pi� essere alterato dopo essere stato assegnato.

## Tipi di dato fondamentali o primitivi
In Java i tipi di dato fondamentali sono:
- **char** consente di memorizzare singoli caratteri 
- **int** consente di memorizzare numeri interi
- **float** e double consentono di memorizzare numeri decimali
- **boolean** consente di memorizzare i valori booleani false e true
- i tipi **byte**, **short** e **long** consentono di memorizzare numeri interi, ma con intervalli di valori pi� piccoli o pi� grandi rispetto al tipo int.

## Tipi di dato Wrapper class
Ogni tipo di dato fondamentale ha un corrispettivo Wrapper Class qui oltre a fornire il valore offrono appositi costruttori, metodi e costanti.
- **Char** consente di memorizzare singoli caratteri 
- **Integer** consente di memorizzare numeri interi
- **Float** e double consentono di memorizzare numeri decimali
- **Boolean** consente di memorizzare i valori booleani false e true
- i tipi **Byte**, **Short** e **Long** consentono di memorizzare numeri interi, ma con intervalli di valori pi� piccoli o pi� grandi rispetto al tipo int.

## Variabili locali e Variabili globali
In Java una variabile pu� essere definita come locale o come �globale�. 
Una variabile � locale quando il suo nome, � usabile solo all�interno del blocco di codice in cui � dichiarata. 

I membri di una classe, tipo le variabili di istanza, sono, variabili �globali� e sono utilizzabili ovunque all�interno di tale classe.

