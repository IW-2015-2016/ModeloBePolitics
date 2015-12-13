package pais.construcciones;

import pais.TipoRecurso;
import politicos.Politico;

public class Construcciones {
	private String nombre;
	private TipoRecurso rec;
	private int nivel;
	private int produccion_hora;
	private Politico politicoAlojado;
	
	private int coste[][];
	
	
	private int multiplicadorProduccion=2;
	private int multiplicadorCoste=3;
	/**
	 * 
	 * @param nombre
	 * @param rec
	 */
	public Construcciones(String nombre, TipoRecurso rec){
		this.nombre = nombre;
		this.rec = rec;
		this.nivel = 1;
		this.produccion_hora = 5;
	}
	
	public Construcciones(String nombre, TipoRecurso rec, int multiplicadorProduccion, int multiplicadorCoste){
		this.nombre = nombre;
		this.rec = rec;
		this.nivel = 1;
		this.produccion_hora = 5;
		this.multiplicadorProduccion = multiplicadorProduccion;
		this.multiplicadorCoste = multiplicadorCoste;
	}
	
	public void setPolitico(Politico newPolitico){
		this.politicoAlojado = newPolitico;
	}
	
	public Politico getPolitico(){
		return this.politicoAlojado;
	}
	
}
