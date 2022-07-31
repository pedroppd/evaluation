package br.com.cvccorp.evaluationservice.config;

import br.com.cvccorp.evaluationservice.config.dto.InternalServerError;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ValidationExceptionHandler {

    @ExceptionHandler(InternalServerError.class)
    public ResponseEntity<String> handler(InternalServerError exception) {
        return ResponseEntity.internalServerError().body(exception.getMessage());
    }
}
