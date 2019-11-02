package it.corsojava.oop.ereditarieta;

/**
 * ColloInVendita è la classe "derivata"
 */
public class ColloInVendita extends Collo {
    
	// dati (oltre quelli di Collo)
    private int price;
  
    // coefficienti da applicare alla vendita
    private static final float A0 = 1;
    private static final float B0 = 1.2f;
    private static final float C0 = 1.5f;
    
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
    
    	return A0 * weight + B0 * getVolume() + C0 * price;
    }
}