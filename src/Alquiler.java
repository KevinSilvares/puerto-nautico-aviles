
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
		precio = -1;
		if(barco instanceof Velero) {
			precio = (numeroDias * (barco.getEslora() * 10)) + (((Velero)barco).getNumeroMastiles() * 300);
		}
		else if(barco instanceof Yate) {
			precio = (numeroDias * (barco.getEslora() * 10)) + ((((Yate)barco).getPotencia() + ((Yate)barco).getNumCamarotes()) * 300);
		}
		else if(barco instanceof EmbarcacionAMotor){
			precio = (numeroDias * (barco.getEslora() * 10)) + (((EmbarcacionAMotor)barco).getPotencia() * 300);
		}
		
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
