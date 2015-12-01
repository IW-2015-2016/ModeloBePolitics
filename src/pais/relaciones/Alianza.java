package pais.relaciones;

import java.io.IOException;
import java.util.ArrayList;

import pais.Pais;

/**
 * Una alianza sera una lista de usuarios que se guardara en un usuario.
 * 
 * @author Ismael
 *
 */
public class Alianza {
	private ArrayList<Pais> paises;
	private Pais propietario;
	/**
	 * Se debe entregar el pais al que pertenece la alianza
	 * 
	 * @param pais el pais que posee la lista de alianzas
	 * @throws IOException si el pais esta� vacio
	 */
	public Alianza(Pais pais) throws IOException{
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
	 * Comienza una alianza con un pais. Si el pais ya estaba aliado devolvera false, si p es null, lanzara una excepcion
	 * 
	 * @param p
	 * @return
	 * @throws IOException 
	 */
	public boolean aliarse(Pais p) throws IOException{
		if(p==null) throw new IOException();
		if (this.paises.contains(p)) return false;
		return this.paises.add(p);
	}
	/**
	 * Elimina a un pais de la alianza
	 * @param p el pais con el que se quiere generar la alianza
	 * @return true si se rompe la alianza, false si no existe o no se puede borrar
	 */
	public boolean romperAlianza(Pais p){
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
	 * Comprueba si un pais es aliado.
	 * @param p el pais
	 * @return true si es aliado, false en caso contrario
	 */
	public boolean esAliado(Pais p){
		return this.paises.contains(p);
	}
			
	
}
