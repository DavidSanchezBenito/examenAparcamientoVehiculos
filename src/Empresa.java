
import java.util.*;

public class Empresa {

	private HashSet<Vehiculo> nave;
	private int capacidadMaxima;

	public Empresa(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
		this.nave = new HashSet<>();
	}

	public HashSet<Vehiculo> getNave() {
		return nave;
	}

	public void setNave(HashSet<Vehiculo> nave) {
		this.nave = nave;
	}

	public void aparca(Vehiculo v) throws Exception {

		if (this.nave.size() < capacidadMaxima) {

			this.nave.add(v);
		} else {
			throw new Exception("se ha superado la capacidad de la nave");
		}
	}

	public void aparca(HashSet<Vehiculo> vehiculos) throws Exception {
		for (Vehiculo v : vehiculos) {
			this.aparca(v);
		}
	}

	public HashSet<Vehiculo> nuevaNave(Combustible c) throws Exception {

		//almaceno los camiones q no tengan remolque
		HashSet<Vehiculo> nave = new HashSet();

		for (Vehiculo v : this.nave) {
			if (v instanceof Camion && v.getMotor().getCombustible().name().equals(c.name())) {
				Camion camion = (Camion) v;
				if (camion.getRemolque() == null) {
						
					nave.add(camion);
				}
			}
		}
		return nave;
	}

	public void eliminaByMatricula(String matricula) {

		Iterator<Vehiculo> it = nave.iterator();

		while (it.hasNext()) {
			Vehiculo v = it.next();
			if (v.getMatricula().equals(matricula)) {
				it.remove();
				// this.nave.remove(v);
			}
		}
	}

	public void elimina(String combustible) {

		Combustible c = Combustible.valueOf(combustible);
		Iterator<Vehiculo> it = nave.iterator();
		HashSet<Vehiculo> vehiculos = new HashSet<Vehiculo>();
		while (it.hasNext()) {
			Vehiculo v = it.next();

			if (v.getMotor().getCombustible().name().equals(c.name())) {
				vehiculos.add(v);

			}
		}
		for (Vehiculo vehiculo : vehiculos) {
			 this.nave.remove(vehiculo);
		}

	}

public void mostrarVehiculos() {
	for (Vehiculo vehiculo : nave) {
		System.out.println(vehiculo);
		
	}
}
}
