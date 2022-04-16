package com.api.rest.microelectronica.exceptions.componentes.detalles;

public class ComponenteDetalleIdMismatchException extends RuntimeException{
	
	public ComponenteDetalleIdMismatchException() {

	}

	public ComponenteDetalleIdMismatchException(String msj) {
		super(msj);
	}

	public ComponenteDetalleIdMismatchException(Throwable cause) {
		super(cause);
	}

	public ComponenteDetalleIdMismatchException(String msj, Throwable cause) {
		super(msj, cause);
	}
	
	 public ComponenteDetalleIdMismatchException(String msj, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
	        super(msj, cause, enableSuppression, writableStackTrace);
	    }
	

}
