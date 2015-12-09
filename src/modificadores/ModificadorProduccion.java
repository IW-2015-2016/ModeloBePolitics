package modificadores;

import pais.TipoRecurso;

public class ModificadorProduccion {
	private TipoRecurso tipo;
	private int porcentaje;
	private String titulo;
	private String descripcion;
	/**
	 * Crea un Modificador
	 * @param t el tipo de recurso
	 * @param porcent el porcentaje que modifica
	 * @param titulo el t�tulo del modificador
	 * @param descripcion la descripci�n del modificador
	 */
	public ModificadorProduccion(TipoRecurso t, int porcent, String titulo, String descripcion){
		this.porcentaje = porcent;
		if(porcent<-100 || porcent>100) 
			this.porcentaje = 0;
		this.titulo = titulo;
		this.descripcion = descripcion;
		
	}
}
