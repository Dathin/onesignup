package io.github.dathin.onesignup.model.exception;

import org.springframework.http.HttpStatus;

public class InvalidFieldsLengthException extends GenericException{
    public InvalidFieldsLengthException() {
        super("You need to specify at least 1 field and at maximum 25 fields", HttpStatus.BAD_REQUEST);
    }
}