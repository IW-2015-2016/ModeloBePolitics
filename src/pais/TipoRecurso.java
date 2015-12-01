package pais;
/**
 * Indica los tipos de recurso que puede tener un pais
 * @author Ismael
 *
 */
public enum TipoRecurso {
	PIB,
	APOYO_POPULAR,
	ENERGIA,
	POBLACION;
	
	/**
	 * Devuelve la cantidad de enumerados que hay 
	 * @return 4
	 */
	public static int getNumTipoRecursos(){ 
		return 4;
	}
	
}
