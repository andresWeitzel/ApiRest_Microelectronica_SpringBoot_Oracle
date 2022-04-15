package com.api.rest.microelectronica.exceptions;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.api.rest.microelectronica.exceptions.componentes.ComponenteNotFoundException;

@RestControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler({ComponenteNotFoundException.class})
    protected ResponseEntity<Object> handleNotFoundException(Exception ex, WebRequest request)
    {
        return handleExceptionInternal(ex, "Componente No Encontrado ",new HttpHeaders(), HttpStatus.NOT_FOUND, request);
    }
}