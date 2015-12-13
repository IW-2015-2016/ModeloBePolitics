package pais.construcciones;

import politicos.Politico;

public class Construcciones {
	
	//[TiposConstruccion]
	private Politico politicoAlojado[];
	private int multiplicadorCoste[];
	
	
	//[TiposConstruccion][TipoRecurso]
	private int coste[][];
	private int produccion_hora[][];
	private int nivel[];
	
	
	/**
	 * 
	 * @param nombre
	 * @param rec
	 */
	public Construcciones(){
		
	}

	public void setPolitico(Politico newPolitico, TipoConstruccion t){
		this.politicoAlojado[TipoConstruccion.getIndex(t)] = newPolitico;
	}
	
	public Politico getPolitico(TipoConstruccion t){
		return this.politicoAlojado[TipoConstruccion.getIndex(t)];
	}
	
}
