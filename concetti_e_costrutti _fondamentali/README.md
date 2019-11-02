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
