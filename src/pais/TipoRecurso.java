package pais;

import java.io.IOException;

/**
 * Indica los tipos de recurso que puede tener un pais, son en este orden:
 * 0 = PIB
 * 1 = APOYO_POPULAR
 * 2 = ENERGIA
 * 3 = POBLACION
 * 
 * Existen m�todos para obtener la cantidad de recursos y los �ndices de cada Tipo del enumerado. 
 * Tambi�n se puede obtener el enumerado por el �ndice.
 * 
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
	 * Devuelve el �ndice del tipo de recurso, siendo
	 * 0 = PIB
	 * 1 = APOYO_POPULAR
	 * 2 = ENERGIA
	 * 3 = POBLACION
	 * @param t un tipo de recurso
	 * @return un n�mero de 0 a TipoRecurso.getNumTipoRecursos() -1
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
        /**
         * Devuelve un recurso por el índice que tiene
         * @param idx el índice, debe estar entre 0 y TipoRecurso.getNumTipoRecursos()
         * @return el tipo de recurso si el índice es correcto, null en caso contrario
         */
        public static TipoRecurso getRecurso(int idx){
            TipoRecurso ret = null;
            if (idx >= 0 || idx < TipoRecurso.getNumTipoRecursos()){
                switch(idx){
                    case 0:
                        ret = PIB;
                        break;
                    case 1:
                        ret= APOYO_POPULAR;
                        break;    
                    case 2:
                        ret = ENERGIA;
                        break;
                    case 3:
                        ret = POBLACION;
                        break;
                }
            }
            return ret;
        }
        
        /**
         * Indica si al construir algo el recurso se gasta
         * @param t el tipo de recurso
         * @return true o false dependiendo de si se gasta
         */
        public static boolean seGasta(TipoRecurso t){
            boolean ret = false;
            
            switch(t){
                case PIB:
                    ret = true;
                    break;
                case APOYO_POPULAR:
                    ret= false;
                    break;    
                case ENERGIA:
                    ret = true;
                    break;
                case POBLACION:
                    ret = false;
                    break;
            }
            return ret;
        }
        /**
         * Devuelve true o false si se gasta el recurso al construir
         * @param idx el indice del recurso, debe estar entr 0 y TipoRecurso.getNumTipoRecursos()
         * @return true o false dependiendo de si se gasta
         * @throws IOException si idx es menor que 0 o mayor o igual que TipoRecurso.getNumTipoRecursos()
         */
        public static boolean seGasta(int idx) throws IOException{
            if (idx < 0 || idx >= TipoRecurso.getNumTipoRecursos()){
                throw new IOException("Error, el indice debe estar entre 0 y TipoRecurso.getNumTipoRecursos()");
            }
            
            return TipoRecurso.seGasta(TipoRecurso.getRecurso(idx));
        }
	
}
