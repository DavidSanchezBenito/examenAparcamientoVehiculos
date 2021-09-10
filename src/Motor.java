	
public class Motor {

	private int potencia;
	private int cilindros;
	private Combustible combustible;
	


	
	public Motor(int potencia, int cilindros, Combustible combustible) throws IllegalArgumentException {
	
		if (potencia <=0)  {
			System.out.println("los datos introducidos para el motor son incorrectos");
			throw new IllegalArgumentException("Potencia no puede ser menor o igual a cero");
		}
		if (cilindros <=0)  {
			System.out.println("los datos introducidos para el motor son incorrectos");
			throw new IllegalArgumentException("Cilindros no puede ser menor o igual a cero");
		}
		if (combustible == null)  {
			System.out.println("los datos introducidos para el motor son incorrectos");
			throw new IllegalArgumentException("Combustible no puede ser nulo");
		}
	
		
		this.potencia = potencia;
		this.cilindros = cilindros;
		this.combustible = combustible;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getCilindros() {
		return cilindros;
	}

	public void setCilindros(int cilindros) {
		this.cilindros = cilindros;
	}

	public Combustible getCombustible() {
		return combustible;
	}

	public void setTipoCombustible(Combustible combustible) {
		this.combustible = combustible;
	}

	@Override
	public String toString() {
		return "potencia=" + potencia + ", cilindros=" + cilindros + ", Combustible=" + combustible
				+ ", ";
	}
	
	
	
	
}
