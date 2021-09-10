
public interface Movible extends Comparable<Movible> {
	
	//comparable: //https://www.youtube.com/watch?v=wboqZ2dPDtQ
	public final double PORCENTAJES_PRECIOS [] = {10.0, 5.5,3.2, 1.0, 0.0};
	
	//metodos consultores de la clase vehiculo	
	public String getMatricula();
	public double getPrecio();
	public Motor getMotor();
	

	public void setMatricula(String matricula);
	public void setPrecio(double precio);
	public void setMotor(Motor motor);

	public double valorImpuestos(); //es una interface y no desarrollamos el metodo
}

