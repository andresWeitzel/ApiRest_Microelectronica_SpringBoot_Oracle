package com.api.rest.microelectronica.exceptions.componentes.detalles;

public class ComponenteDetalleNotFoundException extends RuntimeException {
	
	public ComponenteDetalleNotFoundException() {

	}

	public ComponenteDetalleNotFoundException(String msj) {
		super(msj);
	}

	public ComponenteDetalleNotFoundException(Throwable cause) {
		super(cause);
	}

	public ComponenteDetalleNotFoundException(String msj, Throwable cause) {
		super(msj, cause);
	}
	
	 public ComponenteDetalleNotFoundException(String msj, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
	        super(msj, cause, enableSuppression, writableStackTrace);
	    }

}
