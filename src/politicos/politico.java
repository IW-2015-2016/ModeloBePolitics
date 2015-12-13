package politicos;

public class Politico {
	private int stats[];
	private String nombre;
	private String cita;
	//{HONESTIDAD,CARISMA,ELOCUENCIA,POPULARIDAD}
		/**
		 * Constructor con todos los parámetros
		 * @param nombre el nombre
		 * @param honestidad honestidad del 0 al 100
		 * @param carisma carisma del 0 al 100
		 * @param elocuencia elocuencia del 0 al 100
		 * @param popularidad apoyo popular del 0 al 100
		 * @param quote algo célebre dicho por el político
		 * @throws ExceptionPolitico Lanza exception cuando los valores no están en el intervalo cerrado [0,100]
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
		 * Constructor con todos los parámetros menos la cita
		 * @param nombre el nombre
		 * @param honestidad honestidad del 0 al 100
		 * @param carisma carisma del 0 al 100
		 * @param elocuencia elocuencia del 0 al 100
		 * @param popularidad apoyo popular del 0 al 100
		 * @throws ExceptionPolitico Lanza exception cuando los valores no están en el intervalo cerrado [0,100]
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
			for(int i=0; i < StatsPolitico.getNumStats(); i++)
				if(stats[i]< 0 || stats[i]>100)
					throw new ExceptionPolitico();
			this.stats = stats;
		}

		private String getNombre() {
			return nombre;
		}

		private void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
}
