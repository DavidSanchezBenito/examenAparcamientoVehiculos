
public class Remolque {

	private double cargaMaxima; //el camion para transportar necesita un remolque
	private double peso;
	

	public Remolque(double cargaMaxima, double peso) {
	
		this.cargaMaxima = cargaMaxima;
		this.peso = peso;
	}


	public double getCargaMaxima() {
		return cargaMaxima;
	}


	public void setCargaMaxima(double cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	@Override
	public String toString() {
		return "Remolque [cargaMaxima=" + cargaMaxima + ", peso=" + peso + "]";
	}
	
	
	
}
