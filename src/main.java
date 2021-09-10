import java.util.HashSet;

//https://www.youtube.com/watch?v=5Xv_Fe4mtLY&list=PLaxZkGlLWHGXQ9MSswRu4pI3ROgt2qzcX&index=189
// 6-9-21 acabado el 10-9-21
public class main {

	public static void main(String[] args) {
	Motor motor1 = new Motor(200, 300, Combustible.ELECTRICO);
	Motor motor2 = new Motor(2000, 400, Combustible.DIESEL);
	Motor motor3 = new Motor(1000, 500, Combustible.GASOLINA);

	Coche coche1 = new Coche("2020AM", 2500.0, motor1, 5);
	Coche coche2 = new Coche("3020AM", 22000.50, motor2, 2);
	Coche coche3 = new Coche("4020AM", 32000.50, motor3, 1);
	Coche cocheCadena = new Coche("5010XA;50000.00;5000;500;GASOLINA;3");
	
	Remolque remolque1 = new Remolque(10,5.5);
	Remolque remolque2 = new Remolque(8,7);
	Remolque remolque3 = new Remolque(9,7);
	
	
	Camion camion1 = new Camion("0000XA", 6000.00, motor1, 5000, remolque1);
	Camion camion2 = new Camion("1000XA", 60000.63, motor2, 6, remolque2);
	Camion camion3 = new Camion("2000XA", 70000.63, motor3, 6, null);
		
	Empresa e = new Empresa(15);
	
	try {
		System.out.println("impuestos coche1:   " + coche1.impuestos());
		System.out.println("impuestos camion 1:  " + camion1.impuestos());
		
		
		e.aparca(coche1);
		HashSet <Vehiculo> vehiculos = new HashSet<>();
		vehiculos.add(coche2);
		vehiculos.add(coche3);
		vehiculos.add(cocheCadena);
		
		vehiculos.add(camion1);
		vehiculos.add(camion2);
		vehiculos.add(camion3);
		
		e.aparca(vehiculos);
		//e.elimina("ELECTRICO");
		e.eliminaByMatricula("2020AM");
		e.mostrarVehiculos();
		
		System.out.println(e.nuevaNave(Combustible.GASOLINA));
		
		
	} catch (Exception e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	}

}
