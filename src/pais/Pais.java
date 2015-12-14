package pais;

import java.util.ArrayList;

import politicos.Politico;
/**
 * Representa un país
 * 
 * @author Ismael
 */
public class Pais {
	private ArrayList<Politico> politicos;
	private Recursos recursos;
	private int id;
	private String nombre;
	
	
	
	
	/**
	 * Recibe un objeto y determina si es un país.
	 * 
	 * @param o Un objeto que compara si el recibido es el mismo país
	 * @return true si tienen el mismo ID
	 */
	public boolean equals(Object o){
		
		if(o.getClass()!=Pais.class) return false;
		
		if(this.id == ((Pais) o).id) return true;
		return false;
		
	}



	public String getNombre() {
		return nombre;
	}

}
