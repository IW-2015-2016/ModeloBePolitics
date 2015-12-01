package pais;

import java.util.Random;

/**
 * Los recursos van en este orden:
 * 
 * PIB,
 * APOYO_POPULAR,
 * ENERGIA,
 * POBLACION
 * 
 * @author Ismael
 *
 */
public class Recursos {
	private int resources[];
	private static final int minimo = 10;
	/**
	 * Inicializa los recursos al m�nimo
	 */
	public Recursos(){
		this.resources = new int[TipoRecurso.getNumTipoRecursos()];
		
		for(int i=0; i<TipoRecurso.getNumTipoRecursos();i++){
			this.resources[i] = minimo;
		}
	}
	
	
	
	
	/**
	 * Obtiene la cantidad de un recurso que tiene la clase
	 * @param r el recurso a obtener
	 * @return la cantidad de recurso que hay, -1 en caso de fallo
	 */
	public int getRecurso(TipoRecurso r){
		switch(r){
			case PIB:
				return this.resources[0];
			case APOYO_POPULAR:
				return this.resources[1];
			case ENERGIA:
				return this.resources[2];
			case POBLACION:
				return this.resources[3];
		}
		
		return -1;
		
	}
	public int getPIB(){
		return getRecurso(TipoRecurso.PIB);
	}
	public int getApoyo_Popular(){
		return getRecurso(TipoRecurso.APOYO_POPULAR);
	}
	public int getEnergia(){
		return getRecurso(TipoRecurso.ENERGIA);
	}
	public int getPoblacion(){
		return getRecurso(TipoRecurso.POBLACION);
	}
	
	
	/**
	 * Suma a un determinado recurso a una cantidad
	 * @param r
	 * @param cantidad
	 */
	public void sumaRecurso(TipoRecurso r, int cantidad){
		switch(r){
			case PIB:
				this.resources[0] +=cantidad;
			case APOYO_POPULAR:
				this.resources[1] +=cantidad;
			case ENERGIA:
				this.resources[2] +=cantidad;
			case POBLACION:
				this.resources[3] +=cantidad;
		}
	}
	
	
}
