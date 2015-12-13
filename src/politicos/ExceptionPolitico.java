package politicos;

import java.io.IOException;

public class ExceptionPolitico extends IOException{
	/**
	 * Crea la excepcionPolitico con el mensaje:
	 * "Error al crear el político. Los valores asignados deben estar entre 0 y 100"
	 */
	public ExceptionPolitico(){
		super("Error al crear el político. Los valores asignados deben estar entre 0 y 100");
	}
	public ExceptionPolitico(String message){
		super(message);
	}
	public ExceptionPolitico(String message, Throwable cause){
		super(message, cause);
	}
	
	public String getMessage()
    {
        return super.getMessage();
    }
}
