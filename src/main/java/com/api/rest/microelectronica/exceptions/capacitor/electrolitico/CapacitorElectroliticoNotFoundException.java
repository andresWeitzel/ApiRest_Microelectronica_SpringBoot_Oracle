package com.api.rest.microelectronica.exceptions.capacitor.electrolitico;

public class CapacitorElectroliticoNotFoundException extends RuntimeException{
	
	
	public CapacitorElectroliticoNotFoundException() {

	}

	public CapacitorElectroliticoNotFoundException(String msj) {
		super(msj);
	}

	public CapacitorElectroliticoNotFoundException(Throwable cause) {
		super(cause);
	}

	public CapacitorElectroliticoNotFoundException(String msj, Throwable cause) {
		super(msj, cause);
	}
	
	 public CapacitorElectroliticoNotFoundException(String msj, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
	        super(msj, cause, enableSuppression, writableStackTrace);
	    }
}
