
public class Yate extends EmbarcacionAMotor {
	private int numCamarotes;

	public Yate(String matricula, double eslora, int anoF, Persona propietario, int potencia, int numCamarotes) {
		super(matricula, eslora, anoF, propietario, potencia);
		this.numCamarotes = numCamarotes;
	}
	
	public int getNumCamarotes() {
		return numCamarotes;
	}
	
	@Override
	public int getCoeficienteBernua() {
		int resultado = getPotencia() + numCamarotes;
		return resultado;
	}
}
