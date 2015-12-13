package pais.construcciones;

public enum TiposConstruccion {
	MINISTERIO_DE_INDUSTRIA,
	MINISTERIO_DE_EDUCACION,
	BOLSA_DE_VALORES,
	MINISTERIO_DE_ECONOMIA,
	MINISTERIO_DE_JUSTICIA,
	MINISTERIO_DE_SANIDAD,
	PROMOTORAS_INMOBILIARIAS,
	CONFERENCIA_EPISCOPAL;
	
	/**
	 * Devuelve el orden de 0 a 7 de los distintos tipos de construccion
	 * 0 = MINISTERIO_DE_INDUSTRIA,
	 * 1 = MINISTERIO_DE_EDUCACION,
	 * 2 = BOLSA_DE_VALORES,
	 * 3 = MINISTERIO_DE_ECONOMIA,
	 * 4 = MINISTERIO_DE_JUSTICIA,
	 * 5 = MINISTERIO_DE_SANIDAD,
	 * 6 = PROMOTORAS_INMOBILIARIAS,
	 * 7 = CONFERENCIA_EPISCOPAL
	 */
	public static int getOrden(TiposConstruccion t){
		int ret=-1;
		switch(t){
		case MINISTERIO_DE_INDUSTRIA:
			ret=0;
			break;
		case MINISTERIO_DE_EDUCACION:
			ret=1;
			break;
		case BOLSA_DE_VALORES:
			ret=2;
			break;
		case MINISTERIO_DE_ECONOMIA:
			ret=3;
			break;
		case MINISTERIO_DE_JUSTICIA:
			ret=4;
			break;
		case MINISTERIO_DE_SANIDAD:
			ret=5;
			break;
		case PROMOTORAS_INMOBILIARIAS:
			ret=6;
			break;
		case CONFERENCIA_EPISCOPAL:
			ret=6;
			break;
		}
		return ret;
	}
}
