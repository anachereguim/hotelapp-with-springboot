package com.pizza.hotel.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class PessoaNotFoundException extends EntityNotFoundException{

    public PessoaNotFoundException(String message) {super(message);}
}
