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
	/**
	 * Devuelve el índice del tipo de recurso, siendo
	 * 0 = PIB
	 * 1 = APOYO_POPULAR
	 * 2 = ENERGIA
	 * 3 = POBLACION
	 * @param t un tipo de recurso
	 * @return un número de 0 a 4
	 */
	public static int getIndice(TipoRecurso t){
		int ret =-1;
		switch (t){
		case PIB:
			ret=0;
			break;
		case APOYO_POPULAR:
			ret=1;
			break;
		case ENERGIA:
			ret=2;
			break;
		case POBLACION:
			ret=3;
			break;
		}
		return ret;
	}
	
}
