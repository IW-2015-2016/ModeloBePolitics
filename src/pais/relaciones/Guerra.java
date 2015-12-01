package pais.relaciones;

import java.io.IOException;
import java.util.ArrayList;

import pais.Pais;

public class Guerra {
	
	private ArrayList<Pais> paises;
	private Pais propietario;
	/**
	 * Se debe entregar el país al que pertenece la alianza
	 * 
	 * @param pais el pais que posee la lista de alianzas
	 * @throws IOException si el país está vacío
	 */
	public Guerra(Pais pais) throws IOException{
		this.paises = new ArrayList<Pais>();
		if (pais == null) throw new IOException();
		this.propietario = pais;
		
	}
	/**
	 * Devuelve el nombre del pais que tiene guardada esta lista de aliados
	 * @return el nombre de quien tiene la lista de aliado
	 */
	public String propietario(){
		return this.propietario.getNombre();
	}
	/**
	 * Entra en guerra con un pais. Si el pais ya estaba en guerra devolverá falso, si p es null, lanzará una excepción
	 * 
	 * @param p
	 * @return
	 * @throws IOException 
	 */
	public boolean entrarEnGuerra(Pais p) throws IOException{
		if(p==null) throw new IOException();
		if (this.paises.contains(p)) return false;
		return this.paises.add(p);
	}
	/**
	 * Acaba una guerra
	 * @param p el país con el que se quiere terminar la guerra
	 * @return true si se acaba la guerra, false si no existe o no se puede borrar
	 */
	public boolean acabaGuerra(Pais p){
		if(!this.paises.contains(p)){
			return false;
		}
		if(this.paises.remove(p)){
			//TODO añadir a los paises eventos de eliminación de la alianza en tiempo x
			
			return true;
		}
		return false;
	}
	/**
	 * Comprueba si un país está en guerra con este
	 * @param p el país
	 * @return true si es enemigo, false en caso contrario
	 */
	public boolean esEnemigo(Pais p){
		return this.paises.contains(p);
	}
}
