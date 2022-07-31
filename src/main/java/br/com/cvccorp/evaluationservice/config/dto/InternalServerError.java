package br.com.cvccorp.evaluationservice.config.dto;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class InternalServerError extends Exception {
    private String message;
    public InternalServerError(String message) {
        super(message);
        this.message = message;
    }
}
