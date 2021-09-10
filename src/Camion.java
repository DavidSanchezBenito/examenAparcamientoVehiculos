
public class Camion extends Vehiculo {

	private double peso;
	private Remolque remolque;

	public Camion(String matricula, double precio, Motor motor, double peso, Remolque remolque) {
		super(matricula, precio, motor);
		this.peso = peso;
		this.remolque = remolque;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public Remolque getRemolque() {
		return remolque;
	}

	public void setRemolque(Remolque remolque) {
		this.remolque = remolque;
	}

	public double calculoCargaMaxima() {

		if (this.remolque != null) {
			return remolque.getCargaMaxima();
		}
		return 0;
	}

	public double calculoPeso() {
		if (this.remolque != null) {
			return this.peso + remolque.getPeso();
		}
		return this.peso;

	}

	public double impuestos() {
		Combustible [] combustibles = Combustible.values(); //almaceno los valores del precio del combustible
	
		double porcentajeCombustible=0;

		double impuestoTotal =0;
		boolean booleanEncontrado = false;
		for (int i =0; i<combustibles.length && !booleanEncontrado; i++) {
			
			if (combustibles[i].name().equals(super.getMotor().getCombustible().name())) {
				
					porcentajeCombustible = PORCENTAJES_PRECIOS[i];
				
					booleanEncontrado = true;
				}
						
			}
		double porcentajePotencia = (this.getMotor().getPotencia()/100)*0.2;
		double taxRemolque = (this.calculoCargaMaxima()/1000)*0.1;
			
		

	return porcentajeCombustible + porcentajePotencia + taxRemolque;
}

	@Override
	public String toString() {
		return  super.toString() + "CAMION   peso=" + peso + ", remolque=" + remolque + "]";
	}
	

}
