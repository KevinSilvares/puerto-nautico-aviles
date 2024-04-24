
public class Alquiler {
	private int numeroDias;
	private Barco barco;
	
	public Alquiler(int numDias, Barco barco) {
		numeroDias = numDias;
		this.barco = barco;
	}
	
	public Barco getBarco() {
		return barco;
	}
	
	public int getNumeroDias() {
		return numeroDias;
	}
	
	public double getPrecio() {
		double precio;
		precio = (numeroDias * (barco.getEslora() * 10)) + (barco.getCoeficienteBernua() * 300);
		return precio;
	}
	
	public String toString() {
		String resultado = "";
		
		resultado += numeroDias + "\n";
		resultado += barco.toString() + "\n";
		resultado += getPrecio() + "\n";
		
		return resultado;
	}
}
