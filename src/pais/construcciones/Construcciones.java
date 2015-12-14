package pais.construcciones;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import pais.TipoRecurso;
import pais.TipoRecurso;
import politicos.Politico;

public class Construcciones {
	
	//[TiposConstruccion]
	private Politico politicoAlojado[];
	private static final int multiplicadorCoste[] = {3,3,5,3,3,5,3,4};
        private static final int multiplicadorProduccion[] =  {2,2,4,2,3,4,2,3};
	private int nivel[];
	
	//[TiposConstruccion][TipoRecurso]
	private int coste[][];
	private int produccion_hora[][];
	
	
	
	/**
	 *  Crea una construccion desde cero
	 * @param nombre
	 * @param rec
	 */
	public Construcciones(){
            for(int i=0; i<TipoConstruccion.getNum();i++){
                this.nivel[i]=1;
                this.politicoAlojado=null;
                for(int j=0;j<TipoRecurso.getNumTipoRecursos();j++){
                    this.coste[i][j]=1;
                    this.produccion_hora[i][j]=1;   
                }
            }
	}
     
        /**
         * Sustituye el político alojado
         * @param newPolitico el nuevo político
         * @param t el tipo de construcción en el que se le aloja
         */
	public void setPolitico(Politico newPolitico, TipoConstruccion t){
		this.politicoAlojado[TipoConstruccion.getIndex(t)] = newPolitico;
	}
	/**
         * Devuelve el político alojado
         * @param t el edificio del que se quiere obtener el político
         * @return el político alojado
         */
	public Politico getPolitico(TipoConstruccion t){
		return this.politicoAlojado[TipoConstruccion.getIndex(t)];
	}
	/**
         * Toma una construcción, comprueba si hay recursos, si los hay sube el nivel,
         * multiplica los costes y la producción
         * @param t el tipo de construcción
         * @param r los recursos del país
         * @return true si se lleva a cabo y false en caso contrario
         */
        public boolean subeNivel(TipoConstruccion t, pais.Recursos r){
            
            int idxConstruccion = TipoConstruccion.getIndex(t);
            // Comprueba si hay recursos
            for (int i =0;i<TipoRecurso.getNumTipoRecursos();i++)
               if(this.coste[idxConstruccion][i]>r.getRecurso(i))
                   return false;
            
            // Gastar recursos
            for(int i =0; i<TipoRecurso.getNumTipoRecursos();i++){
                try {
                    int idxRecurso =r.getRecurso(i);
                    if (r.getRecurso(i) < coste[idxConstruccion][idxRecurso]){
                        return false;
                    }
                    if(TipoRecurso.seGasta(i)){
                        r.sumaRecurso(TipoRecurso.getRecurso(i), (-1*coste[idxConstruccion][idxRecurso]));
                    }
                    
                } catch (IOException ex) {
                    Logger.getLogger(Construcciones.class.getName()).log(Level.SEVERE, null, ex);
                    return false;
                }
            }
            //subir nivel
            this.nivel[idxConstruccion]++;
            //Multiplicador de coste
            for(int i =0; i<TipoRecurso.getNumTipoRecursos();i++){
                this.coste[idxConstruccion][i]*=multiplicadorCoste[idxConstruccion];
            }
            
            //Multiplicador de producción
            for(int i =0;i<TipoRecurso.getNumTipoRecursos();i++){
                this.produccion_hora[idxConstruccion][i]*=multiplicadorProduccion[i];
            }
            return true;            
        }
}
