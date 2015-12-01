package pais.construcciones;

import pais.TipoRecurso;

public class Construccion {
	private String nombre;
	private TipoRecurso rec;
	private int nivel;
	private int produccion_hora;
	
	private int coste[][];
	
	
	private int multiplicadorProduccion=2;
	private int multiplicadorCoste=3;
	
	public Construccion(String nombre, TipoRecurso rec){
		this.nombre = nombre;
		this.rec = rec;
		this.nivel = 1;
		this.produccion_hora = 5;
		
	}
	
	
}
