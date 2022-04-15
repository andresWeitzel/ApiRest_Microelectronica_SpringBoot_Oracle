package com.api.rest.microelectronica.exceptions.componentes;

public class ComponenteIdMismatchException extends RuntimeException{

	public ComponenteIdMismatchException() {

	}

	public ComponenteIdMismatchException(String msj) {
		super(msj);
	}

	public ComponenteIdMismatchException(Throwable cause) {
		super(cause);
	}

	public ComponenteIdMismatchException(String msj, Throwable cause) {
		super(msj, cause);
	}
	
	 public ComponenteIdMismatchException(String msj, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
	        super(msj, cause, enableSuppression, writableStackTrace);
	    }
	
}
