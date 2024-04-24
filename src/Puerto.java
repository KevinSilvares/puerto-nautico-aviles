import java.util.HashMap;

public class Puerto {
	private HashMap <Integer, Alquiler> amarres;

	public Puerto() {
		amarres = new HashMap<>();
		amarres.put(0, null);
		amarres.put(1, null);
		amarres.put(2, null);
		amarres.put(3, null);		
	}
	
	public double alquilarAmarre(int numDias, Barco barco) {
		double precio = -1;
		int i = 0;
		boolean alquilado = false;
		
		while(i < amarres.size() && !alquilado) {
			if(amarres.get(i) == null) {
				amarres.put(i, new Alquiler(numDias, barco));
				precio = amarres.get(i).getPrecio();
				alquilado = true;
			}
			i++;
		}

		return precio;
	}
	
	public double liquidarAlquilerAmarre(int numeroAmarre) {
		double precio = -1;
		
		if(numeroAmarre >= 0 && numeroAmarre <= 3 && amarres.get(numeroAmarre) != null) {
			precio = amarres.get(numeroAmarre).getPrecio();
			amarres.put(numeroAmarre, null);
		}
		
		return precio;
	}
	
	public void verEstadoAmarres() {
		int i = 0;
		
		while(i < amarres.size()) {
			System.out.println(amarres.get(i));
			i++;
		}
	}
}
