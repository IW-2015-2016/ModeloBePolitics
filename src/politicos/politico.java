package politicos;

import modificadores.ModificadorProduccion;

/**
 * Esta clase representa un pol�tico. 
 * @author Ismael
 *
 */
public class Politico {
	//Orden: {HONESTIDAD,CARISMA,ELOCUENCIA,POPULARIDAD}
	private int stats[];
	private String nombre;
	private String cita;
	private ModificadorProduccion modificador;
	
	
	/*********************/
	/****CONSTRUCTORES****/
	/*********************/
	
	/**
	 * Constructor con todos los par�metros
	 * @param nombre el nombre
	 * @param honestidad honestidad del 0 al 100
	 * @param carisma carisma del 0 al 100
	 * @param elocuencia elocuencia del 0 al 100
	 * @param popularidad apoyo popular del 0 al 100
	 * @param quote algo c�lebre dicho por el pol�tico
	 * @param mod un modificador que ser� clonado para evitar errores de modificacion indeseables.
	 * @throws ExceptionPolitico Lanza exception cuando los valores no est�n en el intervalo cerrado [0,100]
	 */
	public Politico(String nombre, int honestidad, int carisma, int elocuencia, int popularidad, String quote, ModificadorProduccion mod) throws ExceptionPolitico{
		this.setNombre(nombre);
		int i=0;
		this.getStats()[i++] = honestidad;
		this.getStats()[i++] = carisma;
		this.getStats()[i++] = elocuencia;
		this.getStats()[i++] = popularidad;
		this.modificador =  mod.clone();
		this.setCita(quote);
		
		for(i=0; i < StatsPolitico.getNumStats(); i++)
			if(this.stats[i]< 0 || this.stats[i]>100)
				throw new ExceptionPolitico();
	}
		/**
		 * Constructor con todos los par�metros menos el modificador de produccion
		 * @param nombre el nombre
		 * @param honestidad honestidad del 0 al 100
		 * @param carisma carisma del 0 al 100
		 * @param elocuencia elocuencia del 0 al 100
		 * @param popularidad apoyo popular del 0 al 100
		 * @param quote algo c�lebre dicho por el pol�tico
		 * @throws ExceptionPolitico Lanza exception cuando los valores no est�n en el intervalo cerrado [0,100]
		 */
		public Politico(String nombre, int honestidad, int carisma, int elocuencia, int popularidad, String quote) throws ExceptionPolitico{
			this.setNombre(nombre);
			int i=0;
			this.getStats()[i++] = honestidad;
			this.getStats()[i++] = carisma;
			this.getStats()[i++] = elocuencia;
			this.getStats()[i++] = popularidad;
			this.setCita(quote);
			
			for(i=0; i < StatsPolitico.getNumStats(); i++)
				if(this.stats[i]< 0 || this.stats[i]>100)
					throw new ExceptionPolitico();
		}

		/**
		 * Constructor con todos los par�metros menos la cita y el modificador de producci�n
		 * @param nombre el nombre
		 * @param honestidad honestidad del 0 al 100
		 * @param carisma carisma del 0 al 100
		 * @param elocuencia elocuencia del 0 al 100
		 * @param popularidad apoyo popular del 0 al 100
		 * @throws ExceptionPolitico Lanza exception cuando los valores no est�n en el intervalo cerrado [0,100]
		 */
		public Politico(String nombre, int honestidad, int carisma, int elocuencia, int popularidad) throws ExceptionPolitico{
			this.setNombre(nombre);
			int i=0;
			this.getStats()[i++] = honestidad;
			this.getStats()[i++] = carisma;
			this.getStats()[i++] = elocuencia;
			this.getStats()[i++] = popularidad;
			
			for(i=0; i < StatsPolitico.getNumStats(); i++)
				if(this.stats[i]< 0 || this.stats[i]>100)
					throw new ExceptionPolitico();
		}
		/**
		 * Constructor con todos los par�metros menos la cita
		 * @param nombre el nombre
		 * @param honestidad honestidad del 0 al 100
		 * @param carisma carisma del 0 al 100
		 * @param elocuencia elocuencia del 0 al 100
		 * @param popularidad apoyo popular del 0 al 100
		 * @throws ExceptionPolitico Lanza exception cuando los valores no est�n en el intervalo cerrado [0,100]
		 */
		public Politico(String nombre, int honestidad, int carisma, int elocuencia, int popularidad, ModificadorProduccion mod) throws ExceptionPolitico{
			this.setNombre(nombre);
			int i=0;
			this.getStats()[i++] = honestidad;
			this.getStats()[i++] = carisma;
			this.getStats()[i++] = elocuencia;
			this.getStats()[i++] = popularidad;
			this.modificador =  mod.clone();
			
			for(i=0; i < StatsPolitico.getNumStats(); i++)
				if(this.stats[i]< 0 || this.stats[i]>100)
					throw new ExceptionPolitico();
		}
		
		/*******************************************/
		/*********Fin de los constructores**********/
		/*******************************************/
		
		
		
	
		/**********************************/
		/********Getters y setters*********/
		/**********************************/
		
		
		/**
		 * Establece un stat s�lamente, indicado por "tipo", el valor debe estar entre 0 y 100 o el cambio no se efectuar� y
		 * ser� lanzada una excepci�n
		 * @param tipo el tipo de stat
		 * @param valor el valor, debe estar entre 0 y 100
		 * @return true si se ha realizado, false en caso contrario
		 * @throws ExceptionPolitico lanza una excepci�n si el valor es menos que 0 o mayor que 100 
		 */
		public void setSingleStat(StatsPolitico tipo, int valor) throws ExceptionPolitico{
			if(valor< 0 || valor>100)
				throw new ExceptionPolitico();
			
			switch(tipo){
			case HONESTIDAD:
				this.stats[0] = valor;
				break;
			case CARISMA:
				this.stats[1] = valor;
				break;
			case ELOCUENCIA:
				this.stats[2] = valor;
				break;
			case POPULARIDAD:
				this.stats[3] = valor;
				break;
			}
		}
		
		public int getSingleStat(StatsPolitico tipo){
			int ret=-1;
			
			switch(tipo){
				case HONESTIDAD:
					ret = this.stats[0];
					break;
				case CARISMA:
					ret = this.stats[1];
					break;
				case ELOCUENCIA:
					ret = this.stats[2];
					break;
				case POPULARIDAD:
					ret = this.stats[3];
					break;
			}
			
			return ret;
		}
		
		public ModificadorProduccion getModificador(){
			return this.modificador;
		}
		
		public void setModificadorProduccion(ModificadorProduccion mod){
			this.modificador = mod;
		}
		
		public void setCita(String cita){
			this.cita=cita;
		}
		
		public String getCita(){
			return this.cita;
		}

		
		
		private int[] getStats() {
			return stats;
		}

		private void setStats(int stats[]) {
			try {
				
			for(int i=0; i < StatsPolitico.getNumStats(); i++)
				if(stats[i]< 0 || stats[i]>100)
						throw new ExceptionPolitico();
						
				this.stats = stats;
				
			} catch (ExceptionPolitico e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
					
			
		}

		private String getNombre() {
			return nombre;
		}

		private void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
}