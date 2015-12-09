package politicos;

public class Politico {
	private int stats[];
	private String nombre;
	private String citaSemanal;
	//{HONESTIDAD,CARISMA,ELOCUENCIA,APOYO_POPULAR}
		
		public Politico(String nombre, int honestidad, int carisma, int elocuencia, int apoyo, String cita){
			this.nombre = nombre;
			int i=0;
			this.stats[i++] = honestidad;
			this.stats[i++] = carisma;
			this.stats[i++] = elocuencia;
			this.stats[i++] = apoyo;
			this.citaSemanal= cita;
		}
		
		public void setCita(String cita){
			this.citaSemanal=cita;
		}
		
		public String getCita(){
			return this.citaSemanal;
		}
		
}
