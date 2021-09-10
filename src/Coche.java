
public class Coche extends Vehiculo {

	private int numeroPlazas;


	public Coche(String matricula, double precio, Motor motor, int numeroPlazas)  {
		super(matricula, precio, motor);
		this.numeroPlazas = numeroPlazas;
	}

	public Coche(String matricula, double precio, int potencia, int cilindros, 
			Combustible combustible, int numeroPlazas)  {
		super(matricula, precio, new Motor(potencia, cilindros, combustible));
		this.numeroPlazas = numeroPlazas;
	}
	
	public Coche (String coche) {
		super(coche.split(";")[0],Double.parseDouble(coche.split(";")[1]), 
				new Motor(Integer.parseInt(coche.split(";")[2]),
						  Integer.parseInt(coche.split(";")[3]),
					      Combustible.valueOf(coche.split(";")[4])));
						
				this.numeroPlazas =  Integer.parseInt(coche.split(";")[5]);
					
		
	}
	
		

	public double impuestos() {
		Combustible [] combustibles = Combustible.values(); //almaceno los valores
		
		double porcentajeCombustible=0;
		boolean booleanEncontrado = false;
		for (int i =0; i<combustibles.length && !booleanEncontrado; i++) {
			
			if (combustibles[i].name().equals(super.getMotor().getCombustible().name())) {
				porcentajeCombustible = PORCENTAJES_PRECIOS[i];
				booleanEncontrado = true;
			}
		} 	
		double porcentajeNumPlazas = (double)this.numeroPlazas /100;
		return porcentajeCombustible + porcentajeNumPlazas;
	}

	public int getNumeroPlazas() {
		return numeroPlazas;
	}

	public void setNumeroPlazas(int numeroPlazas) {
		this.numeroPlazas = numeroPlazas;
	}

	public int compareTo(Movible o) {    //para comparar q viene de mobile
		int c = this.compareTo(o);
		if ( c != 0) {
			Coche coche = (Coche)o;
			if(this.numeroPlazas > coche.getNumeroPlazas()) {
				return -1;
			}else {
				return 1;
			}
		}
		return c;
		
		
	}

	@Override
	public String toString() {
		return super.toString() + "COCHE  numeroPlazas=" + numeroPlazas;
	}

 
 
}
