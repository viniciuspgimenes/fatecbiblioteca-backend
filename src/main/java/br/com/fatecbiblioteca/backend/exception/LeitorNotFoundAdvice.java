package br.com.fatecbiblioteca.backend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
class LeitorNotFoundAdvice {

    @ResponseBody
    @ExceptionHandler(LeitorNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String leitorNotFoundHandler(LeitorNotFoundException ex) {
        return ex.getMessage();
    }
}