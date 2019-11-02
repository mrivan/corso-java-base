package it.corsojava.oop.incapsulamento.usoprivate;

import java.io.Serializable;

/**
 * 
 * @author I.Verzilli
 * 
 * Questa classe è considerata mutabile perchè ogni proprietà della classe 
 * è modificabile attraverso l'utilizzo del metodo setXXX()
 * 
 * @N.B. Per rendere una classe immutabile basterebbe rimuovere tutti i set e 
 *       lasciare soltanto il costruttore  Anagrafica(String nome, int eta);
 *       
 */

public class Anagrafica implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String nome;
	private int eta;

	public Anagrafica() {
		super();
	}
	
	public Anagrafica(String nome, int eta) {
		super();
		this.nome = nome;
		this.eta = eta;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getEta() {
		return eta;
	}
	public void setEta(int eta) {
		this.eta = eta;
	}

	@Override
	public String toString() {
		return "Anagrafica [nome=" + nome + ", eta=" + eta + "]";
	}
}
