	
public class Vehiculo implements Movible {

	private String matricula;
	private double precio;
	private Motor motor;
	
	public Vehiculo(String matricula, double precio, Motor motor) throws IllegalArgumentException {
	
		if (matricula == null || matricula.isEmpty()){
			throw new IllegalArgumentException("matricula no valida");
			
		}
		if ( precio <0) {
			throw new IllegalArgumentException("precio no puede ser inferior a cero");
			
		}
		if (motor == null) {
			throw new IllegalArgumentException("motor no valido");
			
		}
		this.matricula = matricula;
		this.precio = precio;
		this.motor = motor;
	}

	@Override
	public int compareTo(Movible o) {    //para comparar q viene de mobile
		//https://www.youtube.com/watch?v=wboqZ2dPDtQ
		
		// El orden natural de los vehículos es por matrícula y
//		a igualdad de ésta, aunque no suceda, por potencia.
		if(matricula.compareTo(o.getMatricula())>0) {
				return -1;  //esto es como el primero
		}else if(matricula.compareTo(o.getMatricula())<0) {
			return 1;  //esto es al final
		}else { 
			if(this.motor.getPotencia() > o.getMotor().getPotencia()) {
				return -1;
			}else if (this.motor.getPotencia() < o.getMotor().getPotencia()) {
				return 1;
			}else {
				return 0; 
			}
		}
	}

	@Override
	public String getMatricula() {
		// TODO Auto-generated method stub
		return this.matricula;
	}

	@Override
	public double getPrecio() {
		// TODO Auto-generated method stub
		return this.precio;
	}



	public Motor getMotor() {
		return motor;
	}

	@Override
	public void setMatricula(String matricula) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPrecio(double precio) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setMotor(Motor motor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double valorImpuestos() {
		// TODO Auto-generated method stub
		return 0;  //de momento no se lo que hace
	}

	@Override
	public String toString() {
		return "matricula=" + matricula + ", precio=" + precio + ", motor=" + motor;
	}


		
	
}
