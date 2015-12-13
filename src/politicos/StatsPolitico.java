package politicos;

public enum StatsPolitico {
	HONESTIDAD,CARISMA,ELOCUENCIA,POPULARIDAD;
	
	static int getNumStats(){ 
		return 4;
	}
	/**
	 * Devuelve el índice del parámetro, de 0 a 4, siendo
	 * 1 = HONESTIDAD
	 * 2 = CARISMA
	 * 3 = ELOCUENCIA
	 * 4 = POPULARIDAD
	 * 
	 * @param s el stat a comprobar
	 * @return un número de 0 a 4
	 */
	static int getIndex(StatsPolitico s){
		int ret =-1;
		switch(s){
		case HONESTIDAD:
			ret = 0;
			break;
		case CARISMA:
			ret = 1;
			break;
		case ELOCUENCIA:
			ret = 2;
			break;
		case POPULARIDAD:
			ret = 3;
			break;
		}
		return ret;
	}
}
