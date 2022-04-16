package com.api.rest.microelectronica.exceptions;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.api.rest.microelectronica.exceptions.capacitor.electrolitico.CapacitorElectroliticoNotFoundException;
import com.api.rest.microelectronica.exceptions.componentes.ComponenteNotFoundException;
import com.api.rest.microelectronica.exceptions.componentes.detalles.ComponenteDetalleNotFoundException;

@RestControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler({ComponenteNotFoundException.class})
    protected ResponseEntity<Object> ComponenteHandleNotFoundException(Exception ex, WebRequest request)
    {
        return handleExceptionInternal(ex, "Componente No Encontrado ",new HttpHeaders(), HttpStatus.NOT_FOUND, request);
    }
    
    @ExceptionHandler({ComponenteDetalleNotFoundException.class})
    protected ResponseEntity<Object> ComponenteDetalleHandleNotFoundException(Exception ex, WebRequest request)
    {
        return handleExceptionInternal(ex, "Componente Detalle No Encontrado ",new HttpHeaders(), HttpStatus.NOT_FOUND, request);
    }
    
    @ExceptionHandler({CapacitorElectroliticoNotFoundException.class})
    protected ResponseEntity<Object> CapacitorElectroliticoHandleNotFoundException(Exception ex, WebRequest request)
    {
        return handleExceptionInternal(ex, "Capacitor Electrolitico No Encontrado ",new HttpHeaders(), HttpStatus.NOT_FOUND, request);
    }
}