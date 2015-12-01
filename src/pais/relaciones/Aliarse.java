package pais.relaciones;

public static class Aliarse {
	
	public static boolean Aliar(Pais p1, Pais p2)){
		
		if (p1.getAlianza().contains(p2)) return false;
		
		EventoAlianza p = new EventoAlianza(p2);
		
		EventoAlianza p2 = new EventoAlianza(p);
		
		
		
		
		
	}

}
