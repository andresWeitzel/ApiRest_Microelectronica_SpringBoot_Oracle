package com.api.rest.microelectronica.exceptions.capacitor.electrolitico;

public class CapacitorElectroliticoIdMismatchException extends RuntimeException{
	
	public CapacitorElectroliticoIdMismatchException() {

	}

	public CapacitorElectroliticoIdMismatchException(String msj) {
		super(msj);
	}

	public CapacitorElectroliticoIdMismatchException(Throwable cause) {
		super(cause);
	}

	public CapacitorElectroliticoIdMismatchException(String msj, Throwable cause) {
		super(msj, cause);
	}
	
	 public CapacitorElectroliticoIdMismatchException(String msj, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
	        super(msj, cause, enableSuppression, writableStackTrace);
	    }

}
