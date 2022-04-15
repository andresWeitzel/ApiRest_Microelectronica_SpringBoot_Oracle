package com.api.rest.microelectronica.exceptions.componentes;

public class ComponenteNotFoundException extends RuntimeException {

	public ComponenteNotFoundException() {

	}

	public ComponenteNotFoundException(String msj) {
		super(msj);
	}

	public ComponenteNotFoundException(Throwable cause) {
		super(cause);
	}

	public ComponenteNotFoundException(String msj, Throwable cause) {
		super(msj, cause);
	}
	
	 public ComponenteNotFoundException(String msj, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
	        super(msj, cause, enableSuppression, writableStackTrace);
	    }

}
