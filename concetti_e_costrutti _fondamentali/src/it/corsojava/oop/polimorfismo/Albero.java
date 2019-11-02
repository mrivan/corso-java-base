package it.corsojava.oop.polimorfismo;

public class Albero {
	
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
