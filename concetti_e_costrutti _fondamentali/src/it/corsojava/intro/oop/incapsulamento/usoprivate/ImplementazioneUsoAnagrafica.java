package it.corsojava.intro.oop.incapsulamento.usoprivate;

public class ImplementazioneUsoAnagrafica {

	public static void main(String[] args) {
		
		Anagrafica anagrafica = new Anagrafica();
		anagrafica.setEta(33);
		anagrafica.setNome("Ivan");

		System.out.println(anagrafica.toString());
	}
}
