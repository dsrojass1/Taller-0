package uniandes.dpoo.taller0.modificacion;

import java.io.FileNotFoundException;
import java.io.IOException;

import uniandes.dpoo.taller0.procesamiento.CalculadoraEstadisticas;
import uniandes.dpoo.taller0.procesamiento.LoaderOlimpicos;

public class Modificacion {
	
	private CalculadoraEstadisticas calculadora;
	
	public Modificacion() {
		try {
			calculadora = LoaderOlimpicos.cargarArchivo("./data/atletas.csv");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Hola, mundo!");
		Modificacion mod = new Modificacion();
		System.out.println(mod.calculadora.paisConMasMedallistas());
	}
}
